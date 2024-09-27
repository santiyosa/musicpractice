package com.example.musica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.musica.models.Band;


@Repository
public interface BandRepository extends JpaRepository<Band, Long> {
    
}
