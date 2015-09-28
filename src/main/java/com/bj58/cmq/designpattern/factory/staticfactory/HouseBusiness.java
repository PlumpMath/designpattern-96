package com.bj58.cmq.designpattern.factory.staticfactory;

public class HouseBusiness extends AbstractBusiness {

	@Override
	public void doAction(String query) {
		System.out.println("This is house business!query="+query);
	}

}
