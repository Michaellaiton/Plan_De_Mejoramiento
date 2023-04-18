package davi_plata;
import java.util.Scanner;
public class ejecucion {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);

        int docmento, contraseña;
        int opcion=1, eleccion=1;

        ingresar ingresar=new ingresar(contraseña=0, docmento=0);

        System.out.println("numero de documento ");
        docmento=lectura.nextInt();
        System.out.println("contraseña ");
        contraseña=lectura.nextInt();

        while (opcion==1) {    
        
            System.out.println("1 Para retirar plata, 2 Para depositar plata, marca 3 Para consultar saldo, 4 Para recargar");
            eleccion=lectura. nextInt();
            int totalDinero=50000, retiroDinero, dinero;
            switch (eleccion) {
                case 1:
    
                sacarplata sacarplata=new sacarplata(totalDinero, retiroDinero=0, dinero=0);
        
                System.out.println("cuanto va a retirar ");
                retiroDinero=lectura.nextInt();
                sacarplata.sacar();
                dinero=(totalDinero-retiroDinero);
        
                break;
                case 2:
                int dineroIngresado;
                
                System.out.println("cuanto va a depositar");
                dineroIngresado=lectura.nextInt();
                
                dinero=dineroIngresado;
                
                
                System.out.println("su deposito fue de: " +dinero);
                break;
                case 3:
                int saldo=10000;
                
                consultar consultar=new consultar(saldo);
                
                System.out.println("su saldo es: " +saldo);
            
                break;
                case 4:
                int num, valor, valorR;
    
                recargar recargar=new recargar(num=0, valor=0);
    
                System.out.println("Numero a hacer recarga: ");
                num=lectura.nextInt();
                System.out.println("Valor de la recarga: ");
                valor=lectura.nextInt();
                valorR=valor;
                System.out.println("La recarga fue de: " +valor);
                System.out.println("buen dia");
                break;
            }
        
        }



        lectura.close();
    }
}
