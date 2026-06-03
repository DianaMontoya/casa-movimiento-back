package com.casamovimiento.controller;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.casamovimiento.entity.Alumno;
import com.casamovimiento.repository.AlumnoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(
        origins =
                "http://localhost:5173"
)
@RestController

@RequestMapping(
        "/alumnos"
)

public class AlumnoController {

    private final
    AlumnoRepository repo;

    public AlumnoController(
            AlumnoRepository repo
    ){
        this.repo=repo;
    }

    @GetMapping

    public List<Alumno>
    listar(){
        return repo.findAll();
    }


    @PostMapping
    public Alumno crearAlumno(
            @RequestBody Alumno alumno
    ) {

        return repo.save(alumno);

    }
}