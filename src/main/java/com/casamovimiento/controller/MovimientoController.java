package com.casamovimiento.controller;

import com.casamovimiento.entity.Movimiento;
import com.casamovimiento.repository.MovimientoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(
        origins = "http://localhost:5173"
)

@RestController

@RequestMapping("/movimientos")

public class MovimientoController {

    private final MovimientoRepository repo;

    public MovimientoController(
            MovimientoRepository repo
    ) {
        this.repo = repo;
    }

    @GetMapping
    public List<Movimiento> listar() {

        return repo.findAll();

    }

    @PostMapping
    public Movimiento crear(
            @RequestBody Movimiento movimiento
    ) {

        return repo.save(
                movimiento
        );

    }

    @PutMapping("/{id}")
    public Movimiento actualizar(

            @PathVariable Long id,

            @RequestBody Movimiento movimiento

    ) {

        Movimiento existente =
                repo.findById(id)
                        .orElseThrow();

        existente.setFecha(
                movimiento.getFecha()
        );

        existente.setTipo(
                movimiento.getTipo()
        );

        existente.setConcepto(
                movimiento.getConcepto()
        );

        existente.setMonto(
                movimiento.getMonto()
        );

        existente.setObservaciones(
                movimiento.getObservaciones()
        );

        return repo.save(
                existente
        );

    }

}