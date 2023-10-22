package areoliniea;

import java.util.ArrayList;
import java.util.Scanner;
public class Vuelos {
    // hacer un arrayList de espacios?
    private String id;
    private String fechaVuelo;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double comustible;
    private ArrayList<Tripulacion> tripulacion;
    private Tripulacion tripulacionAvion;
    private Avion aviones;
    private Pasajero pasajero1;
    

    public Vuelos(String id, String fechaVuelo, String ciudadOrigen, String ciudadDestino,Avion aviones,Tripulacion tripulacionAvion) {
        this.id = id;
        this.fechaVuelo = fechaVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.comustible = 2000000;
        this.aviones = aviones;
        this.tripulacionAvion = tripulacionAvion;
    }
    
    Scanner entrada = new Scanner(System.in);
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
    public Avion getAviones() {
        return aviones;
    }

    public void setAviones(Avion aviones) {
        this.aviones = aviones;
    }
    
    // metodos
//    public void agregar(int silla,String nombre){
//        if (espacio.get(silla) != null){
//            System.out.println("Lo lamentamos pero la silla que desea esta ocupada");
//        }
//        else{
//            espacio.set(silla, pasajero1);
//            System.out.println("Se ha registrado su asiento señor pasajero");
//        }
//    }

    public void reservarSilla(String id){
        if (aviones.getId().equals(id)){
            System.out.print("Ingrese el asiento que desea reservar: ");
            int silla = entrada.nextInt();
                aviones.reservar(silla,pasajero1);  
        }
        else{
            System.out.println("Lo lamentamos señor pasajero pero el avion que usted desea no existe ");
        }
    }
    
    public void agregarPersonal(Tripulacion tripulacion){
        this.tripulacion.add(tripulacion);
    }
    
   // en teoria esta bien, revisar despues
    public double getCoste(){
        double costeTotal;
            costeTotal= tripulacionAvion.getAzafata1().getSueldoAzafata() + tripulacionAvion.getAzafata2().getSueldoAzafata()+
                    tripulacionAvion.getComisario1().getSueldoComisario()+tripulacionAvion.getComisario2().getSueldoComisario()+
                    tripulacionAvion.getOperadorC1().getSueldoOperador()+tripulacionAvion.getPiloto1().getSueldoPiloto()+
                    tripulacionAvion.getPiloto2().getSueldoPiloto() + comustible;
        
        return costeTotal;
    }
    
    
}
