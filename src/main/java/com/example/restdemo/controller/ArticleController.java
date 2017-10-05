package com.example.restdemo.controller;

import com.example.restdemo.domain.Article;
import com.example.restdemo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by marcin.bracisiewicz
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    public ArticleService articleService;

    @GetMapping("/{id}")
    public Article getArticle(@PathVariable long id) {
        return this.articleService.getArticle(id);
    }

    @GetMapping("/byTitle/{title}")
    public Article getArticleByTitle(@PathVariable String title) {
        return this.articleService.findByTitle(title);
    }

    @GetMapping("/byContent/{content}")
    public Article getArticleByContent(@PathVariable String content) {
        return this.articleService.findByContent(content);
    }

    @GetMapping("/")
    public List<Article> getArticlesList() {
        return this.articleService.getArticlesList();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public Article create(@RequestBody final Article article) {
        return this.articleService.create(article);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Article update(@PathVariable long id, @RequestBody Article update) {
        return this.articleService.update(id, update);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable final Long id) {
        this.articleService.delete(id);
    }

}
