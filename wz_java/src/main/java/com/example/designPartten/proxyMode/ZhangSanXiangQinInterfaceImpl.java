package com.example.designPartten.proxyMode;

import com.example.proxyMode.*;
import com.example.proxyMode.XiangQinInterface;

/**
 * 张三相亲实现类  
 *
 * @author zhengt
 * @time Jun 3, 2095 3:14:48 PM  
 */
public class ZhangSanXiangQinInterfaceImpl implements com.example.designPartten.proxyMode.XiangQinInterface {
	public void xiangQin() {
		System.out.println("张三去相亲，娶个漂亮老婆。");
	}

	@Override
	public void jiehun(int i) {
		// TODO Auto-generated method stub
		System.out.println("终于结婚了" + i + "周年了");
	}
}      
    
