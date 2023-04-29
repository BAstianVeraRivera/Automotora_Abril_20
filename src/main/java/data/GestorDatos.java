package data;

import model.Cliente;
import model.Vehiculo;

import java.io.*;
public class GestorDatos {
    private String archivo;

    public String getArchivo() {return archivo;}

    public void setArchivo(String archivo) {this.archivo = archivo;}

    public GestorDatos(String archivo) {
        this.archivo = archivo;
    }

    public void guardarCliente(Cliente cliente) {
        try {
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(cliente.getNombre() + "," + cliente.getRut() + "," + cliente.getNroContacto() + "," + cliente.getDireccion() + "," + cliente.getEmail());
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        try {
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(vehiculo.getNombreVehiculo() + "," + vehiculo.getAño() + "," + vehiculo.getPrecio() + "," + vehiculo.getKmRec() + "," + vehiculo.getColor() + "," + vehiculo.getMarca());
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String buscarVehiculo(String nombre) {
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[0].equals(nombre)) {
                    br.close();
                    fr.close();
                    return datos[1];
                }
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}