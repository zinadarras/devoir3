package com.zaina.marque.repos;

import com.zaina.marque.entities.Marque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarqueRepository extends JpaRepository<Marque,Long> {
    Marque findByCodeMarque(String codeMarque);
}
