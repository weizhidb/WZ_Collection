package com.example.weizhi.wz_androidframebase.net.bean;

import java.util.ArrayList;

/**
 * Created by weizhi on 2016/1/18.
 */
public class newsComment {
    public ArrayList<hot_comments> getHot_comment() {
        return hot_comment;
    }

    public void setHot_comment(ArrayList<hot_comments> hot_comment) {
        this.hot_comment = hot_comment;
    }

    private ArrayList<hot_comments> hot_comment = new ArrayList<hot_comments>();


    public ArrayList<new_comments> getNew_comment() {
        return new_comment;
    }

    public void setNew_comment(ArrayList<new_comments> new_comment) {
        this.new_comment = new_comment;
    }

    private ArrayList<new_comments> new_comment = new ArrayList<new_comments>();

    //热门评论
    public class hot_comments{

    }

    //最新评论
    public class new_comments{
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        String id;

        public String getMember_id() {
            return member_id;
        }

        public void setMember_id(String member_id) {
            this.member_id = member_id;
        }

        String member_id;
    }
}
