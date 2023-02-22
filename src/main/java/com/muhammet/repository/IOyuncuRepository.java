package com.muhammet.repository;

import com.muhammet.repository.entity.Oyuncu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOyuncuRepository extends JpaRepository<Oyuncu,Long> {
}
