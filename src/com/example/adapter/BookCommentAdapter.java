package com.example.adapter;

import java.util.List;

import com.example.bean.BookComment;
import com.example.book.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class BookCommentAdapter extends BaseAdapter {
	private Context ctx;
	private List<BookComment> list;
	public BookCommentAdapter(Context ctx,List<BookComment> list){
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
	public View getView(int position, View convertview, ViewGroup arg2) {
		convertview = LayoutInflater.from(ctx).inflate(R.layout.list_comments_item, null);
		

		Button btnusercom = (Button) convertview.findViewById(R.id.btnusercom);
		TextView tvusercom = (TextView) convertview.findViewById(R.id.tvusercom);
		TextView tvusercomname = (TextView) convertview.findViewById(R.id.tvusercomname);
		TextView tvusercomtime = (TextView) convertview.findViewById(R.id.tvusercomtime);
		
		BookComment bookComment = (BookComment)list.get(position);
		
		String str1 = bookComment.getBookComment();
		String str2 = bookComment.getUserName();
		String str3 = bookComment.getCommentTime();
		int cpicture = bookComment.getCpicture();
		
		tvusercom.setText(str1);
		tvusercomname.setText(str2);
		tvusercomtime.setText(str3);
		btnusercom.setBackgroundResource(cpicture);
		
		return convertview;
	}

}
