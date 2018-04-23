package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.book.R;

public class MyinfoActivity extends Activity implements OnClickListener{
	Button btnsetting;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_myinfo);
		btnsetting = (Button) this.findViewById(R.id.btnmyinfosetting);
		btnsetting.setOnClickListener(this);
	}
	@Override
	public void onClick(View btn) {
		// TODO Auto-generated method stub
		switch (btn.getId()) {
		case R.id.btnmyinfosetting:
			Intent intent1 = new Intent(this, SettingActivity.class);
			this.startActivity(intent1);
			break;
		}
	}
	
}
