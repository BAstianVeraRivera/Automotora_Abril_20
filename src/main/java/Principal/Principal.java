package Principal;

import data.GestorDatos;

public class Principal {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos(); // Creamos un objeto de la clase GestorDatos
        new VentanaBienevenida("Menú principal", 200, 100, gestor); // Creamos un objeto de la clase VentanaMenu
    }
}