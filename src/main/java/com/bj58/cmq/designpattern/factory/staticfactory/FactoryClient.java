package com.bj58.cmq.designpattern.factory.staticfactory;

public class FactoryClient {
	
	public static void main(String[] args) {
		//生成二手车业务线
		System.out.println("--生成二手车业务线业务逻辑--");
		AbstractBusiness business1 = StaticFactory.createBusiness(CarBusiness.class);
		business1.doAction(" what is car? ");
		//生成房产业务线
		System.out.println("--生成二手车业务线业务逻辑--");
		AbstractBusiness business2 = StaticFactory.createBusiness(HouseBusiness.class);
		business2.doAction(" what is house? ");
	}

}
