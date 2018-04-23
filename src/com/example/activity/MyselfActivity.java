package com.example.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

import com.example.book.R;

public class MyselfActivity extends Activity {
	ListView lv;
	Button btnmybooks;
	Button btnmyfriends;
	Button btnmylikes;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my);
		btnmybooks = (Button) this.findViewById(R.id.btnmybooks);
		btnmyfriends = (Button) this.findViewById(R.id.btnmyfriends);
		btnmylikes = (Button) this.findViewById(R.id.btnmylikes);
		
		btnmybooks.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
			}
		});
	}
	
	public void gomybooks(View view) {
		Intent intent = new Intent(this,BookActivity.class);
		startActivity(intent);
	}
	
	public void gomyfriends(View view) {
		Intent intent = new Intent(this,BookActivity.class);
		startActivity(intent);
	}
	
	public void gomylikes(View view) {
		Intent intent = new Intent(this,BookActivity.class);
		startActivity(intent);
	}
}
