package com.example.tabhostviewpage;

import com.example.tabhostviewpage.adapter.MyGridViewAdapter;
import com.example.tabhostviewpage.util.MyGridView;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class FirstActivity extends Fragment {

	private MyGridView myGridView;
	private MyGridViewAdapter adapter;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.activity_first, container,false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		myGridView = (MyGridView) getActivity().findViewById(R.id.Home_gridView);
		adapter = new MyGridViewAdapter(getActivity());
		myGridView.setAdapter(adapter);
	}
}
