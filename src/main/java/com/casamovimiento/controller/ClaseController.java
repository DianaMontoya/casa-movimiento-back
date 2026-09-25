package com.casamovimiento.controller;

import com.casamovimiento.entity.Clase;
import com.casamovimiento.repository.ClaseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador encargado de gestionar las operaciones
 * CRUD de las clases.
 *
 * Permite:
 * - Consultar todas las clases.
 * - Registrar nuevas clases.
 * - Actualizar clases existentes.
 * - Eliminar clases.
 */
@RestController
@RequestMapping("/clases")
@CrossOrigin(origins = "http://localhost:5173")
public class ClaseController {

    // Repositorio utilizado para acceder a la base de datos
    private final ClaseRepository repository;

    /**
     * Constructor con inyección de dependencias.
     */
    public ClaseController(ClaseRepository repository) {
        this.repository = repository;
    }

    /**
     * Obtiene el listado completo de clases.
     */
    @GetMapping
    public List<Clase> listar() {

        return repository.findAll();

    }

    /**
     * Registra una nueva clase.
     */
    @PostMapping
    public Clase guardar(@RequestBody Clase clase) {

        return repository.save(clase);

    }

    /**
     * Actualiza la información de una clase existente.
     */
    @PutMapping("/{id}")
    public Clase actualizar(

            @PathVariable Long id,

            @RequestBody Clase clase

    ) {

        clase.setId(id);

        return repository.save(clase);

    }

    /**
     * Elimina una clase según su identificador.
     */
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {

        repository.deleteById(id);

    }

}