package com.bj58.cmq.designpattern.decorative.concretecomponent;

import com.bj58.cmq.designpattern.decorative.componen.AbstractBusiness;

/**
 * @功能 房产业务线具体类
 * @ClassName: HouseBusiness
 * @Description: TODO
 * @author: cuimengqiang@58.com
 * @date: 2015-9-25 下午3:29:55
 */
public class HouseBusiness extends AbstractBusiness {

	@Override
	public String doAction(String query) {
		System.out.println("This is house business."+query);
		return "house";
	}

}
