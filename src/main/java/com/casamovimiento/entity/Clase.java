package com.casamovimiento.entity;

import jakarta.persistence.*;
import java.time.LocalTime;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Entidad que representa una clase dentro de Casa Movimiento.
 *
 * Cada clase posee un profesor asignado, un horario,
 * una disciplina y un cupo máximo de alumnos.
 */
@Entity
@Table(name = "clases")
public class Clase {

    // Identificador único de la clase
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre de la clase
    @Column(nullable = false)
    private String nombre;

    // Disciplina que se dicta
    @Column(nullable = false)
    private String disciplina;

    // Grupo al que pertenece la clase
    private String grupo;

    // Nivel de dificultad
    private String nivel;

    /**
     * Profesor responsable de la clase.
     *
     * Relación Muchos a Uno:
     * Muchas clases pueden ser dictadas por un mismo profesor.
     */
    @ManyToOne
    @JoinColumn(name = "profesor_id")
    /*Con lo siguiente evitamos muchos dolores de cabeza cuando React haga GET /clases, especialmente si en el futuro agregamos más relaciones.*/
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Profesor profesor;

    // Día de la semana en que se dicta la clase
    @Column(name = "dia_semana", nullable = false)
    private String diaSemana;

    // Horario de inicio
    @Column(name = "hora_inicio", nullable = false)
    private LocalTime horaInicio;

    // Horario de finalización
    @Column(name = "hora_fin", nullable = false)
    private LocalTime horaFin;

    // Salón donde se desarrolla la clase
    private String salon;

    // Cantidad máxima de alumnos permitidos
    @Column(name = "cupo_maximo")
    private Integer cupoMaximo;

    // Información adicional
    @Column(columnDefinition = "TEXT")
    private String observaciones;

    // Indica si la clase continúa vigente
    private Boolean activa;

    // ======== Constructores ========

    public Clase() {
    }

    // ======== Getters y Setters ========

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public Integer getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(Integer cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

}