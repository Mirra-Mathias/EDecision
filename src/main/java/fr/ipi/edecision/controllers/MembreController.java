package fr.ipi.edecision.controllers;

import fr.ipi.edecision.entities.Membre;
import fr.ipi.edecision.repositories.MembreRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MembreController {

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    private final MembreRepositorie membreRepositorie;

    @Autowired
    public MembreController(MembreRepositorie membreRepositorie) {
        this.membreRepositorie = membreRepositorie;
    }

    @GetMapping("/membres")
    public List<Membre> getAllMembres() {
        return membreRepositorie.findAll();
    }

    @PostMapping(path = "register", consumes = "application/json", produces = "application/json")
    public Membre createMember(@RequestBody Membre membre) {
//        membre.setPassword(passwordEncoder.encode(membre.getPassword()));
        return membreRepositorie.save(membre);
    }

}
