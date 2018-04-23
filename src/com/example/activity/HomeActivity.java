package com.example.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.book.R;
import com.example.fragment.HomeFragment;
import com.example.fragment.MyselfFragment;
import com.example.fragment.RankFragment;
import com.example.fragment.StoreFragment;

public class HomeActivity extends FragmentActivity implements OnClickListener {
	// ��ʼ����������ʾ
	private ImageView titleLeftImv;
	private TextView titleTv;
	// ����4��Fragment����
	private Fragment fghome;
	private Fragment fgrank;
	private Fragment fgfujin;
	private Fragment fgwo;
	private Fragment fg1;
	private Fragment fg2;
	private Fragment fg3;
	// ֡���ֶ����������Fragment����
	private FrameLayout frameLayout;
	// ����ÿ��ѡ���е���ؿؼ�
	private RelativeLayout firstLayout;
	private RelativeLayout secondLayout;
	private RelativeLayout thirdLayout;
	private RelativeLayout fourthLayout;
	private ImageView firstImage;
	private ImageView secondImage;
	private ImageView thirdImage;
	private ImageView fourthImage;
	private TextView firstText;
	private TextView secondText;
	private TextView thirdText;
	private TextView fourthText;
	// ���弸����ɫ
	private int whirt = 0xFFFFFFFF;
	private int gray = 0xFF7597B3;
	private int dark = 0xff000000;
	// ����FragmentManager���������
	private FragmentManager fragmentManager;
	
	private LinearLayout linearlayout;

	private ImageView main_imageview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app);
		fragmentManager = getSupportFragmentManager();
		initView(); // ��ʼ������ؼ�
		setChioceItem(0); // ��ʼ��ҳ�����ʱ��ʾ��һ��ѡ�
	}
	/**
	 * ��ʼ��ҳ��
	 */
	private void initView() {
		// ��ʼ��ҳ�������
//		titleLeftImv = (ImageView) findViewById(R.id.title_imv);
//		titleLeftImv.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				startActivity(new Intent(HomeActivity.this, LoginActivity.class));
//			}
//		});
//		titleTv = (TextView) findViewById(R.id.title_text_tv);
//		titleTv.setText("���");
		
		// ��ʼ���ײ��������Ŀؼ�
		firstImage = (ImageView) findViewById(R.id.first_image);
		secondImage = (ImageView) findViewById(R.id.second_image);
		thirdImage = (ImageView) findViewById(R.id.third_image);
		fourthImage = (ImageView) findViewById(R.id.fourth_image);
		firstText = (TextView) findViewById(R.id.first_text);
		secondText = (TextView) findViewById(R.id.second_text);
		thirdText = (TextView) findViewById(R.id.third_text);
		fourthText = (TextView) findViewById(R.id.fourth_text);
		firstLayout = (RelativeLayout) findViewById(R.id.first_layout);
		secondLayout = (RelativeLayout) findViewById(R.id.second_layout);
		thirdLayout = (RelativeLayout) findViewById(R.id.third_layout);
		fourthLayout = (RelativeLayout) findViewById(R.id.fourth_layout);
		firstLayout.setOnClickListener(HomeActivity.this);
		secondLayout.setOnClickListener(HomeActivity.this);
		thirdLayout.setOnClickListener(HomeActivity.this);
		fourthLayout.setOnClickListener(HomeActivity.this);
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.first_layout:
			setChioceItem(0);
			break;
		case R.id.second_layout:
			setChioceItem(1);
			break;
		case R.id.third_layout:
			setChioceItem(2);
			break;
		case R.id.fourth_layout:
			setChioceItem(3);
			break;
		default:
			break;
		}
	}

	/**
	 * ���õ��ѡ����¼�����
	 * 
	 * @param index
	 *            ѡ��ı�ţ�0, 1, 2, 3
	 */
	private void setChioceItem(int index) {
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		clearChioce(); // ���, ����ѡ��, ��������Fragment
		hideFragments(fragmentTransaction);
		switch (index) {
		case 0:
			// firstImage.setImageResource(R.drawable.XXXX); ��Ҫ�Ļ������޸�
			firstText.setTextColor(dark);
//			firstLayout.setBackgroundColor(gray);
			// ���fg1Ϊ�գ��򴴽�һ������ӵ�������
			if (fghome == null) {
				fghome = new HomeFragment();
				fragmentTransaction.add(R.id.content, fghome);
			} else {
				// �����Ϊ�գ���ֱ�ӽ�����ʾ����
				fragmentTransaction.show(fghome);
			}
			break;
		case 1:
			// secondImage.setImageResource(R.drawable.XXXX);
			secondText.setTextColor(dark);
//			secondLayout.setBackgroundColor(gray);
			if (fgrank == null) {
				fgrank = new RankFragment();
				fragmentTransaction.add(R.id.content, fgrank);
			} else {
				fragmentTransaction.show(fgrank);
			}
			break;
		case 2:
			// thirdImage.setImageResource(R.drawable.XXXX);
			thirdText.setTextColor(dark);
//			thirdLayout.setBackgroundColor(gray);
			if (fgfujin == null) {
				fgfujin = new StoreFragment();
				fragmentTransaction.add(R.id.content, fgfujin);
			} else {
				fragmentTransaction.show(fgfujin);
			}
			break;
		case 3:
			// fourthImage.setImageResource(R.drawable.XXXX);
			fourthText.setTextColor(dark);
//			fourthLayout.setBackgroundColor(gray);
			if (fgwo == null) {
				fgwo = new MyselfFragment();
				fragmentTransaction.add(R.id.content, fgwo);
			} else {
				fragmentTransaction.show(fgwo);
			}
			break;
		}
		fragmentTransaction.commit(); // �ύ
	}

	/**
	 * ��ѡ������һ��ѡ�ʱ������ѡ�����ΪĬ��
	 */
	private void clearChioce() {
		// firstImage.setImageResource(R.drawable.XXX);
		firstText.setTextColor(gray);
//		firstLayout.setBackgroundColor(whirt);
		// secondImage.setImageResource(R.drawable.XXX);
		secondText.setTextColor(gray);
//		secondLayout.setBackgroundColor(whirt);
		// thirdImage.setImageResource(R.drawable.XXX);
		thirdText.setTextColor(gray);
//		thirdLayout.setBackgroundColor(whirt);
		// fourthImage.setImageResource(R.drawable.XXX);
		fourthText.setTextColor(gray);
//		fourthLayout.setBackgroundColor(whirt);
	}

	/**
	 * ����Fragment
	 * 
	 * @param fragmentTransaction
	 */
	private void hideFragments(FragmentTransaction fragmentTransaction) {
		if (fghome != null) {
			fragmentTransaction.hide(fghome);
		}
		if (fgrank != null) {
			fragmentTransaction.hide(fgrank);
		}
		if (fgfujin != null) {
			fragmentTransaction.hide(fgfujin);
		}
		if (fgwo != null) {
			fragmentTransaction.hide(fgwo);
		}
	}
}
