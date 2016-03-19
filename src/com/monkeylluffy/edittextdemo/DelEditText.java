package com.monkeylluffy.edittextdemo;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;

public class DelEditText extends EditText  {
	Context context;
	private Drawable img;
	public DelEditText(Context context,AttributeSet attr) {
		// TODO Auto-generated constructor stub
		super(context, attr);
		this.context = context;
		
		init();
	}
	
	private void init() {
		// TODO Auto-generated method stub
		if (length()>0) {
			img = context.getResources().getDrawable(R.drawable.ic_launcher);
			setCompoundDrawablesWithIntrinsicBounds(null,null,img,null);
		}
		addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				//如果字的长度大于0就绘制图片
				drawImage();
			}
		});
	}
	
	protected void drawImage() {
		// TODO Auto-generated method stub
		if (length()>0) {
			img = context.getResources().getDrawable(R.drawable.ic_launcher);
			setCompoundDrawablesWithIntrinsicBounds(null,null,img,null);
		}else {
			setCompoundDrawables(null, null, null, null);
		}
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		if (img != null && event.getAction() == MotionEvent.ACTION_UP) {

			int x = (int) event.getRawX();
			int y = (int) event.getRawY();
			Rect rect = new Rect();
			getGlobalVisibleRect(rect);
			rect.left = rect.right - 100;
			if (rect.contains(x, y)) {
				setText("");
				img = null;
			}
			
		}
		
		return super.onTouchEvent(event);
	}

}
