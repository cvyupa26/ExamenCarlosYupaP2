package ec.edu.com.examencarlosyupa.model;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "pagoRol")
public class PagoRol {

    private String mes;
    private Date fechaProceso;
    private String rucEmpresa;
    private String cuentaPrincipal;
    private BigDecimal valorTotal;
    private BigDecimal valorReal;
    
}
