package model;

import controller.ControllerAutomotora;

public class Cliente {
	private String nombre;
	private String rut;
	private int nroContacto;
	private String direccion;
	private String email;
	public ControllerAutomotora unnamed_ControllerAutomotora_;

	public Cliente(String nombre, String rut, int nroContacto, String direccion, String email) {
		this.nombre = nombre;
		this.rut = rut;
		this.nroContacto = nroContacto;
		this.direccion = direccion;
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getNroContacto() {
		return this.nroContacto;
	}

	public void setNroContacto(int nroContacto) {
		this.nroContacto = nroContacto;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}