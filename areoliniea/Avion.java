
package areoliniea;

import java.util.ArrayList;

public class Avion {
    private String  id;
    private String tipo;
    private double cantidadPasajeros;
    private String estado;
    private ArrayList<Pasajero> pasajeros;

    
    public Avion(String id, String tipo, double cantidadPasajeros, String estado) {
        this.id = id;
        this.tipo = tipo;
        this.cantidadPasajeros = cantidadPasajeros;
        this.estado = estado;
        pasajeros = new ArrayList();
        pasajeros.ensureCapacity(30);
//        for (int i=0; i< 30;i++){
//            pasajeros.add(i,null);
//        }
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
    
    public void agregar(Pasajero pasa1){
        pasajeros.add(pasa1);
    }
    
    // fallo aqui
    public void buscaInformacion(String id,int silla){
        for(Pasajero pasa1: pasajeros){
           if(pasa1.getSilla() == silla){
               System.out.println("hola");
           }
        }
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }
        
    
    
    public void reservar(int silla,Pasajero pasajero1){
    if (pasajeros.get(silla) != null){
        System.out.println("Lo lamentamos pero la silla que desea esta ocupada");
    }
    else{
        pasajeros.set(silla,pasajero1);
        System.out.println("Se ha registrado su asiento señor pasajero");
         }
    }

    @Override
    public String toString() {
        return "Informacion del avion: "+"\nid: "+id+"\ntipo: "+tipo+"\ncantidad de Pasajeros abordo: "+cantidadPasajeros+
                "\nestado del avion: "+estado;
    }
    
    
    
}
