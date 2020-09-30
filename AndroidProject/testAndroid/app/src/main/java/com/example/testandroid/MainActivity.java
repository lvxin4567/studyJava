package com.example.testandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

/**
 *android四大组件:1.Activity 2.Service  3.BroadcastReceiver 4.
 * --------------------------Activity之间的跳转-------------------
 * Intent intent = new Intent(activity1 , activity2)
 * startActivity(intent)
 * --------------------------Activity四中启动方式-------------------
 * 1.standard  标准stack模式  ABC入C --> ABCC
 * 2.singleTop  顶部只有一个  ABC入B --> ABCB  ABC入C --> ABC
 * 3.singleTask 只有一个  ABC入B --> AB 会把B之前的清除掉
 * 4.singleInstance 会重新开一个stack  单独存储活动
 * -------------------------Activity生命周期-------------------
 * onCreate  创建好
 * onStart
 * onResume  可以交互了
 * onPause   被另一个activity盖住(部分的)
 * onStop    被另一个activity盖住(完全的)
 * onDestroy 退出进程
 * -----------------------Activity之间的数据传输-------------------
 * 创建intent Intent intent = new Intent(activity1 , activity2)
 * 在第一个传输
 * 1.intent.putExtra(key , value)
 * 2.Bundle bundle = new Bundle();
 *   bundle.putString(key , value);
 *   intent puExtra(key , bundle);
 * 3.序列化对象
 * 在第二个接收 getIntent().getStringExtra(key)
 *
 * 从第二个activity回到第一个activity
 * startActivityForResult(intent)
 * setResult(RESULT_OK);
 * onActivityResult(int requestCode ,int resultCode , Intent data);
 * -----------------------Fragment-------------
 * */