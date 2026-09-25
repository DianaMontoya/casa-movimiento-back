package com.casamovimiento.controller;

import com.casamovimiento.entity.Pago;
import com.casamovimiento.repository.PagoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.time.LocalDate;

@CrossOrigin(
        origins = "http://localhost:5173"
)

@RestController

@RequestMapping("/pagos")

public class PagoController {

    private final PagoRepository repo;

    public PagoController(
            PagoRepository repo
    ) {
        this.repo = repo;
    }

    @GetMapping

    public List<Pago> listar() {

        return repo.findAll();

    }

    @PostMapping

    public Pago crearPago(
            @RequestBody Pago pago
    ) {

        return repo.save(pago);

    }

    @GetMapping("/alumno/{id}")

    public List<Pago> pagosAlumno(
            @PathVariable Long id
    ) {

        return repo.findByAlumnoId(id);

    }

    @PutMapping("/{id}")

    public Pago actualizarPago(

            @PathVariable Long id,

            @RequestBody Pago pagoActualizado

    ) {

        Pago pago =

                repo.findById(id)

                        .orElseThrow();

        pago.setConcepto(
                pagoActualizado.getConcepto()
        );

        pago.setMonto(
                pagoActualizado.getMonto()
        );

        pago.setMetodoPago(
                pagoActualizado.getMetodoPago()
        );

        pago.setFechaPago(
                pagoActualizado.getFechaPago()
        );

        pago.setObservaciones(
                pagoActualizado.getObservaciones()
        );

        return repo.save(pago);

    }

    @GetMapping("/balance")

    public List<Pago> balance(

            @RequestParam LocalDate desde,

            @RequestParam LocalDate hasta,

            @RequestParam(
                    required = false
            )
            String metodo

    ) {

        if (

                metodo == null ||

                        metodo.isBlank()

        ) {

            return repo.findByFechaPagoBetween(
                    desde,
                    hasta
            );

        }

        return repo.findByFechaPagoBetweenAndMetodoPago(
                desde,
                hasta,
                metodo
        );

    }


}