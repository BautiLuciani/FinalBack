package com.example.EntregableBackLuciani.service;

import com.example.EntregableBackLuciani.model.Turno;
import com.example.EntregableBackLuciani.model.TurnoDTO;
import com.example.EntregableBackLuciani.repository.ITurnoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class TurnoService implements ITurnoService{

    @Autowired
    ITurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;


    public void crearTurno(TurnoDTO turnoDTO)
    {
        Turno turno =mapper.convertValue(turnoDTO,Turno.class);
        turnoRepository.save(turno);
    }

    public Collection<TurnoDTO> buscarTodos(){
        List<Turno> turnos = turnoRepository.findAll();

        Set<TurnoDTO> turnosDTO = new HashSet<>();
        for (Turno turno:turnos){
            TurnoDTO turnoDTO = new TurnoDTO();
            turnoDTO = mapper.convertValue(turno,TurnoDTO.class);
            turnosDTO.add(turnoDTO);

        }
        return turnosDTO;
    }


    public void eliminar(Long id){
        turnoRepository.deleteById(id);
    }




}
