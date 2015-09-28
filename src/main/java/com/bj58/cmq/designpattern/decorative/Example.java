package com.bj58.cmq.designpattern.decorative;

import com.bj58.cmq.designpattern.decorative.componen.AbstractBusiness;
import com.bj58.cmq.designpattern.decorative.concretecomponent.CarBusiness;
import com.bj58.cmq.designpattern.decorative.concretecomponent.HouseBusiness;
import com.bj58.cmq.designpattern.decorative.decorator.CarDecorator;
import com.bj58.cmq.designpattern.decorative.decorator.NewCommonDecorator;

public class Example {
	
	public static void main(String[] args) {
		AbstractBusiness business = new CarBusiness();
		String result = business.doAction("car test.");
		System.out.println(result);
		
		AbstractBusiness business1 = new HouseBusiness();
		String result1 = business1.doAction("houst test.");
		System.out.println(result1);
		
		System.out.println("-----------------------------------");
		//装饰模式1---二手车发生一些变更需要新业务增加一部分逻辑，但是又不想动已经被使用过的类
		AbstractBusiness business2 = new CarBusiness();
		business2 = new CarDecorator(business2);
		String result2 = business2.doAction("car decorator test.");
		System.out.println(result2);
		
		//装饰模式2---新业务中要对所有系统增加业务逻辑，但是老系统中不需要增加，开始了装逼模式2
		System.out.println("-----------------------------------");
		AbstractBusiness business3 = new CarBusiness();
//		AbstractBusiness business4 = new HouseBusiness();
		business3 = new CarDecorator(business3);
		business3 = new NewCommonDecorator(business3);
//		business4 = new NewCommonDecorator(business4);
		System.out.println(business3.doAction("common business car."));
//		System.out.println(business4.doAction("common business house."));
	}

}
