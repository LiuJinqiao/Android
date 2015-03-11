package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {
	
	protected void onCreate(Bundle savedInstanceState){
		//调用父类方法
		super.onCreate(savedInstanceState);
		//2.2.4 隐藏标题栏
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		//2.2.2 加载布局
		setContentView(R.layout.fisrt_layout);
		
		Button button1 = (Button) findViewById(R.id.button_1);
		//点击按钮操作
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//2.2.5 使用Toast 提醒
				//Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();
				//2.2.7 销毁一个活动
				//finish();
				//2.3 使用Intent
				//2.3.1 用显示Intent
				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				//启动活动
				startActivity(intent);
			}
		});
	}
	
	//2.2.6 在活动中使用Menu
	////a、重写 onCreateOptionsMenu 方法
	public boolean onCreateOptionsMenu(Menu menu){
		//给当前活动创建菜单
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	////b、重写 onOptionsItemSelectd 方法
	//定义菜单相应事件
	public boolean onOptionsItemSelected(MenuItem item) {
		//item.getItemId() 判断点击的是哪一个菜单项
		switch (item.getItemId()) {
		case R.id.add_item :
			Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item :
			Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
			break;
		default:
		}
		return true;
	}

}
