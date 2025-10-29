package com.zaina.voiture.repos;

import com.zaina.voiture.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VoitureRepository extends JpaRepository<Voiture,Long > {

}
