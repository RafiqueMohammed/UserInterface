package com.arr.userinterface;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoreButtons extends Activity {

	Button blue,dark,def,lemon,orange,primary,purple,red,torq,light;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.more_buttons);
		
		blue=(Button) findViewById(R.id.btn_blue);
		dark=(Button) findViewById(R.id.btn_dark);
		lemon=(Button) findViewById(R.id.btn_lemon);
		def=(Button) findViewById(R.id.btn_default);
		light=(Button) findViewById(R.id.btn_light);
		orange=(Button) findViewById(R.id.btn_orange);
		primary=(Button) findViewById(R.id.btn_primary);
		purple=(Button) findViewById(R.id.btn_purple);
		red=(Button) findViewById(R.id.btn_red);
		torq=(Button) findViewById(R.id.btn_torq);
		this.overridePendingTransition(R.anim.frame_enter,R.anim.frame_exit);
		primary.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(MoreButtons.this,DynamicColorBox.class);
				startActivity(intent);
			}
		});
	}

}
