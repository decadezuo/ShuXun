package com.decade.shuxun.component;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import com.decade.framework.DZiBottomView;
import com.decade.shuxun.R;

/**
 * @description: 带有消息数量标示的底部
 * @author: Decade
 * @date: 2013-6-27
 */
public class DZMessageBottomView implements DZiBottomView, OnClickListener {

	private View _view;
	public RadioButton first_btn;
	public RadioButton second_btn;
	public RadioButton third_btn;
	public RadioButton fourth_btn;
	public RadioButton tempButton;

	public DZMessageBottomView(Context context, ViewGroup root) {
		_view = View.inflate(context, R.layout.layout_message_bottom, root);
		first_btn = (RadioButton) _view
				.findViewById(R.id.message_bottom_first_btn);
		second_btn = (RadioButton) _view
				.findViewById(R.id.message_bottom_second_btn);
		third_btn = (RadioButton) _view
				.findViewById(R.id.message_bottom_third_btn);
		fourth_btn = (RadioButton) _view
				.findViewById(R.id.message_bottom_fourth_btn);
		first_btn.setOnClickListener(this);
		second_btn.setOnClickListener(this);
		third_btn.setOnClickListener(this);
		fourth_btn.setOnClickListener(this);
		tempButton = first_btn;
		tempButton.setTextColor(getTabItemSelectedTextColor());
	}

	@Override
	public View getBottomView() {
		return _view;
	}

	public void bottomItemOnClick(View view, int index) {

	}
	
	public int getTabItemNormalTextColor(){
		return Color.WHITE;
	}
	
	public int getTabItemSelectedTextColor(){
		return Color.WHITE;
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.message_bottom_first_btn) {
			setItemSelected(0);
			bottomItemOnClick(v, 0);
			return;
		}
		if (v.getId() == R.id.message_bottom_second_btn) {
			setItemSelected(1);
			bottomItemOnClick(v, 1);
			return;
		}
		if (v.getId() == R.id.message_bottom_third_btn) {
			setItemSelected(2);
			bottomItemOnClick(v, 2);
			return;
		}
		if (v.getId() == R.id.message_bottom_fourth_btn) {
			setItemSelected(3);
			bottomItemOnClick(v, 3);
			return;
		}
	}

	@Override
	public void setItemSelected(int index) {
		tempButton.setChecked(false);
		tempButton.setTextColor(getTabItemNormalTextColor());
		if (index == 0) {
			first_btn.setChecked(true);
			tempButton = first_btn;
		} else if (index == 1) {
			second_btn.setChecked(true);
			tempButton = second_btn;
		} else if (index == 2) {
			third_btn.setChecked(true);
			tempButton = third_btn;
		} else if (index == 3) {
			fourth_btn.setChecked(true);
			tempButton = fourth_btn;
		}
		tempButton.setTextColor(getTabItemSelectedTextColor());
	}

	@Override
	public TextView getUnreadView() {
		// TODO Auto-generated method stub
		return null;
	}
}
