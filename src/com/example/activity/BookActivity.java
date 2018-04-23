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
		Book b1 = new Book("java��ģʽ", "����java�����Լ����ֳ��ÿ���ģʽ��",R.drawable.book6);
		Book b2 = new Book("Oracle���ݿ�", "������oracle���ݿ�������̷����֪ʶ��",R.drawable.book3);
		Book b3 = new Book("���������ά��", "�����ü��׶���ʵ���ʹ���ͼʾ������ǳ����",R.drawable.book8);
		Book b4 = new Book("Ƕ��ʽϵͳ", "��������ʵ�ʹ���Ϊ����㣬�����ڶ��ߵ�ʵ��������",R.drawable.book10);
		Book b5 = new Book("���ݿ����", "���������ݿⷢչ�����Լ����ݿ����֪ʶ��",R.drawable.book2);
		Book b6 = new Book("���������", "�����˼�����ķ�չ��ʷ�Լ��������֪ʶ��ϵ��",R.drawable.book4);
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
