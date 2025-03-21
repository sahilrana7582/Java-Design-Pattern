package org.example.Simple_Factory.Example1;

public class Main {
    public static void main(String[] args) {

        PostInterface instagramPost = PostFactory.createPost("Instagram");
        System.out.println("-------- Instagram Post --------");
        instagramPost.getPlatform();
        instagramPost.getTitle();
        instagramPost.getDescription();
        instagramPost.getLikes();
        instagramPost.getComments();
        instagramPost.getAuthor();

        System.out.println("-------- Blog Post --------");
        PostInterface blogPost = PostFactory.createPost("Blog");
        blogPost.getPlatform();
        blogPost.getTitle();
        blogPost.getDescription();
        blogPost.getLikes();
        blogPost.getComments();
        blogPost.getAuthor();

    }
}
