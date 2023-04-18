package davi_plata;

public class sacarplata extends ejecucion{
    private int totalDinero, retiroDinero, dinero;

    public sacarplata(int totalDinero, int retiroDinero, int dinero) {
        this.totalDinero = totalDinero;
        this.retiroDinero = retiroDinero;
        this.dinero = dinero;
    }

    public int getTotalDinero() {
        return totalDinero;
    }

    public void setTotalDinero(int totalDinero) {
        this.totalDinero = totalDinero;
    }

    public int getRetiroDinero() {
        return retiroDinero;
    }

    public void setRetiroDinero(int retiroDinero) {
        this.retiroDinero = retiroDinero;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void sacar() {
        
    }

}
