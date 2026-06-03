package com.casamovimiento.repository;

import com.casamovimiento.entity.Alumno;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository
        extends JpaRepository<Alumno, Long >{
}