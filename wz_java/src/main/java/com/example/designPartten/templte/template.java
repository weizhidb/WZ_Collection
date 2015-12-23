package com.example.designPartten.templte;

public abstract class template {

	private void printName(){
		System.out.println("weizhi");
	}

	//延迟到子类当中实现
	abstract void printAge();

	private void printAddress(){
		System.out.println("安徽");
	}

	public void printMsg(){
		printAddress();
		printName();
		printAge();
	}
}
