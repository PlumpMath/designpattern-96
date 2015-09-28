package com.bj58.cmq.designpattern.factory.staticfactory;

public class CarBusiness extends AbstractBusiness {

	@Override
	public void doAction(String query) {
		System.out.println("This is car business!query="+ query);
	}

}
