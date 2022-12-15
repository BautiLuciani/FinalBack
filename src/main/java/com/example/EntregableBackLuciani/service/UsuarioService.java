package com.example.EntregableBackLuciani.service;

import com.example.EntregableBackLuciani.model.Usuario;
import com.example.EntregableBackLuciani.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService , UserDetailsService {

    @Autowired
    IUsuarioRepository usuarioRepository;


    @Override
    public void insert(Usuario usuario)  {
        usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> readAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return usuarioRepository.getUserByNombre();
    }
}
