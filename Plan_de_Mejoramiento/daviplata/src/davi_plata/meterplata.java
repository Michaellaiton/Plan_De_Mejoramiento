package davi_plata;

public class meterplata extends ejecucion {
    private int dineroIngresado, dinero;

    public meterplata(int dineroIngresado, int dinero) {
        this.dineroIngresado = dineroIngresado;
        this.dinero = dinero;
    }

    public int getDineroIngresado() {
        return dineroIngresado;
    }

    public void setDineroIngresado(int dineroIngresado) {
        this.dineroIngresado = dineroIngresado;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    
}
