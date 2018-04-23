package com.example.activity;


import java.util.ArrayList;
import java.util.List;

import com.example.adapter.FriendAdapter;
import com.example.bean.Friend;
import com.example.book.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class FriendActivity extends Activity {
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_friends);
		lv = (ListView) this.findViewById(R.id.lvfriends);
		Friend f1 = new Friend("叶无道", "书中自有黄金屋",R.drawable.user10);
		Friend f2 = new Friend("郭靖", "这本书很不错！",R.drawable.user8);
		Friend f3 = new Friend("黄蓉", "书很耐看啊",R.drawable.user9);
		Friend f4 = new Friend("张飞", "不说了好评！",R.drawable.user3);
		Friend f5 = new Friend("关羽", "故事很曲折",R.drawable.user6);
		Friend f6 = new Friend("刘备", "书的结构很好",R.drawable.user2);
		Friend f7 = new Friend("赵云", "爱不释手啊",R.drawable.user7);
		Friend f8 = new Friend("小乔", "我有一本书，快来交换吧",R.drawable.user1);
		List list = new ArrayList();
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);
        list.add(f6);
        list.add(f7);
        list.add(f8);
        lv.setAdapter(new FriendAdapter(this, list));
        lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				goinfo();
			}
		});
	}
	
	public void goinfo() {
		Intent intent1 = new Intent(this, MyinfoActivity.class);
		this.startActivity(intent1);
	}
}
