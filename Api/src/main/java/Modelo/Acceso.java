package Modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "accesos", schema = "gbp_operacional")
public class Acceso {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_acceso", nullable = false)
	private long id_acceso;

	@Column(name = "codigo_acceso", nullable = false)
	private String codigo_acceso;

	@Column(name = "descripcion_acceso")
	private String descripcion_acceso;

	// Getters & Setters
	public long getId_acceso() {
		return id_acceso;
	}

	public void setId_acceso(long id_acceso) {
		this.id_acceso = id_acceso;
	}

	public String getCodigo_acceso() {
		return codigo_acceso;
	}

	public void setCodigo_acceso(String codigo_acceso) {
		this.codigo_acceso = codigo_acceso;
	}

	public String getDescripcion_acceso() {
		return descripcion_acceso;
	}

	public void setDescripcion_acceso(String descripcion_acceso) {
		this.descripcion_acceso = descripcion_acceso;
	}

}
