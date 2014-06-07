package com.example.tabhostviewpage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class FourthlyActivity extends Fragment {

	private Button share_btn;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.activity_fourthly, container,false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		share_btn = (Button) getActivity().findViewById(R.id.share_btn);
		share_btn.setOnClickListener(onClickListener);
	}
	
	private OnClickListener onClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent=new Intent(Intent.ACTION_SEND);   
			intent.setType("text/plain");   
			intent.putExtra(Intent.EXTRA_SUBJECT,"分享");   
			intent.putExtra(Intent.EXTRA_TEXT, "我是Major,欢迎大家来我的主页！！！");    
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);   
			startActivity(Intent.createChooser(intent, "分享"));  		}
	};
}
