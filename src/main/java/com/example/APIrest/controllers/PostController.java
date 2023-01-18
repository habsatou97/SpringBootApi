package com.example.APIrest.controllers;

import com.example.APIrest.exceptions.PostNotFoundException;
import com.example.APIrest.models.Post;
import com.example.APIrest.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/posts")
public class PostController {
        @Autowired
        private PostService postService;

        @GetMapping("/posts")
        public List<Post> getAllposts(){
            return postService.getALLPost();
        }
        @GetMapping("/posts/{id}")
        public Post getPost(Long id)
        {
            return postService.getPost(id)
            .orElseThrow(() -> new PostNotFoundException(id));
        }
        @PostMapping("/posts")
        public Post create(@RequestBody  Post post)
        {
            return postService.CreatePost(post);
        }
        @RequestMapping(value = "id",method = RequestMethod.PUT)
        public Post update(@RequestBody Post post,@PathVariable Long id)
        {
            return postService.update(post,id);
        }
        @RequestMapping(value="id",method = RequestMethod.DELETE)
        public void delete(@PathVariable Long id) throws PostNotFoundException
        {
            postService.delete(id);

        }
}
