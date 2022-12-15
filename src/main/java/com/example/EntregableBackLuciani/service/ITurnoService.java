package com.example.EntregableBackLuciani.service;

import com.example.EntregableBackLuciani.model.TurnoDTO;

import java.util.Collection;

public interface ITurnoService {



    public void crearTurno(TurnoDTO turnoDTO);

    public Collection<TurnoDTO> buscarTodos();

    public void eliminar(Long id);




}

