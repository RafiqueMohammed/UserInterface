package com.arr.userinterface;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DynamicColorBox extends Activity {

	LinearLayout div;
	Button add;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dynamic_color_box);
		add=(Button) findViewById(R.id.btn_add);
		add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				addBox();
			}
		});
	}
	
	void addBox(){
		div=(LinearLayout) findViewById(R.id.layout_display_out);
		LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
		TextView ar=new TextView(this);
		ar.setText("Welcome");
		ar.setLayoutParams(lp);
		div.addView(ar);
	}
}
