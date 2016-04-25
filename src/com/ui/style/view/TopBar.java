package com.ui.style.view;

import com.xiaoke.accountsoft.activity.R;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/*
 * @author D.K.
 */
public class TopBar extends RelativeLayout{
	
	Context context ;
	LayoutInflater inflate ;
	
	TextView title ;
	ImageView back ;

	public TopBar(Context context) {
		super(context);
		init(context) ;
	}
	public TopBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context) ;
	}
	public TopBar(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context) ;
	//	TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.TopBarWidget, 0, 0);
	}
	
	public void init(Context context){
		this.context = context ;
		inflate = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;
		findViewById(inflate.inflate(R.layout.topbar, this)) ;

	}
	
	public void findViewById(View view){
		title = (TextView) view.findViewById(R.id.title) ;
		back = (ImageView) view.findViewById(R.id.back) ;
		back.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				((Activity)context).finish() ;
			}
			
		}) ;
	}
}
