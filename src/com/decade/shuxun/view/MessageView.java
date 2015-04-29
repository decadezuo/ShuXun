package com.decade.shuxun.view;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

import com.decade.agile.DCAgileView;
import com.decade.framework.DCBaseViewActivity;
import com.decade.framework.DCiReceiveData;
import com.decade.shuxun.R;

public class MessageView extends DCAgileView implements DCiReceiveData{
	private Context context;

	public MessageView(ViewGroup root, DCBaseViewActivity parent) {
		super(root, parent);
		context = getContext();
	}

	@Override
	protected void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected View create() {
		View view = inflateView(R.layout.message_view, null);
		initViews(view);
		return view;
	}
	
	public void initViews(View view) {
	   
	}

	@Override
	protected void start(Object arg0) {
		setTopTitleText("消息");
	}
	
	
	
	@Override
	protected boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			return false;
		}
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public boolean onReceiveData(Object arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}
}
