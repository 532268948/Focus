package com.example.focus.util;

import com.example.focus.bean.Comment;
import com.example.focus.bean.LatestNews;
import com.example.focus.bean.News;
import com.example.focus.bean.StoryExtra;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * 作 者： ZUST_YTH
 * 日 期： 2018/3/16
 * 时 间： 22:44
 * 项 目： Focus
 * 描 述：
 */

public interface FocusService {
    @GET("api/4/news/latest")
    Observable<LatestNews> getLatestNews();

    @GET("api/4/news/before/{date}")
    Observable<LatestNews> getBeforeNews(@Path("date") String dateString);

    @GET("api/4/news/{id}")
    Observable<News> getNews(@Path("id") int id);

    @GET("api/4/story/{id}/long-comments")
    Observable<Comment> getComments(@Path("id") int id);

    @GET("api/4/story-extra/{id}")
    Observable<StoryExtra> getStroyExtra(@Path("id") int id);
}
