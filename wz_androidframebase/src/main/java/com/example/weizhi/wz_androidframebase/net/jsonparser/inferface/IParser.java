package com.example.weizhi.wz_androidframebase.net.jsonparser.inferface;

import org.json.JSONObject;

public interface IParser {
	Object fromJson(JSONObject object);

	Object fromJson(String json, Class clazz);
}
