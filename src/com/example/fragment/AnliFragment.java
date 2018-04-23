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

import com.example.activity.BookActivity;
import com.example.activity.BookViewActivity;
import com.example.activity.FriendActivity;
import com.example.activity.LoginActivity;
import com.example.activity.MyinfoActivity;
import com.example.activity.SettingActivity;
import com.example.adapter.BookAdapter;
import com.example.bean.Book;
import com.example.book.R;

public class AnliFragment extends Fragment{
	View view;
	ListView lv;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.activity_books_anli, container, false);
		return view;
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		lv = (ListView) view.findViewById(R.id.lvbooksanli);
		Book b1 = new Book("C语言", "介绍了C语言基础知识以及常用编程思想。",R.drawable.book7);
		Book b2 = new Book("软件工程", "系统阐述了一个软件从需求分析到最后完成的整个过程。",R.drawable.book5);
		Book b3 = new Book("UML", "介绍了标准对象建模语言以及各种设计模式。",R.drawable.book8);
		Book b4 = new Book("计算机操作系统", "介绍了计算机操作系统的发展历程及其基础知识。",R.drawable.book4);
		Book b5 = new Book("linux内核设计与实现", "介绍了linux内核的硬件抽象磁盘和文件系统控制。",R.drawable.book3);
		Book b6 = new Book("C++", "C语音编程基础...",R.drawable.book2);
		Book b7 = new Book("C语言", "介绍了C语言基础知识以及常用编程思想。",R.drawable.book7);
		Book b8 = new Book("软件工程", "系统阐述了一个软件从需求分析到最后完成的整个过程。",R.drawable.book5);
		Book b9 = new Book("UML", "介绍了标准对象建模语言以及各种设计模式。",R.drawable.book8);
		Book b11 = new Book("计算机操作系统", "介绍了计算机操作系统的发展历程及其基础知识。",R.drawable.book4);
		Book b12 = new Book("linux内核设计与实现", "介绍了linux内核的硬件抽象磁盘和文件系统控制。",R.drawable.book3);
		Book b13 = new Book("C++", "C语音编程基础...",R.drawable.book2);
		List list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		list.add(b7);
		list.add(b8);
		list.add(b9);
		list.add(b11);
		list.add(b12);
		list.add(b13);
		lv.setAdapter(new BookAdapter(this.getActivity(), list));
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
