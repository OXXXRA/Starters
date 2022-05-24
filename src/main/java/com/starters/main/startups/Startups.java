package com.starters.main.startups;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="startups")
public class Startups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="content")
    private String content;
    @Column(name="authors")
    private int[] authors;
    @Column(name="rating")
    private int rating;
    @Column(name="jobs")
    private int[] jobs;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="comments_id")
    private int comments_id;
    @Column(name= "status")
    private int status;

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int[] getAuthors() {
        return authors;
    }

    public void setAuthors(int[] authors) {
        this.authors = authors;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int[] getJobs() {
        return jobs;
    }

    public void setJobs(int[] jobs) {
        this.jobs = jobs;
    }

    public int getComments_id() {
        return comments_id;
    }

    public void setComments_id(int comments_id) {
        this.comments_id = comments_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}