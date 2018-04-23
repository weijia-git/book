package com.example.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.bean.Book;
import com.example.book.R;

public class BookAdapter extends BaseAdapter {
	private Context ctx;
	private List<Book> list;
	
	public BookAdapter(Context ctx, List<Book> list) {
		this.ctx = ctx;
		this.list = list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertview, ViewGroup root) {
		// TODO Auto-generated method stub
		convertview = LayoutInflater.from(ctx).inflate(R.layout.list_books_item, null);
		
		
		
		Button btnbook = (Button) convertview.findViewById(R.id.btnbook);
		TextView tvbname = (TextView) convertview.findViewById(R.id.tvbookname);
		TextView tvbinfo = (TextView) convertview.findViewById(R.id.tvbookinfo);
		
		Book b = (Book)list.get(position);
		String bname = b.getBname();
		String binfo = b.getBinfo();
		int bpicture = b.getBpicture();
		
		tvbname.setText(bname);
		tvbinfo.setText(binfo);
		btnbook.setBackgroundResource(bpicture);
		
		return convertview;
	}
	
}
