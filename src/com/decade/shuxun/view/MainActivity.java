package com.decade.shuxun.view;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.decade.agile.DCAgileBaseViewActivity;
import com.decade.agile.components.DCCommonTopView;
import com.decade.agile.kit.DCExitDoubleClick;
import com.decade.agile.kit.DCWorkspace;
import com.decade.framework.DCiBottomView;
import com.decade.framework.DCiTopView;
import com.decade.shuxun.R;
import com.decade.shuxun.component.DCMessageBottomView;
import com.decade.shuxun.factory.ViewDefine;
import com.decade.shuxun.factory.ViewFactory;

/**
 * @description:主框架页面，用于显示不同子veiw
 * @author: Decade
 * @date: 2014-6-16
 */
public class MainActivity extends DCAgileBaseViewActivity {

	
	DCMessageBottomView commonBottomView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_act);
		setTopViewBackground(R.drawable.nav_bar);
		setTopViewVisibility(View.VISIBLE);
		setTopLeftViewBackground(R.drawable.selector_title_back);
		DCWorkspace.saveWorkspaceSize(this);
		setViewFactory(new ViewFactory());
		startPage(ViewDefine.VIEWDEFINE_HOME, null, false);
		setTopLeftAction(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
	
	@Override
	public ViewGroup getRootView() {
		return (ViewGroup) findViewById(R.id.main_center_view);
	}
	
	@Override
	protected DCiTopView getTopViewLoader() {
		return new DCCommonTopView(this,
				((ViewGroup) findViewById(R.id.main_top_view)));
	}
	
	@Override
	protected DCiBottomView getBottomViewLoader() {
		 commonBottomView = new DCMessageBottomView(this,
				((ViewGroup) findViewById(R.id.main_bottom_view))) {

			@Override
			public void bottomItemOnClick(View view, int index) {
				super.bottomItemOnClick(view, index);
				switch (index) {
				case 0:
					startPage(ViewDefine.VIEWDEFINE_HOME, null, true);
					break;
				case 1:
					startPage(ViewDefine.VIEWDEFINE_QUERY, null, true);
					break;
				case 2:
					startPage(ViewDefine.VIEWDEFINE_MESSAGE, null, true);
					break;
				case 3:
					startPage(ViewDefine.VIEWDEFINE_SETTING, null, true);
					break;
				default:
					break;
				}
			}

		};
		return commonBottomView;
	}
	
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		if (keyCode == KeyEvent.KEYCODE_BACK) {
			// 如果用户按下了返回键
			if (!super.onKeyDown(keyCode, event)) {
				DCExitDoubleClick.getInstance(this).doDoubleClick(1500,
						"再按一次返回键退出");
			}
		}
		return true;
	}
}

