package com.muhammet.repository;

import com.muhammet.repository.entity.Soru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISoruRepository extends JpaRepository<Soru,Long> {
}
