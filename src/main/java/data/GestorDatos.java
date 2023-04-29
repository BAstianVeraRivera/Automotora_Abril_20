package data;

import model.Cliente;
import model.Vehiculo;

import java.io.*;
public class GestorDatos {
    private String archivoCliente;
    private String archivoVehiculo;
    public String getArchivoVehiculo() {return archivoVehiculo;}

    public void setArchivoVehiculo(String archivoVehiculo) {this.archivoVehiculo = archivoVehiculo;}

    public String getArchivoCliente() {return archivoCliente;}

    public void setArchivoCliente(String archivoCliente) {this.archivoCliente = archivoCliente;}

    public GestorDatos(String archivoCliente, String archivoVehiculo) {
        this.archivoCliente = archivoCliente;
        this.archivoVehiculo = archivoVehiculo;
    }

    public void guardarCliente(Cliente cliente) {
        try {
            FileWriter fw = new FileWriter(archivoCliente, true);
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
            FileWriter fw = new FileWriter(archivoVehiculo, true);
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
            FileReader fr = new FileReader(archivoVehiculo);
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
    public Vehiculo buscarVehiculoPorNombre(String nombre) {
        try {
            FileReader fr = new FileReader(archivoVehiculo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[0].equals(nombre)) {
                    br.close();
                    fr.close();
                    return new Vehiculo(datos[0], Integer.parseInt(datos[1]), Integer.parseInt(datos[2]), Integer.parseInt(datos[3]), datos[4], datos[5]);
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