package com.example.testlayout;

import java.util.Calendar;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DateLayout extends LinearLayout {
		public void myAddView(){
			
		}
		public DateLayout(Context context, AttributeSet attrs) {
			super(context, attrs);
			
			this.setOrientation(VERTICAL);
			this.setGravity(Gravity.CENTER);
			LinearLayout.LayoutParams layout ;
			Calendar date = Calendar.getInstance();
			
			LinearLayout layoutTop = new LinearLayout(this.getContext());
			layoutTop.setBackground(getResources().getDrawable(R.drawable.styletop));
			layoutTop.setGravity(Gravity.CENTER);
			
			TextView month = new TextView(this.getContext());
			month.setTextColor(Color.WHITE);
			month.setTextSize(getResources().getDimension(R.dimen.standard_dp)*10);
			month.setText(date.get(Calendar.MONTH)+1+"ÔÂ");
			layoutTop.addView(month);
			
			layout = new LinearLayout.LayoutParams(
					(int)getResources().getDimension(R.dimen.standard_dp)*80,
					(int)getResources().getDimension(R.dimen.standard_dp)*30);
			this.addView(layoutTop,layout);
			
			
			LinearLayout layoutbottom = new LinearLayout(this.getContext());
			layoutbottom.setBackground(getResources().getDrawable(R.drawable.stylebottom));
			layoutbottom.setGravity(Gravity.CENTER);
			
			TextView day = new TextView(this.getContext());
			day.setTextColor(Color.BLACK);
			day.setTextSize(getResources().getDimension(R.dimen.standard_dp)*18);
			day.setText(String.valueOf(date.get(Calendar.DAY_OF_MONTH)));
			layoutbottom.addView(day);
			
			layout = new LinearLayout.LayoutParams(
					(int)getResources().getDimension(R.dimen.standard_dp)*80,
					(int)getResources().getDimension(R.dimen.standard_dp)*50);
			layout.topMargin=-2;
			this.addView(layoutbottom,layout);
			
		}
}
