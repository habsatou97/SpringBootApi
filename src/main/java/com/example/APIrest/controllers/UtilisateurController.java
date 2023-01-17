package com.example.APIrest.controllers;

import com.example.APIrest.models.Utilisateur;
import com.example.APIrest.services.UtilisateurService;
import jakarta.transaction.Transactional;
import jdk.jshell.execution.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(path = "api/v1/utilisateurs")

public class UtilisateurController {
@Autowired
    private UtilisateurService utilisateurService;

@GetMapping("/utilisateurs")
    public List<Utilisateur> getAllUsers(){
    return utilisateurService.getAllUsers();
}
@GetMapping("/utilisateurs/{id}")
    public Optional<Utilisateur> getUser(Long id)
{
    return utilisateurService.getUser(id);
}
@PostMapping("/utilisateurs")
    public Utilisateur create(@RequestBody  Utilisateur utilisateur)
{
    return utilisateurService.create(utilisateur);
}
@RequestMapping(value = "id",method = RequestMethod.PUT)
    public Utilisateur update(@RequestBody Utilisateur utilisateur,@PathVariable Long id)
{
    return utilisateurService.update(utilisateur,id);
}
@RequestMapping(value="id",method = RequestMethod.DELETE)
public void delete(@PathVariable Long id)
{
    utilisateurService.delete(id);
}

}
