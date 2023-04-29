package model;

public class Vehiculo {
	private String nombreVehiculo;
	private int año;
	private int precio;
	private int kmRec;
	private String color;
	private String marca;

	public Vehiculo(String nombreVehiculo, int año, int precio, int kmRec, String color, String marca) {
		this.nombreVehiculo = nombreVehiculo;
		this.año = año;
		this.precio = precio;
		this.kmRec = kmRec;
		this.color = color;
		this.marca = marca;
	}
	public String toString(){
		return "\n Marca: "+this.marca+"\n Modelo: "+this.nombreVehiculo+"\n Año: "+this.año+"\n Color: "+this.color+"\n Kilometros Recorridos: "+this.kmRec+"\n Precio: "+this.precio+" CLP";
	}

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