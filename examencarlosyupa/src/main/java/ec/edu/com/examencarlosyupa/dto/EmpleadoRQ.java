package ec.edu.com.examencarlosyupa.dto;
import java.util.List;

import ec.edu.com.examencarlosyupa.model.Empleado;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class EmpleadoRQ {
    private Integer cedulaIdentidad;
    private String apellidos;
    private String nombres;
    private String numeroDeCuenta;
}
