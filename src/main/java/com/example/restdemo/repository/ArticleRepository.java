package com.example.restdemo.repository;

import com.example.restdemo.domain.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by marcin.bracisiewicz
 */
@RepositoryRestResource(path = "arts")
public interface ArticleRepository extends CrudRepository<Article, Long> {

    Article findByTitle(@Param("title") final String title);

}
