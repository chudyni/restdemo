package com.example.restdemo.data;

import com.example.restdemo.domain.Article;
import com.example.restdemo.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Optional;

/**
 * Created by marcin.bracisiewicz
 */
@Component
public class DataLoader {

    @Autowired
    public ArticleRepository articleRepository;

    @PostConstruct
    public void init() {
        final Article article = new Article("First", "Nothing special");

        Optional.ofNullable(this.articleRepository.findByTitle("First"))
                .orElse(this.articleRepository.save(article));
    }

}
