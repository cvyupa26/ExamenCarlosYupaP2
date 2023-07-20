package ec.edu.com.examencarlosyupa.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Empleado {
    

    private Integer cedulaIdentidad;
    private String apellidos;
    private String nombres;
    private String numeroDeCuenta;
}
