package org.example.Simple_Factory.Example1;

public class BlogPost implements PostInterface {
    private String title;
    private String description;
    private int likes;
    private int comments;
    private String author;
    private String platform;

    public BlogPost(String title, String description, int likes, int comments) {
        this.title = title;
        this.description = description;
        this.likes = likes;
        this.comments = comments;
        this.platform = "Blog";
        this.author = "Blog";
    }

    @Override
    public void getLikes() {
        System.out.println("Likes: " + likes);
    }

    @Override
    public void getTitle() {
        System.out.println("Title: " + title);
    }

    @Override
    public void getDescription() {
        System.out.println("Description: " + description);
    }

    @Override
    public void getComments() {
        System.out.println("Comments: " + comments);
    }

    @Override
    public void getPlatform() {
        System.out.println("Platform: " + platform);
    }

    @Override
    public void getAuthor() {
        System.out.println("Author: " + author);
    }
}
