package com.example.APIrest.services;

import com.example.APIrest.models.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface UtilisateurService {
     public List<Utilisateur> getAllUsers();
     public Optional<Utilisateur> getUser(Long id);
     public Utilisateur create(Utilisateur u);
     public Utilisateur update(Utilisateur u,Long id);
     public void delete(Long id);
}
