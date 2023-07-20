package ec.edu.com.examencarlosyupa.dto;

import java.util.List;

import ec.edu.com.examencarlosyupa.model.Empleado;
import lombok.Builder;
import lombok.Data;
@Data
@Builder

public class EmpresaRQ {
    
private Integer ruc;
private String razonsocial;
private String cuenprincipal;

private List<Empleado> empleados;
    
}
