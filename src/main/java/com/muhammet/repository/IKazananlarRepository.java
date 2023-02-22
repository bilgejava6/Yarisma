package com.muhammet.repository;

import com.muhammet.repository.entity.Kazananlar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKazananlarRepository extends JpaRepository<Kazananlar,Long> {
}
