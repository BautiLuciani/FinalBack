package com.example.EntregableBackLuciani.repository;

import com.example.EntregableBackLuciani.model.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo,Long> {
}
