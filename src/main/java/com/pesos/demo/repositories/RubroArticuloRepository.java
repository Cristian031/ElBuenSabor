package com.pesos.demo.repositories;

import com.pesos.TP1JPA.Entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroArticuloRepository extends JpaRepository <Rubro, Long> {
}
