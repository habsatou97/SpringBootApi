package com.example.APIrest;

import com.example.APIrest.models.Post;
import com.example.APIrest.models.Utilisateur;
import com.example.APIrest.repository.PostRepository;
import com.example.APIrest.repository.UtilisateurRepository;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.metamodel.Metamodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class ApIrestApplication implements CommandLineRunner{

private UtilisateurRepository utilisateurRepository;
private PostRepository postRepository;

    static public void main(String[] args){

        SpringApplication.run(ApIrestApplication.class,args);

    }

    @Override
    public void run(String... args) throws Exception {
        utilisateurRepository.save(new Utilisateur(123L,26,"Habsatou","Thiam","thiamhabsatou5@gmail.com","habsa123"));
        utilisateurRepository.save(new Utilisateur(1234L,26,"absatou","Thiam","thiamhabsatou5@gmail.com","habsa123"));
        utilisateurRepository.save(new Utilisateur(12345L,26,"satou","Thiam","thiamhabsatou5@gmail.com","habsa123"));
        utilisateurRepository.save(new Utilisateur(123456L,26,"Habsa","Thiam","thiamhabsatou5@gmail.com","habsa123"));

        postRepository.save(new Post(123L,"ceci est mon premier post",123,456));
        postRepository.save(new Post(1234L,"ceci est mon deuxieme post",12,56));
        postRepository.save(new Post(12345L,"ceci est mon troisieme post",23,45));
        postRepository.save(new Post(123456L,"ceci est mon quatrieme post",1234,4567));

    }
}
