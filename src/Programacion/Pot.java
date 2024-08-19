
package Programacion;

import java.util.Scanner;
public class Pot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Para calcular la potencia ingrese la base");
        int A=sc.nextInt();
        System.out.println("Ingrese el exponente");
        int B=sc.nextInt();
        int pot=1;
        if(B>0){
            for(int i=1;i<=B;i++){
               pot*=A;
            }
            System.out.println("La potencia es "+pot);
        }else{
            System.out.println("Ingrese un exponente positivo");            
        }
       
        
        
    }
}
