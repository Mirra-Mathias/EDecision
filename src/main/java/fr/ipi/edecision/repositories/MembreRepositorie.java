package fr.ipi.edecision.repositories;

import fr.ipi.edecision.entities.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembreRepositorie extends JpaRepository<Membre, Integer> {
}
