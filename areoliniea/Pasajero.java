package areoliniea;

import java.util.Scanner;

public class Pasajero {
    private int silla;
    private String nombre;
    private int edad;
    private Vuelos vue1;
    
    
    
    public Pasajero(int silla,String nombre, int edad){
        this.silla = silla;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    Scanner entrada = new Scanner(System.in);

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void reservar(String id){
        if (vue1.getAviones().getId().contains(id) == true){
            System.out.print("Ingrese el asiento que desea reservar: ");
            int silla = entrada.nextInt();
                vue1.agregar(silla, nombre);  
        }
        else{
            System.out.println("Lo lamentamos señor pasajero pero el avion que usted desea no existe ");
        }
    }

    @Override
    public String toString() {
        return "\nInformacion: " + "\nSilla: " + silla + ",\nNombre pasajero: " + nombre +"\nEdad: "+edad;
    }
    
}
