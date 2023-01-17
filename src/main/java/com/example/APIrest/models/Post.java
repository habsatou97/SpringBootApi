package com.example.APIrest.models;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "posts")
      public class Post {

      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private Long id;
      private String message;
      //private byte[] photo;
      private int NbLikes;
      private int NbPartages;

      @OneToMany
      @JoinColumn(name = "utilisateurs")
      private List<Utilisateur> posts;

      
      public Post() {
      }

      public Post(Long id) {
            this.id = id;
      }

      public Post(Long id, String message, int nbLikes, int nbPartages) {
            this.id = id;
            this.message = message;
            NbLikes = nbLikes;
            NbPartages = nbPartages;
      }

      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

      public String getMessage() {
            return message;
      }

      public void setMessage(String message) {
            this.message = message;
      }

      public int getNbLikes() {
            return NbLikes;
      }

      public void setNbLikes(int nbLikes) {
            NbLikes = nbLikes;
      }

      public int getNbPartages() {
            return NbPartages;
      }

      public void setNbPartages(int nbPartages) {
            NbPartages = nbPartages;
      }

      public List<Utilisateur> getPosts() {
            return posts;
      }

      public void setPosts(List<Utilisateur> posts) {
            this.posts = posts;
      }
}
