package com.example.activity;


import java.util.ArrayList;
import java.util.List;

import com.example.adapter.BookAdapter;
import com.example.bean.Book;
import com.example.book.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class KoubeiRankActivity extends Activity {
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_books_koubei);
		
		lv = (ListView) this.findViewById(R.id.lvbookskoubei);
		Book b1 = new Book("java与模式", "介绍java和开发模式...",R.drawable.book1);
		Book b2 = new Book("java与模式", "介绍java和开发模式...",R.drawable.book1);
		Book b3 = new Book("java与模式", "介绍java和开发模式...",R.drawable.book1);
		Book b4 = new Book("java与模式", "介绍java和开发模式...",R.drawable.book1);
		Book b5 = new Book("java与模式", "介绍java和开发模式...",R.drawable.book1);
		Book b6 = new Book("java与模式", "介绍java和开发模式...",R.drawable.book1);
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
