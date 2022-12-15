package com.example.EntregableBackLuciani.repository;

import com.example.EntregableBackLuciani.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente,Long> {
}
