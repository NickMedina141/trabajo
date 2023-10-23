package areoliniea;

public class Pasajero {

    private int silla;
    private String nombre;
    private int edad;

    public Pasajero(int silla, String nombre, int edad) {
        this.silla = silla; // quitar esto
        this.nombre = nombre;
        this.edad = edad;
    }

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

    @Override
    public String toString() {
        return "\nInformacion: " + "\nSilla: " + silla + ",\nNombre pasajero: " + nombre + "\nEdad: " + edad;
    }

}
