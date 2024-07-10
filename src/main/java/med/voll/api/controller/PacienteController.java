package med.voll.api.controller;

import med.voll.api.domain.pacientes.DatosRegistroPacientes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @PostMapping
    public void registrarPaciente(@RequestBody DatosRegistroPacientes datosRegistroPacientes) {
        System.out.println(datosRegistroPacientes);
    }
}
