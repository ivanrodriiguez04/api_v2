package Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Modelo.Acceso;
import Modelo.Usuario;
import Repositorios.Repositorio_Acceso;
import Repositorios.Repositorio_Usuario;

@Service
public class Servicios {
	@Autowired
	Repositorio_Usuario repo_usuario;
	public List<Usuario> SelectAllUsuario(){
		return (List<Usuario>) repo_usuario.findAll();
	}
	@Autowired
	Repositorio_Acceso repo_acceso;
	public List<Acceso> SelectAllAcceso(){
		return (List<Acceso>) repo_acceso.findAll();
	}
}
