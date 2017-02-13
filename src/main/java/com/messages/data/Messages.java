package com.messages.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by WagnerMestrinho on 2/9/17.
 */
@Entity
public class Messages {
    @Id
    @GeneratedValue
    private long id;
    private String content;
    private String author;

    public Messages() {
    }

    public Messages(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
