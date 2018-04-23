package com.example.activity;

import com.example.book.R;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

public class LoginActivity extends Activity implements OnClickListener {
	Button btnloginlogin;
	Button btnregister;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		btnloginlogin = (Button) this.findViewById(R.id.btnloginlogin);
		btnloginlogin.setOnClickListener(this);
	}

	@Override
	public void onClick(View btn) {
		// TODO Auto-generated method stub
		switch (btn.getId()) {
		case R.id.btnloginlogin:
			Intent intent = new Intent(this, HomeActivity.class);
			Toast.makeText(getApplicationContext(), "µÇÂ½³É¹¦", 1000).show();
			startActivity(intent);
			break;
		}
	}
}
