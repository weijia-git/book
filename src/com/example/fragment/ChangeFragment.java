package com.example.fragment;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;

import com.example.activity.BookViewActivity;
import com.example.adapter.BookAdapter;
import com.example.bean.Book;
import com.example.book.R;

public class ChangeFragment extends Fragment {
	View view;
	ListView lv;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.activity_books_change, container,
				false);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		lv = (ListView) view.findViewById(R.id.lvbookschange);
		Book b1 = new Book("java与模式", "介绍java语言以及各种常用开发模式。", R.drawable.book1);
		Book b2 = new Book("Oracle数据库", "介绍了oracle数据库操作与编程方面的知识。",
				R.drawable.book2);
		Book b3 = new Book("网络管理与维护", "本书用简单易懂的实例和大量图示，深入浅出。", R.drawable.book3);
		Book b4 = new Book("嵌入式系统", "本书作者实际工作为切入点，有利于读者的实践操作。",
				R.drawable.book4);
		Book b5 = new Book("数据库基础", "介绍了数据库发展历程以及数据库基础知识。", R.drawable.book5);
		Book b6 = new Book("计算机导论", "介绍了计算机的发展历史以及计算机的知识体系。", R.drawable.book6);
		List list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		a();
		lv.setAdapter(new BookAdapter(this.getActivity(), list));
		
	}
	public void a() {
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				gobookview();
			}
		});
	}
	
	public void gobookview() {
		Intent intent1 = new Intent(this.getActivity(), BookViewActivity.class);
		this.startActivity(intent1);
	}
}
