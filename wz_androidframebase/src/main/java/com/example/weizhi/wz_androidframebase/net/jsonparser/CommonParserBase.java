package com.example.weizhi.wz_androidframebase.net.jsonparser;

import com.example.weizhi.wz_androidframebase.net.jsonparser.inferface.IParser;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class CommonParserBase implements IParser {
	private static Gson gson = new Gson();
	@Override
	public Object fromJson(JSONObject object) {
		return null;
	}

	@Override
	public JsonParserBase fromJson(String json, final Class clazz) {
		return gson.fromJson(json, type(JsonParserBase.class, clazz));

	}

	static ParameterizedType type(final Class raw, final Type... args) {
		return new ParameterizedType() {
			public Type getRawType() {
				return raw;
			}

			public Type[] getActualTypeArguments() {
				return args;
			}

			public Type getOwnerType() {
				return null;
			}
		};
	}


}
