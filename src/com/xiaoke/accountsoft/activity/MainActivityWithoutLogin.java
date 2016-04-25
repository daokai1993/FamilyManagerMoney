package com.xiaoke.accountsoft.activity;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.dk.network.util.HttpHelper;
import com.google.gson.Gson;
import com.xiaoke.accountsoft.model.IncomeBean;
import com.xiaoke.accountsoft.model.Tb_inaccount;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityWithoutLogin extends Activity{
	
	ListView list ;
	TextView text ;
	String s ;
	
	public void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState) ;
		setContentView(R.layout.main_without_login) ;
		text = (TextView) findViewById(R.id.text) ;
		list = (ListView) findViewById(R.id.list) ;
	}
	
	public void onClick(View v){
		new Thread(new Runnable(){
			public void run() {	
				s = HttpHelper.doGet(null) ;
				
				Gson gson = new Gson() ;
				IncomeBean bean = gson.fromJson(s, IncomeBean.class) ;
				setText(bean) ;
			}
		}).start() ;
		
	}
	public void setText( final IncomeBean bean){
		MainActivityWithoutLogin.this.runOnUiThread(new Runnable() {
			public void run() {
				Toast.makeText(MainActivityWithoutLogin.this, ""+bean.getResults().get(0).getMark(), 1000).show() ;
				if(s!=null){
					text.setText(s) ;
					
				}
				
			}
		}) ;
	}
}
