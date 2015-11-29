package com.example.administrator.wz_collection.gson_code.gson;

import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/**
 * 完成对json数据的解析
 */
public class GsonTools {

	public GsonTools() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param <T>
	 *            不要管客户端传递的数据类型，只要保证服务器和客户端所用的类型一致即可
	 * @param jsonString
	 * @param cls
	 * @return
	 */
	public static <T> T getObject(String jsonString, Class<T> cls) {
		T t = null;

		try {
			//Gson gson = new Gson();
			Gson gson = new GsonBuilder().create();
			t = gson.fromJson(jsonString, cls);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return t;
	}


	/**
	 * 使用Gson进行解析 List<Person>
	 *
	 * @param <T>
	 * @param jsonString
	 * @param cls
	 * @return
	 */
	public  static <T> T getObjects(String jsonString,Type type) {
		T t = null;
		try {
			Gson gson = new GsonBuilder().create();
			// 这里的TypeToken是google提供的反射机制，避免像纯粹的JSON解析时复杂的迭代
			t = gson.fromJson(jsonString, new TypeToken<ArrayList<T>>() {
			}.getType());
		} catch (Exception e) {
			System.out.println("error = " + e.toString());
		}
		return t;
	}


}
