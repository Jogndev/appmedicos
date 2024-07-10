package med.voll.api.infra.errores;

public class ValidationDeIntegridad extends RuntimeException {
    public ValidationDeIntegridad(String idDePacienteNoEncontrado) {
        super(idDePacienteNoEncontrado);
    }
}
