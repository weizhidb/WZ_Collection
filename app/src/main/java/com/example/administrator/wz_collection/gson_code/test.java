package com.example.administrator.wz_collection.gson_code;

public class test {

	//public static void main(String[] args) {

		//newsDetailBean的数据解析
		/*String path = "http://taihu.hylapp.com/mobile/index.php/news/news_detail?id=31";
		String data = HttpUtils.getJsonContent(path);
		System.out.println("data is = " + data);

		newsDetailBean news = GsonTools.getObject(data,
				newsDetailBean.class);
		System.out.println("code = " + news.getCode());
		System.out.println("message = " + news.getMessage());
		
		System.out.println("comment_count = " + news.getData().getComment_count());
		System.out.println("collect_count = " + news.getData().getCollect_count());*/



		//方法一
		//pcenerInfoBean的数据解析
//		String path1 = "http://taihu.hylapp.com/mobile/index.php/comment?curpage=1&token=8ee0a8908444699c16d824cfafb2b258";
//		String data = HttpUtils.getJsonContent(path1);
//		System.out.println("data is = " + data);

//		pcenerInfoBean info = GsonTools.getObject(data, pcenerInfoBean.class);
//		ArrayList<pcenerInfoBean.InnerData.InnerData_rets> rets = info.getData().getRets();
//		
//		System.out.println("code =" + info.getCode());
//		System.out.println("name = " + info.getData().getMember_info().getMember_name());
//		System.out.println("avatar = " + info.getData().getMember_info().getMember_avatar());
//		
//		for(pcenerInfoBean.InnerData.InnerData_rets r : rets){
//			System.out.println("title = " + r.getTitle());
//		}


		//方法二
		//parseJson.getInstancePtr().jugeFormat(data);
//		if(true == parseJson.getInstancePtr().jugeFormat(data)){
//			if(("200").equals(parseJson.getInstancePtr().getCode())){
//				pcenerInfoBean2 info2 = parseJson.getInstancePtr().json2Object(pcenerInfoBean2.class);
//				ArrayList<pcenerInfoBean2.InnerData_rets> rets = info2.getRets();
//				for(pcenerInfoBean2.InnerData_rets r : rets){
//					System.out.println("title = " + r.getTitle());
//				}
//			}
//		}

	//}
}
