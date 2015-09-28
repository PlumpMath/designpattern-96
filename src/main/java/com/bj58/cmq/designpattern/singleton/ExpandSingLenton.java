package com.bj58.cmq.designpattern.singleton;

import java.util.Random;
import java.util.Vector;

/**
 * @功能 单例模式的扩展
 * @ClassName: ExpandSingLenton
 * @Description: TODO
 * @author: cuimengqiang@58.com
 * @date: 2015-9-25 下午6:00:41
 */
public class ExpandSingLenton {
	private static int _maxExpandSingLentonNum = 2;
	private static int _nowExpandSingLentonNum;
	private static Vector<String> _singlentonName = new Vector<String>();
	private static Vector<ExpandSingLenton> _singLentonvector = new Vector<ExpandSingLenton>();
	
	static {
		for (int i = 0; i < _maxExpandSingLentonNum; i++) {
			_singLentonvector.add(new ExpandSingLenton("I'm the "+i+" instance."));
		}
	}
	
	private ExpandSingLenton(){
	}
	
	private ExpandSingLenton(String name){
		_singlentonName.add(name);
	}
	
	public static ExpandSingLenton getInstance(){
		Random random = new Random();
		_nowExpandSingLentonNum = random.nextInt(_maxExpandSingLentonNum);
		return _singLentonvector.get(_nowExpandSingLentonNum);
	}
	
	public void toSay(){
		System.out.println(_singlentonName.get(_nowExpandSingLentonNum));
	}
	
	

}
