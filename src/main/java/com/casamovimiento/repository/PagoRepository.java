package com.casamovimiento.repository;

import com.casamovimiento.entity.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.time.LocalDate;

public interface PagoRepository
        extends JpaRepository<Pago, Long> {

    List<Pago> findByAlumnoId(Long alumnoId);

    List<Pago> findByFechaPagoBetween(
            LocalDate desde,
            LocalDate hasta
    );

    List<Pago> findByFechaPagoBetweenAndMetodoPago(
            LocalDate desde,
            LocalDate hasta,
            String metodoPago
    );
}