package view;
import data.GestorDatos;
import model.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class VentanaRegistrarCliente extends Ventana implements ActionListener {
    private JLabel lblNombre, lblRut, lblNroContacto, lblDireccion, lblEmail;
    private JTextField txtNombre, txtRut, txtNroContacto, txtDireccion, txtEmail;
    private JButton btnRegistrar, btnCancelar;
    private JPanel panel;
    private GestorDatos gestor;

    public VentanaRegistrarCliente(String titulo, int ancho, int alto, GestorDatos gestor) {
        super(titulo, ancho, alto);
        this.gestor = gestor;
        crearComponentes();
        agregarComponentes();
        agregarEventos();
        setVisible(true);
    }
    private void crearComponentes() {
        lblNombre = new JLabel("Nombre:");
        lblRut = new JLabel("RUT:");
        lblNroContacto = new JLabel("Número de contacto:");
        lblDireccion = new JLabel("Dirección:");
        lblEmail = new JLabel("Email:");
        txtNombre = new JTextField(15);
        txtRut = new JTextField(15);
        txtNroContacto = new JTextField(15);
        txtDireccion = new JTextField(15);
        txtEmail = new JTextField(15);
        btnRegistrar = new JButton("Registrar");
        btnCancelar = new JButton("Cancelar");
        panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
    }
    private void agregarComponentes() {
        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblRut);
        panel.add(txtRut);
        panel.add(lblNroContacto);
        panel.add(txtNroContacto);
        panel.add(lblDireccion);
        panel.add(txtDireccion);
        panel.add(lblEmail);
        panel.add(txtEmail);
        panel.add(btnRegistrar);
        panel.add(btnCancelar);

        add(panel);
    }
    private void agregarEventos() {
        btnRegistrar.addActionListener(this);
        btnCancelar.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistrar) {
            String nombre = txtNombre.getText();
            String rut = txtRut.getText();
            int nroContacto = Integer.parseInt(txtNroContacto.getText());
            String direccion = txtDireccion.getText();
            String email = txtEmail.getText();
            Cliente cliente = new Cliente(nombre, rut, nroContacto, direccion, email);
            gestor.guardarCliente(cliente);
            JOptionPane.showMessageDialog(this, "CLiente registrado con éxito");
            dispose();
            new VentanaBienvenida("Iniciar sesión", 200, 100, gestor);
        } else if (e.getSource() == btnCancelar) {
            dispose();
            new VentanaBienvenida("Iniciar sesión", 200, 100, gestor);
        }
    }
}