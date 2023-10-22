package areoliniea;

import java.util.ArrayList;

public class Vuelos {
    // hacer un arrayList de espacios?
    private String id;
    private String fechaVuelo;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double comustible;
    private ArrayList<Pasajero> espacio;
    private Avion aviones;
    private Pasajero pasajero1; // revisar aca
    private Personal perso1;
    

    public Vuelos(String id, String fechaVuelo, String ciudadOrigen, String ciudadDestino,Avion aviones) {
        this.id = id;
        this.fechaVuelo = fechaVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.comustible = 2000000;
        this.aviones = aviones;
        espacio = new ArrayList();
        espacio.ensureCapacity(30);
        for (int i=0; i< 30;i++){
            espacio.set(i, null);
        }
    }

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
    public void agregar(int silla,String nombre){
        if (espacio.get(silla) != null){
            System.out.println("Lo lamentamos pero la silla que desea esta ocupada");
        }
        else{
            espacio.set(silla, pasajero1);
            System.out.println("Se ha registrado su asiento señor pasajero");
        }
    }
    public void buscaInformacion(String id,int silla){
        for(Pasajero pasa1: espacio){
           if(pasa1.getSilla() == silla){
               System.out.println(pasa1.toString());
           }
        }
    }
    
    public double getCoste(){
        double costeTotal = perso1.getSueldo() + comustible;
        return costeTotal;
    }
}
