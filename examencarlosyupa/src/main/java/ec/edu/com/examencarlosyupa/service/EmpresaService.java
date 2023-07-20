package ec.edu.com.examencarlosyupa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.com.examencarlosyupa.dto.EmpleadoRQ;
import ec.edu.com.examencarlosyupa.dto.EmpresaRQ;
import ec.edu.com.examencarlosyupa.model.Empleado;
import ec.edu.com.examencarlosyupa.model.Empresa;
import ec.edu.com.examencarlosyupa.repository.EmpleadoRepository;
import ec.edu.com.examencarlosyupa.repository.EmpresaRepository;
import lombok.Data;
@Data
@Service
public class EmpresaService {
    
    private final EmpresaRepository empresaRepository;
    private final EmpleadoRepository empleadoRepository;




    public EmpresaService(EmpresaRepository empresaRepository, EmpleadoRepository empleadoRepository) {
        this.empresaRepository = empresaRepository;
        this.empleadoRepository = empleadoRepository;
    }


    private Empleado transformEmpleadoRQ(EmpleadoRQ empleadoRQ){

        Empleado empleado = Empleado.builder().cedulaIdentidad(empleadoRQ.getCedulaIdentidad()).nombres(empleadoRQ.getNombres()).apellidos(empleadoRQ.getApellidos()).numeroDeCuenta(empleadoRQ.getNumeroDeCuenta()).build();
return empleado;
    }
    
 

    @Transactional
    public Empresa crearEmpresa(Empresa empresa){
        
    return this.empresaRepository.save(empresa);

    } 

@Transactional
public Empresa crearEmpresas(EmpresaRQ rq)
{
Empresa empresa = this.transformEmpleadoRQ(rq);


} 

}
