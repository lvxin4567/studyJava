//package com.example.testandroid;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.os.Handler;
//import android.os.Message;
//import android.util.Log;
//import android.view.View;
//import android.widget.TextView;
//
//public class HandleActivity extends AppCompatActivity {
//    private static final String TAG = "HandleActivity";
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_handle);
//        final TextView textView = findViewById(R.id.textView3);
//        //创建Handle
//        final Handler handler = new Handler(){
//            @Override
//            public void handleMessage(@NonNull Message msg) {
//                super.handleMessage(msg);
//                Log.d(TAG ,"" + msg.what);
//                if(msg.what == 1001){
//                    textView.setText("i love you");
//                }
//            }
//        };
//
//        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //有可能要做大量耗时操作
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        //模拟下载
//                        try {
//                            Thread.sleep(2000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        //发送空消息
//                        //通知UI更新
//                        handler.sendEmptyMessage(1001);
//
//                        //打包
////                        Message message = Message.obtain();
////                        message.what = 1002;
////                        message.arg1 = 1003;
////                        message.arg2 = 1004;
////                        message.obj = HandleActivity.this;
////                        handler.sendMessage(message);
//
//                        //定时任务
////                        handler.sendEmptyMessageAtTime(1001 , SystemClock.uptimeMillis() + 3000);
////                        handler.sendEmptyMessageDelayed(1001 , 2000);
//                    }
//                }).start();
//            }
//        });
//
//    }
//}