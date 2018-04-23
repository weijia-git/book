package com.example.activity;


import java.util.ArrayList;
import java.util.List;

import com.example.adapter.BookAdapter;
import com.example.bean.Book;
import com.example.book.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ChangeRankActivity extends Activity {
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_books_change);
		lv = (ListView) this.findViewById(R.id.lvbookschange);
		Book b1 = new Book("网络安全", "介绍了计算机经常遇到网络威胁以及解决对策。",R.drawable.book6);
		Book b2 = new Book("疯狂Android", "介绍Android基本架构以及应用开发基础知识",R.drawable.book7);
		Book b3 = new Book("面向对象思想", "介绍了面向对象的思想以及软件体系结构。",R.drawable.book8);
		Book b4 = new Book("数据结构", "介绍了计算机存储、组织数据的方式。",R.drawable.book9);
		Book b5 = new Book("算法分析与设计", "介绍了编程中常用的编程算法。",R.drawable.book10);
		Book b6 = new Book("编译原理", "详细介绍了计算机内部编译时的理论体系。",R.drawable.book11);
		List list = new ArrayList();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b6);
        lv.setAdapter(new BookAdapter(this, list));
	}
}
