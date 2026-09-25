package com.casamovimiento.repository;

import com.casamovimiento.entity.Clase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado del acceso a los datos de la entidad Clase.
 *
 * Al extender JpaRepository se obtienen automáticamente los métodos:
 * - save()
 * - findAll()
 * - findById()
 * - deleteById()
 * - count()
 */
@Repository
public interface ClaseRepository extends JpaRepository<Clase, Long> {

}