
package Programacion;
import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("Ingrese un numero o 'terminar' para finalizar el programa");
            String entrada=input.nextLine();
            if(entrada.equalsIgnoreCase("terminar")){
                break;
            }
            int num = Integer.parseInt(entrada);
            if(num%2==0){
                System.out.println("El numero "+ num+" es par");
            }else{
                System.out.println("El numero "+num+" es impar");
            }
        }    
    }  
}
