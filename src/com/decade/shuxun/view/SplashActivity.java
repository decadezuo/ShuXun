package com.decade.shuxun.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;

import com.decade.agile.DZAgileActivity;
import com.decade.agile.kit.DZWorkspace;
import com.decade.framework.DZApplication;
import com.decade.framework.network.DZNetCheck;
import com.decade.shuxun.R;

/**
 * @description: 闪屏页面
 * @version: 1.0
 * @author: Decade
 * @date: 2015-4-30
 */
public class SplashActivity extends DZAgileActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_act);
		DZApplication.getApp().setNetStatus(DZNetCheck.checkNet(this));
		DZWorkspace.saveWorkspaceSize(this);
		startAnimation();
	}

	private void startAnimation() {
		// 开机动画
		AlphaAnimation aa = new AlphaAnimation(0.5f, 1.0f);
		aa.setDuration(1500);
		LinearLayout rl_splash = (LinearLayout) findViewById(R.id.splash_bg_ll);
		aa.setAnimationListener(new animationListener());
		rl_splash.startAnimation(aa);
	}

	private class animationListener implements AnimationListener {

		@Override
		public void onAnimationEnd(Animation animation) {
			finish();
			Intent intent = new Intent(SplashActivity.this, MainActivity.class);
			startActivity(intent);
		}

		@Override
		public void onAnimationRepeat(Animation animation) {

		}

		@Override
		public void onAnimationStart(Animation animation) {
		}

	}
}
