package davi_plata;

public class consultar extends ejecucion{
    private int saldo=10000;

    public consultar(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    
}
