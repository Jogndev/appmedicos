package med.voll.api.domain.pacientes;

import med.voll.api.domain.direccion.DatosDireccion;

public record DatosRegistroPacientes(
        String nombre,
        String email,
        String telefono,
        DatosDireccion direccion,
        String diagnostico
) {
}
