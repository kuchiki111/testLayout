package com.example.testlayout;

import java.util.Calendar;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DateLayout extends LinearLayout {
	
		public void myAddView(int width,int height,Drawable background,int color,int textsize,String text){
			LinearLayout LinearLayout = new LinearLayout(this.getContext());
			TextView TextView = new TextView(this.getContext());
			LinearLayout.LayoutParams layout ;
			
			LinearLayout.setGravity(Gravity.CENTER);
			LinearLayout.setBackground(background);
			
			TextView.setTextColor(color);
			TextView.setTextSize((int)getResources().getDimension(R.dimen.standard_dp)*textsize);
			TextView.setText(text);
			LinearLayout.addView(TextView);
			
			layout = new LinearLayout.LayoutParams(
					(int)getResources().getDimension(R.dimen.standard_dp)*width,
					(int)getResources().getDimension(R.dimen.standard_dp)*height);
			this.addView(LinearLayout,layout);
		}
		
		public DateLayout(Context context, AttributeSet attrs) {
			super(context, attrs);
			this.setOrientation(VERTICAL);
			
			Calendar date = Calendar.getInstance();
			String month = String.valueOf(date.get(Calendar.MONTH)+1+"ÔÂ");
			String day = String.valueOf(date.get(Calendar.DAY_OF_MONTH));
			
			myAddView(80, 30, getResources().getDrawable(R.drawable.styletop), Color.WHITE, 10, month);
			myAddView(80, 50, getResources().getDrawable(R.drawable.stylebottom), Color.BLACK, 18, day);
		}
}
