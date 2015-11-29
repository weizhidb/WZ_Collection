package com.example.administrator.wz_collection.gson_code.bean;

import java.io.Serializable;


/**
 * json数据格式：
 *
 * {
 "code": 200,
 "message": "成功",
 "data": {
 "comment_count": "1",
 "collect_count": "0",
 "share_count": "2",
 "praised_count": "1",
 "is_comment": "1",
 "is_collect": "0",
 "is_praised": "0",
 "url": "http://taihu.hylapp.com/mobile/index.php/news/news_detail_page?id=31",
 "dynamic_id": "31"
 }
 }
 *
 * */
public class newsDetailBean implements Serializable{

	/*变量的名字一定要一样*/
	private String code;
	private String message;
	private InnerData data ;



	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public InnerData getData() {
		return data;
	}

	public void setData(InnerData data) {
		this.data = data;
	}



	public class InnerData implements Serializable{
		private String comment_count;
		private String collect_count;
		private String share_count;
		private String praised_count;
		private String is_comment;

		public String getComment_count() {
			return comment_count;
		}

		public void setComment_count(String comment_count) {
			this.comment_count = comment_count;
		}

		public String getCollect_count() {
			return collect_count;
		}

		public void setCollect_count(String collect_count) {
			this.collect_count = collect_count;
		}

		public String getShare_count() {
			return share_count;
		}

		public void setShare_count(String share_count) {
			this.share_count = share_count;
		}

		public String getPraised_count() {
			return praised_count;
		}

		public void setPraised_count(String praised_count) {
			this.praised_count = praised_count;
		}

		public String getIs_comment() {
			return is_comment;
		}

		public void setIs_comment(String is_comment) {
			this.is_comment = is_comment;
		}

		public String getIs_collect() {
			return is_collect;
		}

		public void setIs_collect(String is_collect) {
			this.is_collect = is_collect;
		}

		public String getIs_praised() {
			return is_praised;
		}

		public void setIs_praised(String is_praised) {
			this.is_praised = is_praised;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getDynamic_id() {
			return dynamic_id;
		}

		public void setDynamic_id(String dynamic_id) {
			this.dynamic_id = dynamic_id;
		}

		private String is_collect;
		private String is_praised;
		private String url;
		private String dynamic_id;
	}
}
