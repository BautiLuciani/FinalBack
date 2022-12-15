package com.example.EntregableBackLuciani.service;

import com.example.EntregableBackLuciani.model.OdontologoDTO;

import java.util.Collection;

public interface IOdontologoService {

    public void crearOdontologo(OdontologoDTO odontologoDTO);

    public OdontologoDTO buscarOdontologo(Long id);

    public Collection<OdontologoDTO> buacarTodos();

    public void actualizar(OdontologoDTO odontologoDTO);

    public void eliminar(Long id);
}