package com.bj58.cmq.designpattern.decorative.concretecomponent;

import com.bj58.cmq.designpattern.decorative.componen.AbstractBusiness;

/**
 * @功能 具体业务类
 * @ClassName: CarBusiness
 * @Description: TODO
 * @author: cuimengqiang@58.com
 * @date: 2015-9-25 下午3:28:19
 */
public class CarBusiness extends AbstractBusiness {

	@Override
	public String doAction(String query) {
		System.out.println("This is car business:"+query);
		return "car";
	}

}
