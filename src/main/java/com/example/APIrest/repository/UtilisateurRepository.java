package com.example.APIrest.repository;

import com.example.APIrest.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {


}
