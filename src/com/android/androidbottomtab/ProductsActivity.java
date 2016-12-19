package com.android.androidbottomtab;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ProductsActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView t = new TextView(this);
		t.setText("text");
		setContentView(t);
	}
}
