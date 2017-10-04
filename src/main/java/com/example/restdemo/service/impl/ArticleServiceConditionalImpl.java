package com.example.restdemo.service.impl;

import com.example.restdemo.domain.Article;
import com.example.restdemo.service.ArticleService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marcin.bracisiewicz
 */
@Service
@ConditionalOnProperty(name = "article.service", havingValue = "blank")
public class ArticleServiceConditionalImpl implements ArticleService {

    @Override
    public Article getArticle(long id) {
        return null;
    }

    @Override
    public List<Article> getArticlesList() {
        return null;
    }

    @Override
    public Article update(Long id, Article update) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Article create(Article article) {
        return null;
    }

}
