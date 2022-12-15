package com.example.EntregableBackLuciani.service;

import com.example.EntregableBackLuciani.model.Odontologo;
import com.example.EntregableBackLuciani.model.OdontologoDTO;
import com.example.EntregableBackLuciani.repository.IOdontologoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OdontologoService implements IOdontologoService {

    @Autowired
    IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;


    public void crearOdontologo(OdontologoDTO odontologoDTO) {
        Odontologo odontologo = mapper.convertValue(odontologoDTO,Odontologo.class);
        odontologoRepository.save(odontologo);
    }


    public OdontologoDTO buscarOdontologo(Long id){
        OdontologoDTO odontologoDTO = null;
        Optional<Odontologo> odontologo = odontologoRepository.findById(id);
        if(odontologo.isPresent()){
            odontologoDTO = mapper.convertValue(odontologo, OdontologoDTO.class);
        }
        return odontologoDTO;
    }

    public Collection<OdontologoDTO> buacarTodos(){

        List<Odontologo> odontologos = odontologoRepository.findAll();
        Set<OdontologoDTO> odontologosDTO = new HashSet<>();
        for (Odontologo odontologo:odontologos){
            OdontologoDTO odontologoDTO = new OdontologoDTO();
            odontologoDTO = mapper.convertValue(odontologo,OdontologoDTO.class);
            odontologosDTO.add(odontologoDTO);

        }
        return odontologosDTO;
    }

    public void actualizar(OdontologoDTO odontologoDTO) {
        Odontologo odontologo = mapper.convertValue(odontologoDTO,Odontologo.class);
        odontologoRepository.save(odontologo);
    }

    public void eliminar(Long id){
        odontologoRepository.deleteById(id);
    }




}

