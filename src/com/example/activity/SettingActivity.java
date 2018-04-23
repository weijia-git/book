package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.book.R;

public class SettingActivity extends Activity implements OnClickListener{
	Button btnexit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);
		btnexit = (Button) this.findViewById(R.id.btnexit);
		btnexit.setOnClickListener(this);
	}
	@Override
	public void onClick(View btn) {
		// TODO Auto-generated method stub
		switch (btn.getId()) {
		case R.id.btnexit:
			Runtime.getRuntime().exit(0);
			System.exit(0);
			android.os.Process.killProcess(android.os.Process.myPid());
			break;
		}
	}
}
