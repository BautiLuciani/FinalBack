package com.example.EntregableBackLuciani.controller;

import com.example.EntregableBackLuciani.model.TurnoDTO;
import com.example.EntregableBackLuciani.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    @Autowired
    ITurnoService turnoService;


    @PostMapping
    public ResponseEntity<?> registrarTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.crearTurno(turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<TurnoDTO> listar(){
        return turnoService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable long id)
    {
        turnoService.eliminar(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
