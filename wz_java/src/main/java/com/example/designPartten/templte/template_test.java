package com.example.designPartten.templte;

import com.example.templte.template;
import com.example.templte.templateImpl;

public class template_test {

	public static void main(String[] args) {

		//使用1
		com.example.designPartten.templte.template tl = new com.example.designPartten.templte.template() {

			@Override
			void printAge() {
				// TODO Auto-generated method stub
				System.out.println("26");
			}
		};
		tl.printMsg();

		//使用2
		com.example.designPartten.templte.template tl1 = new com.example.designPartten.templte.templateImpl();
		tl1.printMsg();
	}
}
