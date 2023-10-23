package areoliniea;

import java.util.ArrayList;
import java.util.Scanner;
public class Vuelos {

    private String id;
    private String fechaVuelo;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double comustible;
    private ArrayList<Tripulacion> tripulacion;
    private Tripulacion tripulacionAvion;
    private Avion aviones;

    

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

    public void reservarSilla(String id){
        if(aviones.getEstado().equals("activo"))
            if (aviones.getId().equals(id)){
                System.out.print("Ingrese el asiento que desea reservar: ");
                int silla = entrada.nextInt();
                    aviones.reservar(silla);  
            }
            else{
            System.out.println("Lo lamentamos señor pasajero pero el avion que usted desea no existe ");
        }
        else{
            System.out.println("Lo lamentamos señor pasajero pero el avion que usted desea esta inativo");
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
