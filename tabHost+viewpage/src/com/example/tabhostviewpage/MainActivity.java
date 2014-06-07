package com.example.tabhostviewpage;

import com.example.tabhostviewpage.adapter.TabsAdapter;
import com.example.tabhostviewpage.util.BaseFragmentActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends BaseFragmentActivity {

    public TabHost tabHost = null;
    public TabsAdapter tabsAdapter = null;
    public static RadioGroup radioGroup = null;
    public ViewPager viewpager = null;
    private Fragment publishGoods = null;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initView();
	}

	private void initView() {
		  	tabHost = (TabHost) findViewById(android.R.id.tabhost);
	        tabHost.setup();

	        radioGroup = (RadioGroup) findViewById(R.id.MainTab_TabGroup);
	        radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);

	        viewpager = (ViewPager) findViewById(R.id.MainTab_ViewPager);
	        viewpager.setOnPageChangeListener(pageChangeListener);

	        tabsAdapter = new TabsAdapter(this, tabHost, viewpager);

	        tabsAdapter.addTab(tabHost.newTabSpec("First").setIndicator("First"),FirstActivity.class, null);
	        tabsAdapter.addTab(tabHost.newTabSpec("Second").setIndicator("Second"),SecondActivity.class, null);
	        tabsAdapter.addTab(tabHost.newTabSpec("Thirdly").setIndicator("Thirdly"),ThirdlyActivity.class, null);
	        tabsAdapter.addTab(tabHost.newTabSpec("Fourthly").setIndicator("Fourthly"), FourthlyActivity.class, null);
	}
	
    private OnPageChangeListener pageChangeListener = new OnPageChangeListener() {

        @Override
        public void onPageSelected(int arg0) {
            switch (arg0) {
                case 0:
                    radioGroup.check(R.id.MainTab_HomePage);
                    break;
                case 1:
                    radioGroup.check(R.id.MainTab_Publish);
                    break;
                case 2:
                    radioGroup.check(R.id.MainTab_AddressBook);
                    break;
                case 3:
                    radioGroup.check(R.id.MainTab_Individual);
                    break;
            }
        }
        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {
        }
        @Override
        public void onPageScrollStateChanged(int arg0) {
        }
    };
    
    private OnCheckedChangeListener onCheckedChangeListener = new OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.MainTab_HomePage:
                    tabHost.setCurrentTabByTag("First");
                    break;

                case R.id.MainTab_Publish:
                    tabHost.setCurrentTabByTag("Second");
                    break;

                case R.id.MainTab_AddressBook:
                    tabHost.setCurrentTabByTag("Thirdly");
                    break;

                case R.id.MainTab_Individual:
                    tabHost.setCurrentTabByTag("Fourthly");
                    break;
            }
        }
    };
}
