package ec.edu.com.examencarlosyupa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.com.examencarlosyupa.model.Empleado;

public interface EmpleadoRepository extends MongoRepository<Empleado, Integer> {
    


}
