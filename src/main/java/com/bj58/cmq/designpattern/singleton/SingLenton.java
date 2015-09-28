package com.bj58.cmq.designpattern.singleton;

/**
 * @功能 单例模式示例
 * @ClassName: SingLenton
 * @Description: TODO
 * @author: cuimengqiang@58.com
 * @date: 2015-9-25 下午5:48:55
 */
public class SingLenton {
	
	private static SingLenton instance = new SingLenton();
	
	/**
	 * 私有构造函数
	 */
	private SingLenton(){
		
	}
	
	public static SingLenton getInstance(){
		return instance;
	}
	
	public String toSay(){
		return "I'm cmq.";
	}

}
