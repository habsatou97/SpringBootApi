package com.example.APIrest.services;

import com.example.APIrest.models.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    public List<Post> getALLPost();
    public Optional<Post> getPost(Long id);
    public Post CreatePost(Post p);
    public Post update(Post p,Long id);
    public void delete(Long id);


}
