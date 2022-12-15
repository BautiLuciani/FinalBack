package com.example.EntregableBackLuciani.controller;

import com.example.EntregableBackLuciani.model.Usuario;
import com.example.EntregableBackLuciani.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    IUsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<?> insert(@RequestBody Usuario usuario){
        usuarioService.insert(usuario);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }


    @GetMapping("/")
    public List<Usuario> readAll() {
        return usuarioService.readAll();
    }

}
