
package areoliniea;

import java.util.ArrayList;

public class Avion {
    private String  id;
    private String tipo;
    private double cantidadPasajeros;
    private String estado;
    // llevara objetos de los tripulantes?
    
    public Avion(String id, String tipo, double cantidadPasajeros, String estado) {
        this.id = id;
        this.tipo = tipo;
        this.cantidadPasajeros = cantidadPasajeros;
        this.estado = estado;
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
    
}
