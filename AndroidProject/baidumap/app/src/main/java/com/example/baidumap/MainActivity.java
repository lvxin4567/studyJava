package com.example.baidumap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;

public class MainActivity extends AppCompatActivity {
    private MapView mMapView = null;
    private BaiduMap baiduMap = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取地图控件引用
        mMapView = (MapView) findViewById(R.id.bmapView);
        //获取百度地图对象
        baiduMap = mMapView.getMap();
    }
    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
        mMapView.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
        mMapView.onPause();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        mMapView.onDestroy();
    }

    private static final int ITEM_ID_NORMAL_MAP = 101;
    private static final int ITEM_ID_SATELLITE_MAP = 102;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE , 101,0,"切换为普通地图");
        menu.add(Menu.NONE , 102,0,"切换为卫星地图");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case ITEM_ID_NORMAL_MAP:
                baiduMap.setMapType(BaiduMap.MAP_TYPE_NORMAL);
                break;
            case ITEM_ID_SATELLITE_MAP:
                baiduMap.setMapType(BaiduMap.MAP_TYPE_SATELLITE);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}