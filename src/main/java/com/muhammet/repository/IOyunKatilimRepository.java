package com.muhammet.repository;

import com.muhammet.repository.entity.OyunKatilim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOyunKatilimRepository extends JpaRepository<OyunKatilim,Long> {
}
