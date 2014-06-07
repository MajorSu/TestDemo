package com.example.tabhostviewpage.adapter;

import com.example.tabhostviewpage.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyGridViewAdapter extends BaseAdapter {

	private Context activity;
	private String title[] = {"item1","item2","item3",
							"item4","item5","item6",
							"item8","item9","item10",
							"item11","item12","item13"};
	private int imgID[] = {R.drawable.zhaoche,R.drawable.zhaoche,R.drawable.zhaoche,R.drawable.zhaoche
			,R.drawable.zhaoche,R.drawable.zhaoche,R.drawable.zhaoche,R.drawable.zhaoche,R.drawable.zhaoche,
			R.drawable.zhaoche,R.drawable.zhaoche,R.drawable.zhaoche,R.drawable.zhaoche};
	
	private int bgID[] = {R.drawable.gridview_item_background,R.drawable.gridview_item_background,R.drawable.gridview_item_background
			,R.drawable.gridview_item_background,R.drawable.gridview_item_background,R.drawable.gridview_item_background,
			R.drawable.gridview_item_background,R.drawable.gridview_item_background,R.drawable.gridview_item_background,
			R.drawable.gridview_item_background,R.drawable.gridview_item_background,R.drawable.gridview_item_background,
			R.drawable.gridview_item_background,R.drawable.gridview_item_background};
	
	public MyGridViewAdapter (Context activity){
		this.activity = activity;
	}
	@Override
	public int getCount() {
		return title.length;
	}

	@Override
	public Object getItem(int arg0) {
		return title[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		ViewHolder holder = null;
		if (arg1 == null) {
			arg1 = LinearLayout.inflate(activity, R.layout.gridview_item, null);
			holder = new ViewHolder(arg1);
			arg1.setTag(holder);
		}else {
			holder = (ViewHolder) arg1.getTag();
		}
		
		holder.mTextView.setText(title[arg0]);
		holder.mImageView.setImageResource(imgID[arg0]);
		holder.mImageView.setBackgroundResource(bgID[arg0]);
		return arg1;
	}

	public static class ViewHolder{
		
		private ImageButton mImageView;
		private TextView mTextView;
		public ViewHolder(View v){
			mImageView = (ImageButton) v.findViewById(R.id.gridView_item_imagView);
			mTextView = (TextView) v.findViewById(R.id.gridView_item_text);
		}
	}
}
