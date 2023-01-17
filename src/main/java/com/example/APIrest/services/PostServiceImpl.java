package com.example.APIrest.services;

import com.example.APIrest.models.Post;
import com.example.APIrest.repository.PostRepository;

import java.util.List;
import java.util.Optional;

public class PostServiceImpl implements PostService{
    private PostRepository postRepository;
    @Override
    public List<Post> getALLPost() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> getPost(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public Post CreatePost(Post p) {
        return postRepository.saveAndFlush(p);
    }

    @Override
    public Post update(Post p, Long id) {
        Post post=new Post(id);
        post.setMessage(p.getMessage());
        post.setNbLikes(p.getNbLikes());
        post.setNbPartages(p.getNbPartages());

        return postRepository.saveAndFlush(post);
    }

    @Override
    public void delete(Long id) {
        postRepository.deleteById(id);

    }
}
