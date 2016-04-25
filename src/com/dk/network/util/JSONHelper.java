package com.dk.network.util;

import java.util.List;

import com.alibaba.fastjson.JSON;

public class JSONHelper {

	private static List<?> parseList(String json , Class<?> clazz){
		List<?> list = JSON.parseArray(json , clazz);
		return list ;
	}
}
