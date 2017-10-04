package com.example.restdemo.service.impl;

import com.example.restdemo.domain.Article;
import com.example.restdemo.repository.ArticleRepository;
import com.example.restdemo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by marcin.bracisiewicz
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    public ArticleRepository articleRepository;

    public Article getArticle(final long id) {
        return this.articleRepository.findOne(id);
    }

    @Override
    public List<Article> getArticlesList() {
        return (List<Article>) this.articleRepository.findAll();
    }

    @Override
    public Article update(Long id, Article update) {
        final Article article = this.articleRepository.findOne(id);
        Optional.ofNullable(update.getContent()).ifPresent(c -> article.setContent(c));
        return this.articleRepository.save(article);
    }

    @Override
    public void delete(Long id) {
        this.articleRepository.delete(id);
    }

    @Override
    public Article create(Article article) {
        return this.articleRepository.save(article);
    }
}
