package com.decade.shuxun.factory;

import android.view.ViewGroup;

import com.decade.framework.DZBaseView;
import com.decade.framework.DZBaseViewActivity;
import com.decade.framework.DZiViewFactory;
import com.decade.shuxun.view.HomeView;
import com.decade.shuxun.view.MessageView;
import com.decade.shuxun.view.MoreView;
import com.decade.shuxun.view.QueryView;


public class ViewFactory implements DZiViewFactory{
	@Override
	public DZBaseView createView(DZBaseViewActivity parent, int viewId, ViewGroup root) {
		DZBaseView view = null;
		switch (viewId) {
		case ViewDefine.VIEWDEFINE_HOME:
			view = new HomeView(root, parent);
			break;
		case ViewDefine.VIEWDEFINE_QUERY:
			view = new QueryView(root, parent);
			break;
		case ViewDefine.VIEWDEFINE_MESSAGE:
			view = new MessageView(root, parent);
			break;
		case ViewDefine.VIEWDEFINE_SETTING:
			view = new MoreView(root, parent);
			break;
		}
		return view;
	}

}
