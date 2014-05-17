package com.arr.userinterface;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Dashboard extends Activity {

	TextView header_txt,color_result;
	ListView menuListView;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dashboard);
		
		Typeface helvetica=Typeface.createFromAsset(getAssets(), "font/Helvetica Neue UltraLight.ttf");
		
		header_txt=(TextView) findViewById(R.id.txt_dashboard_header);
		color_result=(TextView) findViewById(R.id.txt_dashboard_color_result);
		menuListView=(ListView) findViewById(R.id.list_dashboard_menu);
		
		
ArrayList<String> menuArray=new ArrayList<String>();
menuArray.add("Prediction for Next Week");
menuArray.add("Settings");

ArrayAdapter<String> adp=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,menuArray);

menuListView.setAdapter(adp);

		header_txt.setTypeface(helvetica);
		color_result.setTypeface(helvetica);
		color_result.setTextColor(Color.parseColor("#00C5CD"));
		
		
		
	}
}
