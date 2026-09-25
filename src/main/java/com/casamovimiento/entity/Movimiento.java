package com.casamovimiento.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "movimientos")

public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    private String tipo;

    private String concepto;

    private BigDecimal monto;

    private String observaciones;

    public Movimiento() {
    }

    public Long getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public String getConcepto() {
        return concepto;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}