package com.example.kanban.Repositories;

import com.example.kanban.Models.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet, Long> {

}
