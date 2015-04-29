package com.decade.shuxun.view;

import android.content.Context;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

import com.decade.agile.DZAgileView;
import com.decade.framework.DZBaseViewActivity;
import com.decade.shuxun.R;

public class HomeView extends DZAgileView{
	private Context context;

	public HomeView(ViewGroup root, DZBaseViewActivity parent) {
		super(root, parent);
		context = getContext();
	}

	@Override
	protected void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected View create() {
		View view = inflateView(R.layout.home_view, null);
		initViews(view);
		return view;
	}
	
	public void initViews(View view) {
	
	}

	@Override
	protected void start(Object arg0) {
		// TODO Auto-generated method stub
		addTopTitle("主页", Color.WHITE,
				getDimensionById(R.dimen.title_size));
	}
	
	
	@Override
	protected boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			return false;
		}
		return super.onKeyDown(keyCode, event);
	}



}
