package com.xiaoke.accountsoft.model;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class IncomeBean{
	public List<Result> results ;
	
	public static class Result{
		public Result(){
		}
		public String userId ;
		public int id;// 存储支出编号
		public double money;// 存储支出金额
		public String time;// 存储支出时间
		public String type;// 存储支出类别
		public String mark;// 存储支出备注
		public String handler ;
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getMoney() {
			return money;
		}
		public void setMoney(double money) {
			this.money = money;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getMark() {
			return mark;
		}
		public void setMark(String mark) {
			this.mark = mark;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

}
