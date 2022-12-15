package com.example.EntregableBackLuciani.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TurnoDTO {

    private Long id;
    private Date date;
    private Odontologo odontologo;
    private Paciente paciente;
}
