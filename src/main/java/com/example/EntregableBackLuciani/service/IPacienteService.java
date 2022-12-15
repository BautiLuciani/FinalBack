package com.example.EntregableBackLuciani.service;

import com.example.EntregableBackLuciani.model.PacienteDTO;

import java.util.Collection;

public interface IPacienteService {

    public void crearPaciente(PacienteDTO pacienteDTO);


    public PacienteDTO buscarPaciente(Long id);


    public Collection<PacienteDTO> buacarTodos();


    public void actualizar(PacienteDTO pacienteDTO);


    public void eliminar(Long id);


}
