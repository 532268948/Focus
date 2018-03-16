package com.example.focus.bean;

import java.util.List;

/**
 * 作 者： ZUST_YTH
 * 日 期： 2018/3/16
 * 时 间： 23:07
 * 项 目： Focus
 * 描 述：
 */

public class Comment {

    private List<CommentsBean> comments;

    public List<CommentsBean> getComments() {
        return comments;
    }

    public void setComments(List<CommentsBean> comments) {
        this.comments = comments;
    }

    public static class CommentsBean {
        /**
         * author : Marili
         * content : 每一位运动员都是很不容易的，我大学四年有幸参加了学校的某个体育社团，竞争真的很残酷，就是末位淘汰，就是让你付出常人难以想象的精力，每一次胜利都会让喜悦充满整个身体，导致现在只要看到别人拿了冠军就会感动的泪流满面。
         * avatar : http://pic4.zhimg.com/b159ed0b6b7e158c69ac954be086b87b_im.jpg
         * time : 1521116735
         * id : 31336226
         * likes : 1
         */

        private String author;
        private String content;
        private String avatar;
        private int time;
        private int id;
        private int likes;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }
    }
}
