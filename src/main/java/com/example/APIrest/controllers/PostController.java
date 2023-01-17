package com.example.APIrest.controllers;

import com.example.APIrest.models.Post;
import com.example.APIrest.models.Utilisateur;
import com.example.APIrest.repository.PostRepository;
import com.example.APIrest.repository.UtilisateurRepository;
import com.example.APIrest.services.PostService;
import com.example.APIrest.services.UtilisateurService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
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
        public Optional<Post> getUser(Long id)
        {
            return postService.getPost(id);
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
        public void delete(@PathVariable Long id)
        {
            postService.delete(id);
        }
}
