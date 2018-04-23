package com.example.activity;


import java.util.ArrayList;
import java.util.List;

import com.example.adapter.BookAdapter;
import com.example.bean.Book;
import com.example.book.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class BookActivity extends Activity {
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_books);
		
		lv = (ListView) this.findViewById(R.id.lvbooks);
		Book b1 = new Book("java与模式", "介绍java语言以及各种常用开发模式。",R.drawable.book6);
		Book b2 = new Book("Oracle数据库", "介绍了oracle数据库操作与编程方面的知识。",R.drawable.book3);
		Book b3 = new Book("网络管理与维护", "本书用简单易懂的实例和大量图示，深入浅出。",R.drawable.book8);
		Book b4 = new Book("嵌入式系统", "本书作者实际工作为切入点，有利于读者的实践操作。",R.drawable.book10);
		Book b5 = new Book("数据库基础", "介绍了数据库发展历程以及数据库基础知识。",R.drawable.book2);
		Book b6 = new Book("计算机导论", "介绍了计算机的发展历史以及计算机的知识体系。",R.drawable.book4);
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
