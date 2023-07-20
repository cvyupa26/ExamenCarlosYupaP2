package ec.edu.com.examencarlosyupa.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
@Document (collection = "empresa")
public class Empresa {
@Id    
private Integer ruc;
private String razonsocial;
private String cuenprincipal;

private List<Empleado> empleados;


}
