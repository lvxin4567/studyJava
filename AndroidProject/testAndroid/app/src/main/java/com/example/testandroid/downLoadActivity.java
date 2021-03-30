package com.example.testandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
/**
 *使用Handler异步实现加载进度条
 *
 * */
public class downLoadActivity extends AppCompatActivity {
    private static final String TAG = "downLoadActivity";
    Handler mHandler = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_down_load);

        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);

        mHandler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                switch (msg.what){
                    case 10001:
                        progressBar.setProgress((Integer) msg.obj);
                        break;
                }
            }
        };

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downLoad("http://192.168.1.110:3000/movie/lena.mp4");
            }
        });
    }

    public void downLoad(final String downUrl){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL(downUrl);
                    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                    InputStream inputStream = urlConnection.getInputStream();
                    //判断是否有插入sd卡且有读写sd卡的能力
                    Boolean isExistSD = isExistSD();
                    Log.d(TAG , "isExistSD:" + isExistSD);
                    //获取文件的总长度
                    int contentLength = urlConnection.getContentLength();
                    Log.d(TAG , "文件长度:" + contentLength);
                    String downLoadFolderName = Environment.getExternalStorageDirectory()+ File.separator + "testdownload" + File.separator;
                    //创建File对象
                    File file = new File(downLoadFolderName);
//                    if(!file.exists()){
//                        //创建目录
//                        file.mkdir();
//                        Log.d(TAG , "创建目录:" + downLoadFolderName);
//                    }
                    if(file.exists()){
                        Log.d(TAG , "testdownload存在" );
                    }
                    File[] files = file.listFiles();
                    Log.d(TAG , "" + files);
                    //创建文件
                    String fileName = downLoadFolderName + "lena.mp4";
                    File apkFile =  new File(fileName);

                    int downloadSize = 0;
                    byte[] bytes = new byte[1024];
                    int length = 0;

                    //读文件
                    OutputStream outputStream = new FileOutputStream(fileName);
                    while ((length = inputStream.read(bytes)) != -1){
                        outputStream.write(bytes , 0 , length);
                        downloadSize += length;
                        /**
                         * update UI
                         * */
                        Message message = Message.obtain();
                        message.obj = downloadSize *100 / contentLength;
                        message.what = 10001;

                        mHandler.sendMessage(message);
                    }
                    inputStream.close();
                    outputStream.close();

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public boolean isExistSD(){
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
    }
}