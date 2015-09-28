package com.bj58.cmq.designpattern.decorative.decorator;

import com.bj58.cmq.designpattern.decorative.componen.AbstractBusiness;

public class CarDecorator extends AbstractDecorator {

	public CarDecorator(AbstractBusiness _business) {
		super(_business);
	}
	
	private void change(){
		System.out.println("This is car business, enter some sb,fuck!");
	}
	
	public String doAction(String query){
		this.change();
		return super.doAction(query);
	}

}
