package com.example.activity;


import java.util.ArrayList;
import java.util.List;

import com.example.adapter.StoreAdapter;
import com.example.bean.Store;
import com.example.book.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class StoreActivity extends Activity {
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_store);
		lv = (ListView) this.findViewById(R.id.lvstore);
		Store s1 = new Store("新华书店","苏州市工业园区","★★★★☆",R.drawable.store);
		Store s2 = new Store("新华书店","苏州市工业园区","★★★★☆",R.drawable.store);
		Store s3 = new Store("新华书店","苏州市工业园区","★★★★☆",R.drawable.store);
		Store s4 = new Store("新华书店","苏州市工业园区","★★★★☆",R.drawable.store);
		Store s5 = new Store("新华书店","苏州市工业园区","★★★★☆",R.drawable.store);
		Store s6 = new Store("新华书店","苏州市工业园区","★★★★☆",R.drawable.store);
		List list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        lv.setAdapter(new StoreAdapter(this, list));
	}
}
