package ec.edu.com.examencarlosyupa.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpleadoPago {
    private String numeroCuenta;
    private double valor;
    private String estado; 
}
