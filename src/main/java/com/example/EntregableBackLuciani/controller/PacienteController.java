package com.example.EntregableBackLuciani.controller;

import com.example.EntregableBackLuciani.model.PacienteDTO;
import com.example.EntregableBackLuciani.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    IPacienteService pacienteService;


    @PostMapping
    public ResponseEntity<?> registrarPaciente(@RequestBody PacienteDTO pacienteDTO)
    {
        pacienteService.crearPaciente(pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public PacienteDTO buscar(@PathVariable long id )
    {
        return pacienteService.buscarPaciente(id);

    }

    @PutMapping()
    public ResponseEntity<?> actualizar(@RequestBody PacienteDTO pacienteDTO)
    {
        pacienteService.actualizar(pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable long id)
    {
        pacienteService.eliminar(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/list")
    public Collection<PacienteDTO> listar(){
        return pacienteService.buacarTodos();
    }

}
