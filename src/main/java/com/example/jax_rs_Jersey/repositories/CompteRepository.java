package com.example.jax_rs_Jersey.repositories;

import com.example.jax_rs_Jersey.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}

