package view;
import data.GestorDatos;
import model.Vehiculo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class VentanaBuscarVehiculo extends Ventana implements ActionListener {
    private JTextField txtNombre;
    private JLabel lblNombre;
    private JButton btnBuscar, btnCancelar;
    private JPanel panel;
    private GestorDatos gestor;

    public VentanaBuscarVehiculo(String titulo, int ancho, int alto, GestorDatos gestor) {
        super(titulo, ancho, alto);
        this.gestor = gestor;
        crearComponentes();
        agregarComponentes();
        agregarEventos();
        setVisible(true);
    }

    private void crearComponentes() {
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(15);
        btnBuscar = new JButton("Buscar");
        btnCancelar = new JButton("Cancelar");
        panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
    }

    private void agregarComponentes() {
        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(btnBuscar);
        panel.add(btnCancelar);
        add(panel);
    }

    private void agregarEventos() {
        btnBuscar.addActionListener(this);
        btnCancelar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBuscar) {
            String nombre = txtNombre.getText();
            Vehiculo vehiculo = gestor.buscarVehiculoPorNombre(nombre);
            if (vehiculo != null) {
                JOptionPane.showMessageDialog(this, "Vehiculo encontrado: " +vehiculo.toString());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el vehiculo");
            }
        } else if (e.getSource() == btnCancelar) {
            dispose();
            new VentanaBienvenida("Iniciar sesión", 200, 100, gestor);
        }
    }
}
