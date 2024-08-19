
package Programacion;
import java.util.Scanner;
public class Velocidad {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=1;
        while (true){
        System.out.println("Ingrese los minutos,segundos del corredor "+i+" o salir para terminar");
        String entrada=sc.nextLine();               //Ingreso es el PAR minuto,segundo//
            if(entrada.equalsIgnoreCase("salir")){
              break;
            }else{
              String[] Entrada=entrada.split(",");
              int min=Integer.parseInt(Entrada[0]);
              int seg=Integer.parseInt(Entrada[1]);
              int tiempo=min*60+seg;
              int distancia=1500;
              double vel=(double)distancia/tiempo;
              System.out.println("La velocidad del corredor "+i+" es "+ String.format("%.2f",vel));
              i=i+1;
            }  
        }
    }
}
