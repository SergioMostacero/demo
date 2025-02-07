package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.bandera;
@DestinoRepository
public interface MedallaRepository extends JpaRepository<Medalla,Long>{
    boolean existsByName(String name);
}
