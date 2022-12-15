package com.example.EntregableBackLuciani.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Turnos")
@Getter
@Setter
public class Turno {

    @Id
    @GeneratedValue
    private Long id;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "odontologo_id",nullable = false)

    private Odontologo odontologo;

    @ManyToOne
    @JoinColumn(name = "paciente_id",nullable = false)
    private Paciente paciente;

}
