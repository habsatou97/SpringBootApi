package com.example.APIrest.services;

import com.example.APIrest.models.Utilisateur;
import com.example.APIrest.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UtilisateurServiceImpl implements UtilisateurService{
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Override
    public List<Utilisateur> getAllUsers() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Optional<Utilisateur> getUser(Long id) {
        return utilisateurRepository.findById(id);
    }

    @Override
    public Utilisateur create(Utilisateur u) {
        return utilisateurRepository.saveAndFlush(u);
    }

    @Override
    public Utilisateur update(Utilisateur u, Long id) {
        Utilisateur user=new Utilisateur(id);
        user.setAge(u.getAge());
        user.setFirstname(u.getFirstname());
        user.setLastname(u.getLastname());
        user.setEmail(u.getEmail());
        user.setPassword(u.getPassword());
        return utilisateurRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        utilisateurRepository.deleteById(id);

    }
}
