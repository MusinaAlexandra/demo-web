package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> list = new ArrayList<Post>();
        for (int i = 1; i<= 3; i++) {
            Post post = new Post();
            post.setText("Text " + i);
            post.setLikes(i);
            list.add(post);
        }
        return list;
    }
}
