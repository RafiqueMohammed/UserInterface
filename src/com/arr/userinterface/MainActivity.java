package com.arr.userinterface;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
TextView h1,h2,h3,h4,h1sub,txt_body;
Button btn1,btn2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		h1=(TextView) findViewById(R.id.txt_heading1);
		h2=(TextView) findViewById(R.id.txt_heading2);
		h3=(TextView) findViewById(R.id.txt_heading3);
		h4=(TextView) findViewById(R.id.txt_heading4);
		txt_body=(TextView) findViewById(R.id.txt_body);
		Typeface helvetica=Typeface.createFromAsset(getAssets(), "font/HelveticaNeue-UltraLight.otf");
		Typeface helvetica1=Typeface.createFromAsset(getAssets(), "font/HelveticaNeue-UltraLigCond.otf");
		Typeface helvetica2=Typeface.createFromAsset(getAssets(), "font/HelveticaNeue-UltraLigExt.otf");
		Typeface helvetica3=Typeface.createFromAsset(getAssets(), "font/Helvetica Neue UltraLight.ttf");
		
		h1.setTypeface(helvetica);
		
		h2.setTypeface(helvetica);
		h3.setTypeface(helvetica);
		h4.setTypeface(helvetica);
		
		//txt_body.setTypeface(helvetica3);

		btn1=(Button) findViewById(R.id.btn_purple);
		btn1.setTypeface(Typeface.SANS_SERIF);
		
		btn2=(Button) findViewById(R.id.btn_dashboard);
		btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent= new Intent();
				intent.setClass(MainActivity.this, Dashboard.class);
				startActivity(intent);
			}
		});
		
		
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent intent= new Intent();
			intent.setClass(MainActivity.this, MoreButtons.class);
			startActivity(intent);
			
			
			}
		});
		this.overridePendingTransition(R.anim.frame_rev_enter,R.anim.frame_rev_exit);
		
	}



}
