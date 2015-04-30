package com.decade.shuxun.view;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

import com.decade.agile.DZAgileView;
import com.decade.framework.DZBaseViewActivity;
import com.decade.framework.DZiReceiveData;
import com.decade.shuxun.R;

public class BagView extends DZAgileView {
	private Context context;

	public BagView(ViewGroup root, DZBaseViewActivity parent) {
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
		setTopTitleText("书包");
	}


}
