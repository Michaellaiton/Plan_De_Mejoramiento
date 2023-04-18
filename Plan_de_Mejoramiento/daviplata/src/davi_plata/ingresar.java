package davi_plata;

public class ingresar extends ejecucion {
    private int contraseña;
    private int docmento;

    public ingresar(int contraseña, int docmento) {
        this.contraseña = contraseña;
        this.docmento = docmento;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public int getDocmento() {
        return docmento;
    }

    public void setDocmento(int docmento) {
        this.docmento = docmento;
    }

    public void entrar() {
        
    }

}
