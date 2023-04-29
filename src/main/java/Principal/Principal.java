package Principal;
import data.GestorDatos;
import view.VentanaBienvenida;

public class Principal {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos("Clientes.txt", "Vehiculos.txt"); // Crea un objeto de la clase GestorDatos con el nombre del archivo
        new VentanaBienvenida("Iniciar sesión", 200, 100,gestor); // Crea una instancia de la clase LoginVentana y le pasa el nombre del archivo del gestor
    }
}