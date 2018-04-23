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
		Book b1 = new Book("���簲ȫ", "�����˼������������������в�Լ�����Բߡ�",R.drawable.book6);
		Book b2 = new Book("���Android", "����Android�����ܹ��Լ�Ӧ�ÿ�������֪ʶ",R.drawable.book7);
		Book b3 = new Book("�������˼��", "��������������˼���Լ������ϵ�ṹ��",R.drawable.book8);
		Book b4 = new Book("���ݽṹ", "�����˼�����洢����֯���ݵķ�ʽ��",R.drawable.book9);
		Book b5 = new Book("�㷨���������", "�����˱���г��õı���㷨��",R.drawable.book10);
		Book b6 = new Book("����ԭ��", "��ϸ�����˼�����ڲ�����ʱ��������ϵ��",R.drawable.book11);
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
