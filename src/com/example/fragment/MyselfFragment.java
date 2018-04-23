package com.example.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.activity.BookActivity;
import com.example.activity.FriendActivity;
import com.example.activity.LoginActivity;
import com.example.activity.MyinfoActivity;
import com.example.activity.SettingActivity;
import com.example.book.R;

public class MyselfFragment extends Fragment implements OnClickListener {
	Button btnmybooks;
	Button btnmyfriends;
	Button btnmylikes;
	Button btnlogin;
	Button btnmy;
	Button btnsetting;
	View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_my, container, false);

		btnmybooks = (Button) view.findViewById(R.id.btnmybooks);
		btnmyfriends = (Button) view.findViewById(R.id.btnmyfriends);
		btnmylikes = (Button) view.findViewById(R.id.btnmylikes);
		btnlogin = (Button) view.findViewById(R.id.btnlogin);
		btnmy = (Button) view.findViewById(R.id.btnmy);
		btnsetting = (Button) view.findViewById(R.id.btnmysetting);

		btnlogin.setOnClickListener(this);
		btnmy.setOnClickListener(this);
		btnmybooks.setOnClickListener(this);
		btnmyfriends.setOnClickListener(this);
		btnmylikes.setOnClickListener(this);
		btnsetting.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View btn) {
		// TODO Auto-generated method stub
		switch (btn.getId()) {
		
		case R.id.btnmybooks:
			Intent intent1 = new Intent(this.getActivity(), BookActivity.class);
			this.startActivity(intent1);
			break;
		case R.id.btnmyfriends:
			Intent intent2 = new Intent(this.getActivity(), FriendActivity.class);
			this.startActivity(intent2);
			break;
		case R.id.btnmylikes:
			Intent intent3 = new Intent(this.getActivity(), BookActivity.class);
			this.startActivity(intent3);
			break;
		case R.id.btnlogin:
			Intent intent4 = new Intent(this.getActivity(), LoginActivity.class);
			this.startActivity(intent4);
			break;
		case R.id.btnmy:
			Intent intent5 = new Intent(this.getActivity(), MyinfoActivity.class);
			this.startActivity(intent5);
			break;
		case R.id.btnmysetting:
			Intent intent6 = new Intent(this.getActivity(), SettingActivity.class);
			this.startActivity(intent6);
			break;
		}
	}
}
