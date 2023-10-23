package areoliniea;

import java.util.ArrayList;

public class Avion {

    private String id;
    private String tipo;
    private double cantidadPasajeros;
    private String estado;
    private Pasajero pasajero1;
    private ArrayList<Pasajero> pasajeros;

    public Avion(String id, String tipo, double cantidadPasajeros, String estado, Pasajero pasajero1) {
        this.id = id;
        this.tipo = tipo;
        this.cantidadPasajeros = cantidadPasajeros;
        this.estado = estado;
        this.pasajero1 = pasajero1;
        pasajeros = new ArrayList();
        pasajeros.ensureCapacity(30);
        for (int i = 0; i < 30; i++) {
            pasajeros.add(i, null);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(double cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //metodos
    public void agregar(Pasajero pasa1) {
        pasajeros.add(pasa1);
    }

    // fallo aqui
    public void buscaInformacion(String id, int silla) {
        if (getId() == id) {
            System.out.println("\nInformacion del pasajero: \nNombre: " + pasajeros.get(silla).getNombre()
                    + "\nEdad: " + pasajeros.get(silla).getEdad() + "\nSilla: " + pasajeros.get(silla).getSilla());

        } else {
            System.out.println("No se encontro al pasajero");
        }

    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void reservar(int silla) {
        // hacer condicion para el avion activo o inativo 
        if (pasajeros.get(silla) != null) {
            System.out.println("Lo lamentamos pero la silla que desea esta ocupada");
        } else {
            pasajeros.set(silla, pasajero1);
            System.out.println("Se ha registrado su asiento señor pasajero");
            //System.out.println("pasajeros: "+getPasajeros());
        }
    }

    @Override
    public String toString() {
        return "Informacion del avion: " + "\nid: " + id + "\ntipo: " + tipo + "\ncantidad de Pasajeros abordo: " + cantidadPasajeros
                + "\nestado del avion: " + estado;
    }

}
