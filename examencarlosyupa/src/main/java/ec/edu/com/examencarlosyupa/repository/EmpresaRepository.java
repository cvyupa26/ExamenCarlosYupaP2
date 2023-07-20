package ec.edu.com.examencarlosyupa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.com.examencarlosyupa.model.Empresa;

public interface EmpresaRepository extends MongoRepository<Empresa, Integer> {
    
}
