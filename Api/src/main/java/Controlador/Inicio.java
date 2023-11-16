package Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Modelo.Acceso;
import Modelo.Usuario;
import Servicios.Servicios;

@RestController
@RequestMapping("/api")
public class Inicio {
	@Autowired
	Servicios serv_usuario;
	@GetMapping("/usuarios")
	public List<Usuario> SelectAllUsuario(){
		return serv_usuario.SelectAllUsuario();
	}
	@Autowired
	Servicios serv_acceso;
	@GetMapping("/accesos")
	public List<Acceso> SelectAllAcceso(){
		return serv_acceso.SelectAllAcceso();
	}
}
