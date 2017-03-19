package com.example.testlayout;

import java.util.MissingFormatArgumentException;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.usage.NetworkStats.Bucket;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		LinearLayout layout = (LinearLayout)findViewById(R.id.lly);	
		
		//Calendar date = Calendar.getInstance();
		
		TextView month = (TextView)findViewById(R.id.month);
		TextView day = (TextView)findViewById(R.id.day);
		
		//month.setText(String.valueOf(date.get(Calendar.MONTH)+1)+"��");
		//day.setText(String.valueOf(date.get(Calendar.DAY_OF_MONTH))+"��");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
