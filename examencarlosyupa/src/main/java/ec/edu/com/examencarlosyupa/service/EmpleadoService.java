package ec.edu.com.examencarlosyupa.service;
import org.springframework.stereotype.Service;

import ec.edu.com.examencarlosyupa.repository.EmpleadoRepository;

@Service
public class EmpleadoService {
    
private final EmpleadoRepository empleadoRepository;

public EmpleadoService(EmpleadoRepository empleadoRepository) {
    this.empleadoRepository = empleadoRepository;

}

        
    }   