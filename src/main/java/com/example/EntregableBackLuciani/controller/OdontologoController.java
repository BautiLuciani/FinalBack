package com.example.EntregableBackLuciani.controller;

import com.example.EntregableBackLuciani.model.OdontologoDTO;
import com.example.EntregableBackLuciani.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/odontologo")
public class OdontologoController {

    @Autowired
    IOdontologoService odontologoService;

    @PostMapping
    public ResponseEntity<?> registrarOdontologo(@RequestBody OdontologoDTO odontologoDTO) {
        odontologoService.crearOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public OdontologoDTO buscar(@PathVariable long id ){
        return odontologoService.buscarOdontologo(id);

    }

    @PutMapping()
    public ResponseEntity<?> actualizar(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.actualizar(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable long id){
        odontologoService.eliminar(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/list")
    public Collection<OdontologoDTO> listar(){
        return odontologoService.buacarTodos();
    }

}
