package com.example.EntregableBackLuciani.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PacienteDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String domicilio;
}
