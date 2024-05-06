package com.example.kanban.Services;

import com.example.kanban.Models.Projet;
import com.example.kanban.Repositories.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProjetService {

    private final ProjetRepository projetRepository;

    @Autowired
    public ProjetService(ProjetRepository projetRepository) {
        this.projetRepository = projetRepository;
    }

    public List<Projet> getAllProjets() {
        return projetRepository.findAll();
    }

    public Projet createProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    public Projet getProjetById(Long id) {
        Optional<Projet> projetOptional = projetRepository.findById(id);
        return projetOptional.orElse(null);
    }

    public void deleteProjet(Long id) {
        projetRepository.deleteById(id);
    }

    public Projet updateProjet(Long id, Projet projet) {
        Optional<Projet> existingProjetOptional = projetRepository.findById(id);
        if (existingProjetOptional.isPresent()) {
            projet.setId(id);
            return projetRepository.save(projet);
        } else {
            return null;
        }
    }
}
