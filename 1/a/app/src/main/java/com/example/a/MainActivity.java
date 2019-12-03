package com.example.a;
import androidx.appcompat.app.AppCompatActivity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.example.jph.restart01.R;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void jumpB(View view){
        //显式Intent
        Intent intent=new Intent();
        //设置要跳转的组件的名字
        ComponentName componentName=new ComponentName(this,BActivity.class);
        intent.setComponent(componentName);
        startActivity(intent);

        //隐式Intent
    }

    public void callPhone(View view){
        Intent intent=new Intent();
        //跳到一个视图
        intent.setAction(Intent.ACTION_VIEW);
        //指定数据
        intent.setData(Uri.parse("tel:13539407043"));
        startActivity(intent);
    }

    public void baidu(View view){
        Intent intent=new Intent();
        //跳一个系统的视图
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.baidu.com"));
        startActivity(intent);
    }

}
