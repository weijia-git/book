package com.example.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.book.R;
import com.example.fragment.AnliFragment;
import com.example.fragment.ChangeFragment;
import com.example.fragment.KoubeiFragment;

public class RankActivity extends FragmentActivity implements OnClickListener {
	// 初始化顶部栏显示
	// 定义4个Fragment对象
	private Fragment fg1;
	private Fragment fg2;
	private Fragment fg3;
	// 帧布局对象，用来存放Fragment对象
	private FrameLayout frameLayout;
	// 定义每个选项中的相关控件
	private RelativeLayout firstLayout;
	private RelativeLayout secondLayout;
	private RelativeLayout thirdLayout;
	private TextView firstText;
	private TextView secondText;
	private TextView thirdText;
	// 定义几个颜色
	private int gray = 0xFF7597B3;
	private int dark = 0xff000000;
	// 定义FragmentManager对象管理器
	private FragmentManager fragmentManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rank);
//		fragmentManager = getSupportFragmentManager();
//		initView(); // 初始化界面控件
//		setChioceItem(0); // 初始化页面加载时显示第一个选项卡
	}
//	/**
//	 * 初始化页面
//	 */
//	private void initView() {
//		firstText = (TextView) findViewById(R.id.first_text);
//		secondText = (TextView) findViewById(R.id.second_text);
//		thirdText = (TextView) findViewById(R.id.third_text);
//		firstLayout = (RelativeLayout) findViewById(R.id.first_layout);
//		secondLayout = (RelativeLayout) findViewById(R.id.second_layout);
//		thirdLayout = (RelativeLayout) findViewById(R.id.third_layout);
//		firstLayout.setOnClickListener(RankActivity.this);
//		secondLayout.setOnClickListener(RankActivity.this);
//		thirdLayout.setOnClickListener(RankActivity.this);
//	}
//	
//	@Override
//	public void onClick(View v) {
//		switch (v.getId()) {
//		case R.id.first_layout:
//			setChioceItem(0);
//			break;
//		case R.id.second_layout:
//			setChioceItem(1);
//			break;
//		case R.id.third_layout:
//			setChioceItem(2);
//			break;
//		default:
//			break;
//		}
//	}
//
//	/**
//	 * 设置点击选项卡的事件处理
//	 * 
//	 * @param index
//	 *            选项卡的标号：0, 1, 2
//	 */
//	private void setChioceItem(int index) {
//		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//		clearChioce(); // 清空, 重置选项, 隐藏所有Fragment
//		hideFragments(fragmentTransaction);
//		switch (index) {
//		case 0:
//			// firstImage.setImageResource(R.drawable.XXXX); 需要的话自行修改
//			firstText.setTextColor(dark);
////			firstLayout.setBackgroundColor(gray);
//			// 如果fg1为空，则创建一个并添加到界面上
//			if (fg1 == null) {
//				fg1 = new ChangeFragment();
//				fragmentTransaction.add(R.id.content, fg1);
//			} else {
//				// 如果不为空，则直接将它显示出来
//				fragmentTransaction.show(fg1);
//			}
//			break;
//		case 1:
//			// secondImage.setImageResource(R.drawable.XXXX);
//			secondText.setTextColor(dark);
////			secondLayout.setBackgroundColor(gray);
//			if (fg2 == null) {
//				fg2 = new KoubeiFragment();
//				fragmentTransaction.add(R.id.content, fg2);
//			} else {
//				fragmentTransaction.show(fg2);
//			}
//			break;
//		case 2:
//			// thirdImage.setImageResource(R.drawable.XXXX);
//			thirdText.setTextColor(dark);
////			thirdLayout.setBackgroundColor(gray);
//			if (fg3 == null) {
//				fg3 = new AnliFragment();
//				fragmentTransaction.add(R.id.content, fg3);
//			} else {
//				fragmentTransaction.show(fg3);
//			}
//			break;
//		}
//		fragmentTransaction.commit(); // 提交
//	}
//
//	/**
//	 * 当选中其中一个选项卡时，其他选项卡重置为默认
//	 */
//	private void clearChioce() {
//		// firstImage.setImageResource(R.drawable.XXX);
//		firstText.setTextColor(gray);
////		firstLayout.setBackgroundColor(whirt);
//		// secondImage.setImageResource(R.drawable.XXX);
//		secondText.setTextColor(gray);
////		secondLayout.setBackgroundColor(whirt);
//		// thirdImage.setImageResource(R.drawable.XXX);
//		thirdText.setTextColor(gray);
////		thirdLayout.setBackgroundColor(whirt);
//	}
//
//	/**
//	 * 隐藏Fragment
//	 * 
//	 * @param fragmentTransaction
//	 */
//	private void hideFragments(FragmentTransaction fragmentTransaction) {
//		if (fg1 != null) {
//			fragmentTransaction.hide(fg1);
//		}
//		if (fg2 != null) {
//			fragmentTransaction.hide(fg2);
//		}
//		if (fg3 != null) {
//			fragmentTransaction.hide(fg3);
//		}
//	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
}
