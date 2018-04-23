package com.example.activity;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.book.R;

public class MainActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//¹ö¶¯Í¼
		initView();
		
	}
	
	private LinearLayout linearlayout;

	private ImageView main_imageview;

	private int i = 0;

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
		linearlayout = (LinearLayout) findViewById(R.id.llhome);
		main_imageview = (ImageView) findViewById(R.id.ivhome);

		
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
	protected void onDestroy()
	{
		// TODO Auto-generated method stub
		timer.cancel();
		super.onDestroy();
	}
    
}
