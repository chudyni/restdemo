package com.example.restdemo.repository;

import com.example.restdemo.domain.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by marcin.bracisiewicz
 */
@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

    Article findByTitle(@Param("title") final String title);

}
