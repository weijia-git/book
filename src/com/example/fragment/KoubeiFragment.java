package com.example.fragment;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.activity.BookViewActivity;
import com.example.adapter.BookAdapter;
import com.example.bean.Book;
import com.example.book.R;

public class KoubeiFragment extends Fragment {
	View view;
	ListView lv;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.activity_books_koubei, container,
				false);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		lv = (ListView) view.findViewById(R.id.lvbookskoubei);
		
		Book b1 = new Book("C����", "C���Ի���֪ʶ�Լ����ñ��˼��", R.drawable.book11);
		Book b2 = new Book("C++", "C������̻���...", R.drawable.book10);
		Book b3 = new Book("���������ϵͳ", "���������ϵͳ�ķ�չ���̼������֪ʶ", R.drawable.book9);
		Book b4 = new Book("UML", "��׼����ģ�����Լ��������ģʽ", R.drawable.book8);
		Book b5 = new Book("�������", "ϵͳ������һ���������������������ɵ���������", R.drawable.book7);
		Book b6 = new Book("linux�ں������ʵ��", "linux�ں˵�Ӳ��������̺��ļ�ϵͳ����",R.drawable.book6);
		List list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
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
