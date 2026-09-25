package com.casamovimiento.controller;

import com.casamovimiento.entity.Profesor;
import com.casamovimiento.repository.ProfesorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesores")
@CrossOrigin(origins = "http://localhost:5173")
public class ProfesorController {

    private final ProfesorRepository repository;

    public ProfesorController(ProfesorRepository repository) {
        this.repository = repository;
    }

    /**
     * Obtiene la lista completa de profesores.
     */
    @GetMapping
    public List<Profesor> listar() {
        return repository.findAll();
    }

    /**
     * Registra un nuevo profesor.
     */
    @PostMapping
    public Profesor guardar(@RequestBody Profesor profesor) {
        return repository.save(profesor);
    }

    /**
     * Actualiza un profesor existente.
     */
    @PutMapping("/{id}")
    public Profesor actualizar(
            @PathVariable Long id,
            @RequestBody Profesor profesor
    ) {

        profesor.setId(id);

        return repository.save(profesor);

    }

    /**
     * Elimina un profesor por su id.
     */
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {

        repository.deleteById(id);

    }

}