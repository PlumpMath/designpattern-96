package com.bj58.cmq.designpattern.singleton;

public class Client {
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			SingLenton obj = SingLenton.getInstance();
			System.out.println(obj.toSay());
		}
	}

}
