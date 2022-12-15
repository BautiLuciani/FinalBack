package com.example.EntregableBackLuciani.service;

import com.example.EntregableBackLuciani.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    public void insert (Usuario usuario) ;


    public List<Usuario> readAll();


}
