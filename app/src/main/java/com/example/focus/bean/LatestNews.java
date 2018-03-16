package com.example.focus.bean;

import java.util.List;

/**
 * 作 者： ZUST_YTH
 * 日 期： 2018/3/16
 * 时 间： 22:47
 * 项 目： Focus
 * 描 述：
 */

public class LatestNews {

    /**
     * date : 20180315
     * stories : [{"title":"今年 315 晚会上曝光的食品安全知识，我们都帮你总结好了","ga_prefix":"031522","images":["https://pic1.zhimg.com/v2-233689991a22a34c5405eb23a64fff4c.jpg"],"multipic":true,"type":0,"id":9674362},{"images":["https://pic1.zhimg.com/v2-4b603f8d784e71b5201c1b04af8f1108.jpg"],"type":0,"id":9674356,"ga_prefix":"031522","title":"小事 · 对，就是有这种操作"},{"images":["https://pic3.zhimg.com/v2-220b7643c7f1bc9731a3e7cae928a87a.jpg"],"type":0,"id":9674353,"ga_prefix":"031521","title":"「只要你不抛弃我，要我怎么样都可以」"},{"images":["https://pic3.zhimg.com/v2-85fb6ead6c71f423e29c372cc5c231fe.jpg"],"type":0,"id":9674333,"ga_prefix":"031519","title":"库里，这个爱笑的傻小子，他 30 岁了"},{"images":["https://pic1.zhimg.com/v2-0fc118e27248564a76b32a92d488167c.jpg"],"type":0,"id":9674310,"ga_prefix":"031519","title":"孩子说「爸妈，我要买兰博基尼」，父母该怎么回应？"},{"images":["https://pic1.zhimg.com/v2-1971734a6cc9ca59ddb4c6793729ce4c.jpg"],"type":0,"id":9673801,"ga_prefix":"031517","title":"工作学习中，有哪些更有效率的思维方式？"},{"images":["https://pic3.zhimg.com/v2-8527025e94b5972d8ab78a7e495874f6.jpg"],"type":0,"id":9674301,"ga_prefix":"031517","title":"315 这天蓝标员工称遭 HR 强行辞退，这么做真的没问题吗？"},{"images":["https://pic1.zhimg.com/v2-32e61cd748ed9be24156ddb0b4d6ddb8.jpg"],"type":0,"id":9674197,"ga_prefix":"031515","title":"大公司面试技术岗，面试官更看重什么？"},{"images":["https://pic1.zhimg.com/v2-0c75027928ffc51cf4e35415c4f38110.jpg"],"type":0,"id":9674125,"ga_prefix":"031514","title":"所有人都在怀念霍金，却少有人知道「渐冻」的过程有多痛苦"},{"images":["https://pic3.zhimg.com/v2-67bfe16b6f48c32eccac6becde9bead6.jpg"],"type":0,"id":9674065,"ga_prefix":"031512","title":"大误 · 一看你就是玩音乐的"},{"images":["https://pic2.zhimg.com/v2-37dab3daa2973be34085c29b5a524205.jpg"],"type":0,"id":9674164,"ga_prefix":"031510","title":"职场与家庭，女性是不是真的不能兼顾？"},{"images":["https://pic3.zhimg.com/v2-6a6b65212c177d22060d6118bc17a796.jpg"],"type":0,"id":9673878,"ga_prefix":"031509","title":"「药不能吃太好的，那样吃普通的就没效了\u2026\u2026」"},{"images":["https://pic4.zhimg.com/v2-d6ee482a25cf3afdebe302b66f8d291b.jpg"],"type":0,"id":9672944,"ga_prefix":"031508","title":"「姨妈疼」能用避孕药缓解，但你得先搞清楚一件事"},{"images":["https://pic4.zhimg.com/v2-c67adb0be2982c86a2e711eb44619bc3.jpg"],"type":0,"id":9674102,"ga_prefix":"031507","title":"城市青年避坑手册 · 高铁餐吃出虫，不是默默不吃就完事了"},{"images":["https://pic3.zhimg.com/v2-2a4c91b1e13a25095ca06d6a90c59096.jpg"],"type":0,"id":9674155,"ga_prefix":"031507","title":"这款教你在夜店泡妞的游戏，也许能成为相亲指南"},{"images":["https://pic4.zhimg.com/v2-77c491f3e8fd33e6aeb3ae721c555537.jpg"],"type":0,"id":9673602,"ga_prefix":"031507","title":"30 年过去，中国第一批丁克们怎么样了？"},{"images":["https://pic4.zhimg.com/v2-da9410a0a0d4638a3a84d90c40ffd377.jpg"],"type":0,"id":9673382,"ga_prefix":"031506","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic1.zhimg.com/v2-6914c51d786e5174f41ee571d719bcfc.jpg","type":0,"id":9674362,"ga_prefix":"031522","title":"今年 315 晚会上曝光的食品安全知识，我们都帮你总结好了"},{"image":"https://pic4.zhimg.com/v2-66a4900d10495d58d74f3b4381e4bf6b.jpg","type":0,"id":9674310,"ga_prefix":"031519","title":"孩子说「爸妈，我要买兰博基尼」，父母该怎么回应？"},{"image":"https://pic3.zhimg.com/v2-fba12be3ef2eca799ed23d2446225e7e.jpg","type":0,"id":9674301,"ga_prefix":"031517","title":"315 这天蓝标员工称遭 HR 强行辞退，这么做真的没问题吗？"},{"image":"https://pic2.zhimg.com/v2-03381e024e5626dd33fcf2ddb7579c45.jpg","type":0,"id":9673801,"ga_prefix":"031517","title":"工作学习中，有哪些更有效率的思维方式？"},{"image":"https://pic4.zhimg.com/v2-526ae7288f1067520dfb4d6c735e41ff.jpg","type":0,"id":9674125,"ga_prefix":"031514","title":"所有人都在怀念霍金，却少有人知道「渐冻」的过程有多痛苦"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * title : 今年 315 晚会上曝光的食品安全知识，我们都帮你总结好了
         * ga_prefix : 031522
         * images : ["https://pic1.zhimg.com/v2-233689991a22a34c5405eb23a64fff4c.jpg"]
         * multipic : true
         * type : 0
         * id : 9674362
         */

        private String title;
        private String ga_prefix;
        private boolean multipic;
        private int type;
        private int id;
        private List<String> images;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic1.zhimg.com/v2-6914c51d786e5174f41ee571d719bcfc.jpg
         * type : 0
         * id : 9674362
         * ga_prefix : 031522
         * title : 今年 315 晚会上曝光的食品安全知识，我们都帮你总结好了
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
