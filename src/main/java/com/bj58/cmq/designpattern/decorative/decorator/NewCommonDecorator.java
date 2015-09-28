package com.bj58.cmq.designpattern.decorative.decorator;

import com.bj58.cmq.designpattern.decorative.componen.AbstractBusiness;

public class NewCommonDecorator extends AbstractDecorator {

	public NewCommonDecorator(AbstractBusiness _business) {
		super(_business);
	}
	
	private void before(){
		System.out.println("big business. before.");
	}
	
	private void after(){
		System.out.println("small business. after.");
	}
	
	public String doAction(String query){
		this.before();
		String result = super.doAction(query);
		this.after();
		return result;
	}

}
