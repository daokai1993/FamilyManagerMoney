package com.dk.adapter;

import java.util.List;

import com.xiaoke.accountsoft.model.Tb_inaccount;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MyAdapter extends BaseAdapter{
	
	Context context ;
	List<Tb_inaccount> list ;
	
	public MyAdapter(Context context , List<Tb_inaccount> list){
		this.context = context ;
		this.list = list ;
	}

	public int getCount() {
		return 0;
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		
		return null;
	}

}
