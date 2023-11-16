package Repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Modelo.Usuario;

@Repository
public interface Repositorio_Usuario extends CrudRepository<Usuario,Long>{
}
