package com.bj58.cmq.designpattern.decorative.decorator;

import com.bj58.cmq.designpattern.decorative.componen.AbstractBusiness;

/**
 * @功能 基本装饰类
 * @ClassName: AbstractDecorator
 * @Description: TODO
 * @author: cuimengqiang@58.com
 * @date: 2015-9-25 下午3:35:09
 */
public abstract class AbstractDecorator extends AbstractBusiness{
	private AbstractBusiness business = null;
	
	public AbstractDecorator(AbstractBusiness _business){
		this.business = _business;
	}
	
	@Override
	public String doAction(String query) {
		return business.doAction(query);
	}

}
