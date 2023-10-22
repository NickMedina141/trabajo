
package areoliniea;

public class Tripulacion {
    private Piloto piloto1;
    private Piloto piloto2;
    private Operador_comunicacion operadorC1;
    private Comisario_abordo comisario1;
    private Comisario_abordo comisario2;
    private Azafatas azafata1;
    private Azafatas azafata2;

    public Tripulacion(Piloto piloto1, Piloto piloto2, Operador_comunicacion operadorC1, Comisario_abordo comisario1, Comisario_abordo comisario2, Azafatas azafata1, Azafatas azafata2) {
        this.piloto1 = piloto1;
        this.piloto2 = piloto2;
        this.operadorC1 = operadorC1;
        this.comisario1 = comisario1;
        this.comisario2 = comisario2;
        this.azafata1 = azafata1;
        this.azafata2 = azafata2;
    }

    public Piloto getPiloto1() {
        return piloto1;
    }

    public void setPiloto1(Piloto piloto1) {
        this.piloto1 = piloto1;
    }

    public Piloto getPiloto2() {
        return piloto2;
    }

    public void setPiloto2(Piloto piloto2) {
        this.piloto2 = piloto2;
    }

    public Operador_comunicacion getOperadorC1() {
        return operadorC1;
    }

    public void setOperadorC1(Operador_comunicacion operadorC1) {
        this.operadorC1 = operadorC1;
    }

    public Comisario_abordo getComisario1() {
        return comisario1;
    }

    public void setComisario1(Comisario_abordo comisario1) {
        this.comisario1 = comisario1;
    }

    public Comisario_abordo getComisario2() {
        return comisario2;
    }

    public void setComisario2(Comisario_abordo comisario2) {
        this.comisario2 = comisario2;
    }

    public Azafatas getAzafata1() {
        return azafata1;
    }

    public void setAzafata1(Azafatas azafata1) {
        this.azafata1 = azafata1;
    }

    public Azafatas getAzafata2() {
        return azafata2;
    }

    public void setAzafata2(Azafatas azafata2) {
        this.azafata2 = azafata2;
    }
    
    
}
