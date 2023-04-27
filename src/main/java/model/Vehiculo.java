package model;

public class Vehiculo {
	private String nombreVehiculo;
	private int año;
	private int precio;
	private int kmRec;
	private String color;
	private String marca;

	public String getNombreVehiculo() {
		return this.nombreVehiculo;
	}

	public void setNombreVehiculo(String nombreVehiculo) {
		this.nombreVehiculo = nombreVehiculo;
	}

	public int getAño() {
		return this.año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getKmRec() {
		return this.kmRec;
	}

	public void setKmRec(int kmRec) {
		this.kmRec = kmRec;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}