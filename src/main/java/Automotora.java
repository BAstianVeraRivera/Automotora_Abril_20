import java.util.ArrayList;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Automotora {
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}

}