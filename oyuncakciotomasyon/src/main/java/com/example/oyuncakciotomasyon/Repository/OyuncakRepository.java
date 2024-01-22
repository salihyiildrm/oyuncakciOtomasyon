package com.example.oyuncakciotomasyon.Repository;

import com.example.oyuncakciotomasyon.Entities.Oyuncak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OyuncakRepository extends JpaRepository<Oyuncak, Long> {
}