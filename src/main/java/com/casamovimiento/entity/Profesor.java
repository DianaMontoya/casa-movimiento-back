package com.casamovimiento.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "profesores")
@Getter
@Setter
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    private LocalDate fechaNacimiento;

    private String dni;

    private String telefono;

    private String email;

    private LocalDate fechaIngreso;

    private String especialidad;

    private String observaciones;

    private Boolean activo;

}