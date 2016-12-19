package com.android.androidbottomtab;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class InvoicesActivity2 extends ActivityGroup {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Button t = new Button(this);
		t.setText("text act 1");
		t.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activity3Intent = new Intent(InvoicesActivity2.this,
						InvoicesActivity.class);
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
