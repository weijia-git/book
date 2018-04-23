package com.example.fragment;


import java.util.Timer;
import java.util.TimerTask;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.activity.BookViewActivity;
import com.example.book.R;

public class HomeFragment extends Fragment implements OnClickListener{
	private LinearLayout linearlayout;
	private ImageView main_imageview;
	private int i = 0;
	
	Button btnhomebook1;
	Button btnhomebook2;
	Button btnhomebook3;
	Button btnhomebook4;
	Button btnhomebook5;
	Button btnhomebook6;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_main, container, false);
		btnhomebook1 = (Button) view.findViewById(R.id.btnhomebook1);
		btnhomebook2 = (Button) view.findViewById(R.id.btnhomebook2);
		btnhomebook3 = (Button) view.findViewById(R.id.btnhomebook3);
		btnhomebook4 = (Button) view.findViewById(R.id.btnhomebook4);
		btnhomebook5 = (Button) view.findViewById(R.id.btnhomebook5);
		btnhomebook6 = (Button) view.findViewById(R.id.btnhomebook6);
		btnhomebook1.setOnClickListener(this);
		btnhomebook2.setOnClickListener(this);
		btnhomebook3.setOnClickListener(this);
		btnhomebook4.setOnClickListener(this);
		btnhomebook5.setOnClickListener(this);
		btnhomebook6.setOnClickListener(this);
		return view;
	}
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this.getActivity(),BookViewActivity.class);
		startActivity(intent);
	}

	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		main_imageview = (ImageView)this.getActivity().findViewById(R.id.ivhome);
		main_imageview.setImageResource(R.drawable.ivhome2);
		
		//¹ö¶¯Í¼
		initView();
		
	}
	
	Timer timer = new Timer();

	private Handler handler = new Handler()
	{
		@Override
		public void handleMessage(Message msg)
		{

			Log.e("@@@", i + "");
			//index=msg.what;
			if (i > 6)
			{
				i = 0;
			}
			else
			{
				switch (i)
				{
				case 1:
					main_imageview.setImageResource(R.drawable.ivhome1);
					break;
				case 2:
					main_imageview.setImageResource(R.drawable.ivhome2);
					break;
				case 3:
					main_imageview.setImageResource(R.drawable.ivhome3);
					break;
				case 4:
					main_imageview.setImageResource(R.drawable.ivhome4);
					break;
				case 5:
					main_imageview.setImageResource(R.drawable.ivhome5);
					break;
				case 6:
					main_imageview.setImageResource(R.drawable.ivhome6);
					break;
				default:
					break;
				}
				linearlayout.invalidate();
			}
			super.handleMessage(msg);
		}
	};


	public void initView()
	{
		linearlayout = (LinearLayout)this.getActivity().findViewById(R.id.llhome);
		main_imageview = (ImageView)this.getActivity().findViewById(R.id.ivhome);
		main_imageview.setImageResource(R.drawable.ivhome1);
		
		timer.scheduleAtFixedRate(new TimerTask()
		{
			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				i++;
				Message mesasge = new Message();
				mesasge.what = i;
				handler.sendMessage(mesasge);
			}
		}, 0, 2000);
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		timer.cancel();
		super.onDestroy();
	}

}
