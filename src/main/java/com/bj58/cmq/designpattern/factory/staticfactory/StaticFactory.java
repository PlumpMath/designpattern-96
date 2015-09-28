package com.bj58.cmq.designpattern.factory.staticfactory;

/**
 * @功能 静态工厂类
 * @ClassName: StaticFactory
 * @Description: TODO
 * @author: cuimengqiang@58.com
 * @date: 2015-9-28 下午4:21:09
 */
public class StaticFactory {
	
	public static <T extends AbstractBusiness> T createBusiness(Class<T> cls){
		AbstractBusiness business = null;
		try {
			business = (AbstractBusiness) Class.forName(cls.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("业务类生成错误");
		}
		
		return (T)business;
	}

}
