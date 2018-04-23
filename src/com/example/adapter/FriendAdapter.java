package com.example.adapter;

import java.util.List;

import com.example.bean.Friend;
import com.example.bean.Store;
import com.example.book.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;


public class FriendAdapter extends BaseAdapter {
	private Context ctx;
	private List<Friend> list;
	
	public FriendAdapter(Context ctx, List<Friend> list) {
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
		convertview = LayoutInflater.from(ctx).inflate(R.layout.list_friends_item, null);
		
		
		Button btnfriend = (Button) convertview.findViewById(R.id.btnfriend);
		TextView tvfname = (TextView) convertview.findViewById(R.id.tvfriendname);
		TextView tvfinfo = (TextView) convertview.findViewById(R.id.tvfriendinfo);
		
		Friend f = list.get(position);
		String fname = f.getFname();
		String finfo = f.getFinfo();
		int fpicture = f.getFpicture();
		
		tvfname.setText(fname);
		tvfinfo.setText(finfo);
		btnfriend.setBackgroundResource(fpicture);
		
		return convertview;
	}
	
}
