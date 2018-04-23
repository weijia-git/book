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
		Book b1 = new Book("java��ģʽ", "����java�����Լ����ֳ��ÿ���ģʽ��", R.drawable.book1);
		Book b2 = new Book("Oracle���ݿ�", "������oracle���ݿ�������̷����֪ʶ��",
				R.drawable.book2);
		Book b3 = new Book("���������ά��", "�����ü��׶���ʵ���ʹ���ͼʾ������ǳ����", R.drawable.book3);
		Book b4 = new Book("Ƕ��ʽϵͳ", "��������ʵ�ʹ���Ϊ����㣬�����ڶ��ߵ�ʵ��������",
				R.drawable.book4);
		Book b5 = new Book("���ݿ����", "���������ݿⷢչ�����Լ����ݿ����֪ʶ��", R.drawable.book5);
		Book b6 = new Book("���������", "�����˼�����ķ�չ��ʷ�Լ��������֪ʶ��ϵ��", R.drawable.book6);
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
