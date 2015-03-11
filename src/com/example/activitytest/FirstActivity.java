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
		//���ø��෽��
		super.onCreate(savedInstanceState);
		//2.2.4 ���ر�����
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		//2.2.2 ���ز���
		setContentView(R.layout.fisrt_layout);
		
		Button button1 = (Button) findViewById(R.id.button_1);
		//�����ť����
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//2.2.5 ʹ��Toast ����
				//Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();
				//2.2.7 ����һ���
				//finish();
				//2.3 ʹ��Intent
				//2.3.1 ����ʾIntent
				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				//�����
				startActivity(intent);
			}
		});
	}
	
	//2.2.6 �ڻ��ʹ��Menu
	////a����д onCreateOptionsMenu ����
	public boolean onCreateOptionsMenu(Menu menu){
		//����ǰ������˵�
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	////b����д onOptionsItemSelectd ����
	//����˵���Ӧ�¼�
	public boolean onOptionsItemSelected(MenuItem item) {
		//item.getItemId() �жϵ��������һ���˵���
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
