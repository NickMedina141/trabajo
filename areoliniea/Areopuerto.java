package areoliniea;

public class Areopuerto {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero(5, "nicolas", 15);
        Avion avion1 = new Avion("E01A", "boing 343", 25, "activo",pasajero1);
        Piloto piloto1 = new Piloto(60000);
        Piloto piloto2 = new Piloto(70000);
        Operador_comunicacion operadorC1 = new Operador_comunicacion(50000);
        Comisario_abordo comisario1 = new Comisario_abordo(60000);
        Comisario_abordo comisario2 = new Comisario_abordo(65000);
        Azafatas azafata1 = new Azafatas(40000);
        Azafatas azafata2 = new Azafatas(45500);
        Tripulacion tripulacionAvion = new Tripulacion(piloto1, piloto2, operadorC1, comisario1, comisario2, azafata1, azafata2);
        Vuelos vuelo1 = new Vuelos("vuelo01","30/04/2023", "aguachia", "curumani", avion1,tripulacionAvion);
        
        
        
        avion1.agregar(pasajero1);
        System.out.println("La silla del pasajero es: "+pasajero1.getSilla());
        vuelo1.reservarSilla("E01A");
        System.out.println(vuelo1.getAviones().toString());
        avion1.buscaInformacion("E01A", 6);
        
        System.out.println("arralist de pasajero: "+avion1.getPasajeros());
        System.out.println("El coste total del vuelo es: "+vuelo1.getCoste());
        
    }
    
    
}
