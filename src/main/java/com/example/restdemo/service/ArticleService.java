package com.example.restdemo.service;

import com.example.restdemo.domain.Article;

import java.util.List;

/**
 * Created by marcin.bracisiewicz
 */
public interface ArticleService {

    Article getArticle(final long id);

    Article findByContent(final String content);

    Article findByTitle(final String title);

    List<Article> getArticlesList();

    Article update(final Long id, final Article update);

    void delete(final Long id);

    Article create(final Article article);

}
