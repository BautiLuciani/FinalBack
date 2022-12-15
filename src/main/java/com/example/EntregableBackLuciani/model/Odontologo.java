package com.example.EntregableBackLuciani.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "Odontologos")
@Getter
@Setter
public class Odontologo {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String apellido;
    private String matricula;


    @OneToMany(mappedBy = "odontologo")
    @JsonIgnore
    private Set<Turno> turnos;

}
