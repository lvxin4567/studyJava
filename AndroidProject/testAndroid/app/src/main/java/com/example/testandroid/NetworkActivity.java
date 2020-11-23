package com.example.testandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkActivity extends AppCompatActivity {
    private static final String TAG = "NetworkActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);
        final TextView textView = findViewById(R.id.text);
        //http
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    URL url = new URL("http://192.168.1.110:8080/api/blog/list");
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                    //设置connection属性
                    connection.setConnectTimeout(30*1000);//设置超时时间
                    connection.setRequestMethod("GET"); //设置请求方法
                    connection.setRequestProperty("Content-Type","application/json");//希望拿到键值对  json格式的
                    connection.setRequestProperty("Charset","UTF-8");
                    connection.setRequestProperty("Accept-Charset","UTF-8");
                    connection.connect();

                    int responseCode = connection.getResponseCode();
                    String responseMessage = connection.getResponseMessage();
                    if(responseCode == HttpURLConnection.HTTP_OK){
                        InputStream inputStream = connection.getInputStream();
                        final String result = streamToString(inputStream);
                        System.out.println("result:"+ inputStream);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textView.setText(result);
                            }
                        });
                    }

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }

    /**
     * 将输入流转成字符串
     * @param is 从网络获取的输入流
     * @return 字符串
     * */
    public String streamToString(InputStream is) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1){
            outputStream.write(buffer , 0 , len);
        }
        outputStream.close();
        is.close();
        byte[] byteArray = outputStream.toByteArray();
        return new String(byteArray);
     }
}