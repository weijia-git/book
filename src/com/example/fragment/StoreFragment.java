package com.example.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import com.example.adapter.StoreAdapter;
import com.example.bean.Store;
import com.example.book.R;

public class StoreFragment extends Fragment {
	ListView lv;
	View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.activity_store, container, false);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		lv = (ListView) view.findViewById(R.id.lvstore);
		Store s1 = new Store("新华书店", "苏州市工业园区仁爱路", "★★★★★", R.drawable.store);
		Store s2 = new Store("光明书店", "苏州市工业园区文景路", "★★★★★", R.drawable.store8);
		Store s3 = new Store("不是书店", "苏州市工业园区景泉路", "★★★★☆", R.drawable.store2);
		Store s4 = new Store("万达书店", "苏州市工业园区星塘街", "★★★★☆", R.drawable.store3);
		Store s5 = new Store("橙光书店", "苏州市工业园区港田街", "★★★★☆", R.drawable.store9);
		Store s6 = new Store("诚信书店", "苏州市工业园区敦煌路", "★★★★☆", R.drawable.store5);
		Store s7 = new Store("放心书店", "苏州市工业园区星塘街", "★★★☆☆", R.drawable.store6);
		Store s8 = new Store("清新书店", "苏州市工业园区港田街", "★★☆☆☆", R.drawable.store7);
		Store s9 = new Store("晨光书店", "苏州市工业园区敦煌路", "★★☆☆☆", R.drawable.store1);
		Store s10 = new Store("安心书店", "苏州市工业园区环湖路", "★★☆☆☆", R.drawable.store4);
		List list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		list.add(s9);
		list.add(s10);
		lv.setAdapter(new StoreAdapter(this.getActivity(), list));
	}
}
