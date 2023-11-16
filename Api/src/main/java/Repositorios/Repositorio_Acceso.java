package Repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Modelo.Acceso;

@Repository
public interface Repositorio_Acceso extends CrudRepository<Acceso,Long>{
}
