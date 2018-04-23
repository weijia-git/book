package com.example.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.activity.RankActivity;
import com.example.book.R;

public class RankFragment extends Fragment implements OnClickListener{
	View view;
	// ��ʼ����������ʾ
	// ����4��Fragment����
	private Fragment fg1;
	private Fragment fg2;
	private Fragment fg3;
	// ֡���ֶ����������Fragment����
	private FrameLayout frameLayout;
	// ����ÿ��ѡ���е���ؿؼ�
	private RelativeLayout firstLayout;
	private RelativeLayout secondLayout;
	private RelativeLayout thirdLayout;
	private TextView firstText;
	private TextView secondText;
	private TextView thirdText;
	// ���弸����ɫ
	private int gray = 0xFF7597B3;
	private int dark = 0xff000000;
	// ����FragmentManager���������
	private FragmentManager fragmentManager;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.activity_rank, container, false);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		fragmentManager = this.getActivity().getSupportFragmentManager();
		initView(); // ��ʼ������ؼ�
		setChioceItem(0);
	}
	private void initView() {
		firstText = (TextView) view.findViewById(R.id.first_text1);
		secondText = (TextView) view.findViewById(R.id.second_text2);
		thirdText = (TextView) view.findViewById(R.id.third_text3);
		firstLayout = (RelativeLayout) view.findViewById(R.id.first_layout);
		secondLayout = (RelativeLayout) view.findViewById(R.id.second_layout);
		thirdLayout = (RelativeLayout) view.findViewById(R.id.third_layout);
		firstLayout.setOnClickListener(RankFragment.this);
		secondLayout.setOnClickListener(RankFragment.this);
		thirdLayout.setOnClickListener(RankFragment.this);
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
		default:
			break;
		}
	}

	/**
	 * ���õ��ѡ����¼�����
	 * 
	 * @param index
	 *            ѡ��ı�ţ�0, 1, 2
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
			if (fg1 == null) {
				fg1 = new ChangeFragment();
				fragmentTransaction.add(R.id.contentrank, fg1,"changefg");
			} else {
				// �����Ϊ�գ���ֱ�ӽ�����ʾ����
				fragmentTransaction.show(fg1);
			}
			break;
		case 1:
			// secondImage.setImageResource(R.drawable.XXXX);
			secondText.setTextColor(dark);
//			secondLayout.setBackgroundColor(gray);
			if (fg2 == null) {
				fg2 = new KoubeiFragment();
				
				fragmentTransaction.add(R.id.contentrank, fg2,"koubeifg");
			} else {
				fragmentTransaction.show(fg2);
			}
			break;
		case 2:
			// thirdImage.setImageResource(R.drawable.XXXX);
			thirdText.setTextColor(dark);
//			thirdLayout.setBackgroundColor(gray);
			if (fg3 == null) {
				fg3 = new AnliFragment();
				fragmentTransaction.add(R.id.contentrank, fg3,"anlifg");
			} else {
				fragmentTransaction.show(fg3);
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
		// secondImage.setImageResource(R.drawable.XXX);
		secondText.setTextColor(gray);
		// thirdImage.setImageResource(R.drawable.XXX);
		thirdText.setTextColor(gray);
	}

	/**
	 * ����Fragment
	 * 
	 * @param fragmentTransaction
	 */
	private void hideFragments(FragmentTransaction fragmentTransaction) {
		if (fg1 != null) {
			fragmentTransaction.hide(fg1);
		}
		if (fg2 != null) {
			fragmentTransaction.hide(fg2);
		}
		if (fg3 != null) {
			fragmentTransaction.hide(fg3);
		}
	}
	
}
