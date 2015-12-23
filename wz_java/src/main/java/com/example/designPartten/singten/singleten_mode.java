package com.example.designPartten.singten;

public class singleten_mode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleten.getInstancePtr().printMode();
	}

}

//单例模式的类
class Singleten{

	private Singleten(){}


	private static class SingletenHolder{
		static final com.example.singten.Singleten instance = new com.example.singten.Singleten();
	}

	//提供单例对象
	public static com.example.singten.Singleten getInstancePtr(){
		return SingletenHolder.instance;
	}

	public void printMode(){
		System.out.println("------- 单例模式 -------------");
	}

}
