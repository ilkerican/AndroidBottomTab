package com.android.androidbottomtab;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class InvoicesActivity extends ActivityGroup {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Button t = new Button(this);
		t.setText("text");
		t.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activity3Intent = new Intent(v.getContext(),
						InvoicesActivity2.class);
				replaceContentView("activity3", activity3Intent);
			}
		});
		setContentView(t);

	}

	public void replaceContentView(String id, Intent newIntent) {
		View view = getLocalActivityManager().startActivity(id,
				newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
				.getDecorView();
		this.setContentView(view);
	}
}