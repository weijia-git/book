package com.example.activity;

import java.util.ArrayList;
import java.util.List;

import com.example.adapter.BookCommentAdapter;
import com.example.adapter.FriendAdapter;
import com.example.bean.BookComment;
import com.example.bean.Friend;
import com.example.book.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class BookCommentActivity extends Activity {
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_comments);
		lv = (ListView) this.findViewById(R.id.lvcomments);
		BookComment bc = new BookComment("叶无道", "书中自有黄金屋","2014.10.16 12：16：31",R.drawable.user1);
		BookComment bc2 = new BookComment("郭靖", "这本书很不错！","2015.1.5 6：16：32",R.drawable.user2);
		BookComment bc3 = new BookComment("黄蓉", "书很耐看啊","2015.9.23 9：17：56",R.drawable.user3);
		BookComment bc4 = new BookComment("张飞", "不说了好评！","2015.7.19 7：17：33",R.drawable.user4);
		BookComment bc5 = new BookComment("关羽", "故事很曲折","2016.8.28 21：13：55",R.drawable.user5);
		BookComment bc6 = new BookComment("刘备", "书的结构很好","2016.10.8 23：21：45",R.drawable.user6);
		BookComment bc7 = new BookComment("赵云", "爱不释手啊","2016.10.17 14：29：51",R.drawable.user7);
		BookComment bc8 = new BookComment("小乔", "我有一本书，快来交换吧","2016.11.21 16：41：29",R.drawable.user8);
		List list = new ArrayList();
        list.add(bc);
        list.add(bc2);
        list.add(bc3);
        list.add(bc4);
        list.add(bc5);
        list.add(bc6);
        list.add(bc7);
        list.add(bc8);
        lv.setAdapter(new BookCommentAdapter(this, list));
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
