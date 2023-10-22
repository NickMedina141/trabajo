package areoliniea;

public class Areopuerto {
    public static void main(String[] args) {
        Avion avion1 = new Avion("01E", "boing 343", 15, "activo");
        Vuelos vuelo1 = new Vuelos("vuelo012","30/03/2023","Bogota","Bucaramanga", avion1);
        Pasajero pasajero1 = new Pasajero(2, "nicolas", 18);
        
        //Operador_comunicacion,Comisario_abordo,Piloto,Azafatas = new Personal(1000);
    }
    
    
}
