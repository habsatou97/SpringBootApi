package com.example.APIrest.exceptions;

public class UtilisateurNotFoundException extends RuntimeException{
    UtilisateurNotFoundException(Long id){
        super("Couldn't find Utilisateur: "+ id);
    }
}
