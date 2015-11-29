package com.example.administrator.wz_collection.gson_code.bean;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * json数据格式：
 *
 {
 "member_info":{//会员信息
 "member_name":"cuiqiang1",//会员名
 "member_avatar":"Tango-Emote-10.png"//会员头像
 },
 "rets":[//评论内容信息
 {
 "id":"15",//评论id
 "dynamic_id":"20",//新闻id
 "content":"恐龙模块",//评论内容
 "comment_praised_count":"1",//评论点赞数
 "replay_count":"0",//评论回复数
 "time":"07月24日 09:54",//评论时间
 "title":"dfsdfasdfasdf",//新闻标题
 "title_img":"http://taihu.hylapp.com/uploads/img/20140902/1409628892119675.jpg",//新闻图片
 "comment_count":"1",//新闻评论数量
 "collect_count":"2",//新闻收藏数量
 "share_count":"1",//新闻分享数量
 "praised_count":"1",//新闻点赞数量
 "is_comment":"0",////是否允许评论  0：否 1：是
 "url":"http://taihu.hylapp.com/mobile/index.php/news/news_detail?id=20",//新闻url
 "is_collect":"0",//新闻是否已收藏 0：否 1：是
 "is_praised":"0"//新闻是否已点赞 0：否 1：是
 }
 ]
 }
 * */

/**
 * 使用方式：是遇到一个大括号就是用一个内部类
 * 中括号就是说明这个内部类有多个 如上面的rets里面还有多个大括号
 * */
public class pcenerInfoBean2 implements Serializable{

	private static final long serialVersionUID = -1047787483957733006L;


	private InnerData_member_info member_info;
	private ArrayList<InnerData_rets> rets;





	public InnerData_member_info getMember_info() {
		return member_info;
	}

	public void setMember_info(InnerData_member_info member_info) {
		this.member_info = member_info;
	}

	public ArrayList<InnerData_rets> getRets() {
		return rets;
	}

	public void setRets(ArrayList<InnerData_rets> rets) {
		this.rets = rets;
	}

	public class InnerData_member_info implements Serializable{
		private String member_name;
		private String member_avatar;
		public String getMember_name() {
			return member_name;
		}
		public void setMember_name(String member_name) {
			this.member_name = member_name;
		}
		public String getMember_avatar() {
			return member_avatar;
		}
		public void setMember_avatar(String member_avatar) {
			this.member_avatar = member_avatar;
		}
	}

	public class InnerData_rets implements Serializable{
		private String id ;
		private String dynamic_id;
		private String content;
		private String comment_praised_count;
		private String replay_count;
		private String time;
		private String title;
		private String title_img;
		private String comment_count;
		private String collect_count;
		private String share_count;
		private String praised_count;
		private String is_comment;
		private String url;
		private String is_collect;
		private String is_praised;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getDynamic_id() {
			return dynamic_id;
		}
		public void setDynamic_id(String dynamic_id) {
			this.dynamic_id = dynamic_id;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getComment_praised_count() {
			return comment_praised_count;
		}
		public void setComment_praised_count(String comment_praised_count) {
			this.comment_praised_count = comment_praised_count;
		}
		public String getReplay_count() {
			return replay_count;
		}
		public void setReplay_count(String replay_count) {
			this.replay_count = replay_count;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getTitle_img() {
			return title_img;
		}
		public void setTitle_img(String title_img) {
			this.title_img = title_img;
		}
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
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
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
	}
}