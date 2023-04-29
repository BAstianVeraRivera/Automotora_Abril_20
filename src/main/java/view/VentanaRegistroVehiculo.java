package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import data.GestorDatos;
import model.Vehiculo;

class VentanaRegistrarVehiculo extends Ventana implements ActionListener {
    private JLabel lblNombreVehiculo, lblAño, lblPrecio, lblKmRec, lblColor, lblMarca;
    private JTextField txtNombreVehiculo, txtAño, txtPrecio, txtKmRec, txtColor, txtMarca;
    private JButton btnRegistrar, btnCancelar;
    private JPanel panel;
    private GestorDatos gestor;

    public VentanaRegistrarVehiculo(String titulo, int ancho, int alto, GestorDatos gestor) {
        super(titulo, ancho, alto);
        this.gestor = gestor;
        crearComponentes();
        agregarComponentes();
        agregarEventos();
        setVisible(true);
    }

    private void crearComponentes() {
        lblNombreVehiculo = new JLabel("Nombre del vehículo:");
        lblAño = new JLabel("Año:");
        lblPrecio = new JLabel("Precio:");
        lblKmRec = new JLabel("Kilometraje:");
        lblColor = new JLabel("Color:");
        lblMarca = new JLabel("Marca:");
        txtNombreVehiculo = new JTextField(15);
        txtAño = new JTextField(15);
        txtPrecio = new JTextField(15);
        txtKmRec = new JTextField(15);
        txtColor = new JTextField(15);
        txtMarca = new JTextField(15);
        btnRegistrar = new JButton("Registrar");
        btnCancelar = new JButton("Cancelar");
        panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));
    }

    private void agregarComponentes() {
        panel.add(lblNombreVehiculo);
        panel.add(txtNombreVehiculo);
        panel.add(lblAño);
        panel.add(txtAño);
        panel.add(lblPrecio);
        panel.add(txtPrecio);
        panel.add(lblKmRec);
        panel.add(txtKmRec);
        panel.add(lblColor);
        panel.add(txtColor);
        panel.add(lblMarca);
        panel.add(txtMarca);
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
            String nombreVehiculo = txtNombreVehiculo.getText();
            int año = Integer.parseInt(txtAño.getText());
            int precio = Integer.parseInt(txtPrecio.getText());
            int kmRec = Integer.parseInt(txtKmRec.getText());
            String color = txtColor.getText();
            String marca = txtMarca.getText();
            Vehiculo vehiculo = new Vehiculo(nombreVehiculo, año, precio, kmRec, color, marca);
            gestor.registrarVehiculo(vehiculo);
            JOptionPane.showMessageDialog(this, "Vehiculo registrado con éxito");
            dispose();
            new VentanaBienvenida("Iniciar sesión", 200, 100, gestor);
        } else if (e.getSource() == btnCancelar) {
            dispose();
            new VentanaBienvenida("Iniciar sesión", 200, 100, gestor);
        }
    }
}