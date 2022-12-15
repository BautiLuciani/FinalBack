package com.example.EntregableBackLuciani.service;

import com.example.EntregableBackLuciani.model.Paciente;
import com.example.EntregableBackLuciani.model.PacienteDTO;
import com.example.EntregableBackLuciani.repository.IPacienteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PacienteService implements IPacienteService{

    @Autowired
    IPacienteRepository pacienteRepository;

    @Autowired
    ObjectMapper mapper;

    public void crearPaciente(PacienteDTO pacienteDTO) {
        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
        pacienteRepository.save(paciente);
    }


    public PacienteDTO buscarPaciente(Long id){
        PacienteDTO pacienteDTO = null;
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        if(paciente.isPresent()){
            pacienteDTO = mapper.convertValue(paciente, PacienteDTO.class);
        }
        return pacienteDTO;
    }

    public Collection<PacienteDTO> buacarTodos(){

        List<Paciente> pacientes = pacienteRepository.findAll();
        Set<PacienteDTO> pacientesDTO = new HashSet<>();
        for (Paciente paciente:pacientes){
            PacienteDTO pacienteDTO = new PacienteDTO();
            pacienteDTO = mapper.convertValue(paciente,PacienteDTO.class);
            pacientesDTO.add(pacienteDTO);

        }
        return pacientesDTO;
    }

    public void actualizar(PacienteDTO pacienteDTO) {
        Paciente paciente = mapper.convertValue(pacienteDTO,Paciente.class);
        pacienteRepository.save(paciente);
    }

    public void eliminar(Long id){
        pacienteRepository.deleteById(id);
    }




}
