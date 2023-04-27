package view;
import javax.swing.*;
class VentanaRegistroVehiculo extends JFrame {
    public VentanaRegistroVehiculo(String titulo, int ancho, int alto) {
        super(titulo); // Llama al constructor de la superclase JFrame
        setSize(ancho, alto); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar la ventana
    }

}