package com.casamovimiento.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "pagos")

public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "alumno_id")
    private Alumno alumno;

    @Column(name = "fecha_pago")
    private LocalDate fechaPago;

    private String concepto;

    private BigDecimal monto;

    @Column(name = "metodo_pago")
    private String metodoPago;

    private String observaciones;

    public Pago() {
    }

    // GETTERS

    public Long getId() {
        return id;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public String getConcepto() {
        return concepto;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public String getObservaciones() {
        return observaciones;
    }

    // SETTERS

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}