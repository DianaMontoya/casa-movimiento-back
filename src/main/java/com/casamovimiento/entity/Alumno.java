package com.casamovimiento.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "alumnos")

public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    private String dni;

    private String telefono;

    private String email;

    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;

    private String disciplina;

    private String grupo;

    private String nivel;

    private String estado;

    public Alumno() {
    }

    // GETTERS

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getNivel() {
        return nivel;
    }

    public String getEstado() {
        return estado;
    }

    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}