package com.casamovimiento.repository;

import com.casamovimiento.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

//Con este extends ya tenemos
//guardar(), findAll(), findById(), deleteById(), save()
//sin escribir una sola línea más.
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}