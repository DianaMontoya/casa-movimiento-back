package com.casamovimiento.controller;

import com.casamovimiento.entity.Inscripcion;
import com.casamovimiento.repository.InscripcionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador de inscripciones (Alumno ↔ Clase)
 */
@RestController
@RequestMapping("/inscripciones")
@CrossOrigin(origins = "http://localhost:5173")
public class InscripcionController {

    private final InscripcionRepository repository;

    public InscripcionController(InscripcionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Inscripcion> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Inscripcion guardar(@RequestBody Inscripcion inscripcion) {
        return repository.save(inscripcion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}