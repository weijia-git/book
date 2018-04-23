package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

import com.example.book.R;

public class BookViewActivity extends Activity implements OnClickListener {
	ListView lv;
	Button btnlookcomment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_book);
		btnlookcomment = (Button) this.findViewById(R.id.btnlookcomment);
		btnlookcomment.setOnClickListener(this);
	}

	@Override
	public void onClick(View btn) {
		// TODO Auto-generated method stub
		switch (btn.getId()) {
		case R.id.btnlookcomment:
			Intent intent = new Intent(this, BookCommentActivity.class);
			startActivity(intent);
			break;
		}
	}
}
