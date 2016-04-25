package com.dk.net;

import java.util.Map;

public class SyncDataRequest implements Request{

	public String type ;
	
	public String toTail() {
		return "type=" + type;
	}

	public Map<String, ?> toMap() {
		return null;
	}

}
