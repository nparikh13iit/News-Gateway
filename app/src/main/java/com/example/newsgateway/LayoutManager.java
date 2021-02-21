package com.example.newsgateway;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LayoutManager implements Serializable {

    private int source;
    private int article;
    private List<String> categories = new ArrayList<>();
    private List<Source> sources = new ArrayList<>();
    private List<Article> articles = new ArrayList<>();

    public void setSource(int source) {
        this.source = source;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}