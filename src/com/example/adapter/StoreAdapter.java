package com.example.adapter;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.bean.Store;
import com.example.book.R;


public class StoreAdapter extends BaseAdapter {

	List<Store> list;
	Context ctx;
	
	
	public StoreAdapter(Context ctx,List<Store> list) {
		this.list = list;
		this.ctx = ctx;
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
		convertview = LayoutInflater.from(ctx).inflate(R.layout.list_store_item, null);
		
		TextView tvname = (TextView) convertview.findViewById(R.id.tvstorename);
		TextView tvaddr = (TextView) convertview.findViewById(R.id.tvstoreaddr);
		TextView tvstar = (TextView) convertview.findViewById(R.id.tvstorestar);
		Button btnstoreitem = (Button) convertview.findViewById(R.id.btnstoreitem);
		
		Store s = (Store) list.get(position);
		
		String names = s.getStoreName();
		String addr = s.getStoreAddr();
		String star = s.getStar();
		int spicture = s.getSpicture();
		
		
		tvname.setText(names);
		tvaddr.setText(addr);
		tvstar.setText(star);
		btnstoreitem.setBackgroundResource(spicture);
		
		return convertview;
	}

}
