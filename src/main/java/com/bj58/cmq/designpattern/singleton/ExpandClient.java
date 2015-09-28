package com.bj58.cmq.designpattern.singleton;

public class ExpandClient {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			ExpandSingLenton obj = ExpandSingLenton.getInstance();
			obj.toSay();
		}
	}

}
