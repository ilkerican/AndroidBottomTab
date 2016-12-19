package com.android.androidbottomtab;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class AndroidBottomTabActivity extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TabHost tabHost = getTabHost();

		tabHost.addTab(tabHost
				.newTabSpec("tab1")
				.setIndicator("Home",
						getResources().getDrawable(R.drawable.home))
				.setContent(new Intent(this, InvoicesActivity.class)));

		tabHost.addTab(tabHost
				.newTabSpec("tab2")
				.setIndicator("New Invoice",
						getResources().getDrawable(R.drawable.invoice))
				.setContent(new Intent(this, HomeActivity.class)));

		tabHost.addTab(tabHost
				.newTabSpec("tab2")
				.setIndicator("Products/Services",
						getResources().getDrawable(R.drawable.products))
				.setContent(new Intent(this, HomeActivity.class)));
		tabHost.setCurrentTab(0);
	}
}