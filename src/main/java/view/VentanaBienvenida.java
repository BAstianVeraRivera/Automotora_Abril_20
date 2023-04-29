package view;
import data.GestorDatos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class VentanaBienvenida extends Ventana implements ActionListener {
    private JButton btnRegistrarVehiculo, btnRegistrarCliente, btnSalir;
    private JPanel panel;
    private GestorDatos gestor;

    public VentanaBienvenida(String titulo, int ancho, int alto, GestorDatos gestor) {
        super(titulo, ancho, alto);
        this.gestor = gestor;
        crearComponentes();
        agregarComponentes();
        agregarEventos();
        setVisible(true);
    }

    private void crearComponentes() {
        btnRegistrarVehiculo = new JButton("Registrar vehículo");
        btnRegistrarCliente = new JButton("Registrar cliente");
        btnSalir = new JButton("Salir");
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
    }

    private void agregarComponentes() {
        panel.add(btnRegistrarVehiculo);
        panel.add(btnRegistrarCliente);
        panel.add(btnSalir);

        add(panel);
    }

    private void agregarEventos() {
        btnRegistrarVehiculo.addActionListener(this);
        btnRegistrarCliente.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistrarVehiculo) {
            dispose();
            new VentanaRegistrarVehiculo("Registrar vehículo", 300, 200, gestor);
        } else if (e.getSource() == btnRegistrarCliente) {
            dispose();
            new VentanaRegistrarCliente("Registrar cliente", 300, 200, gestor);
        } else if (e.getSource() == btnSalir) {
            System.exit(0);
        }
    }
}