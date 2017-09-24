package com.example.restdemo.domain;

import com.example.restdemo.domain.Article;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by marcin.bracisiewicz
 */
@Projection(name = "articleTeaser", types = Article.class)
public interface ArticleTeaser {

    Long getId();

    String getTitle();

}
