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
    public List<Alumno> listar() {
        return repo.findAllByOrderByApellidoAsc();
    }

    @PostMapping
    public Alumno crearAlumno(
            @RequestBody Alumno alumno
    ) {

        return repo.save(alumno);

    }

    @PutMapping("/{id}")
    public Alumno actualizarAlumno(
            @PathVariable Long id,
            @RequestBody Alumno alumnoActualizado
    ) {

        Alumno alumno = repo.findById(id).orElseThrow();

        alumno.setNombre(alumnoActualizado.getNombre());
        alumno.setApellido(alumnoActualizado.getApellido());
        alumno.setFechaNacimiento(alumnoActualizado.getFechaNacimiento());
        alumno.setDni(alumnoActualizado.getDni());
        alumno.setTelefono(alumnoActualizado.getTelefono());
        alumno.setEmail(alumnoActualizado.getEmail());
        alumno.setFechaIngreso(alumnoActualizado.getFechaIngreso());
        alumno.setDisciplina(alumnoActualizado.getDisciplina());
        alumno.setGrupo(alumnoActualizado.getGrupo());
        alumno.setNivel(alumnoActualizado.getNivel());
        alumno.setEstado(alumnoActualizado.getEstado());

        return repo.save(alumno);
    }
}