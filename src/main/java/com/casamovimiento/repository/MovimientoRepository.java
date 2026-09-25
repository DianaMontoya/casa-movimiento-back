package com.casamovimiento.repository;

import com.casamovimiento.entity.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoRepository
        extends JpaRepository<Movimiento, Long> {
}