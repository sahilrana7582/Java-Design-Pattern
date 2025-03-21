package org.example.Simple_Factory.Example1;

public class PostFactory {


    public static PostInterface createPost(String platform) {
        if (platform.equals("Blog")) {
            return new BlogPost("Blog Post", "Blog Description", 100, 50);
        } else if (platform.equals("Instagram")) {
            return new InstagramPost("Instagram Post", "Instagram Description", 200, 100);
        } else {
            return null;
        }
    }
}
