
package Programacion;
import java.util.Scanner;
public class Primo {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Ingrese un numero");
    int num=sc.nextInt();
    boolean primo=true;
    for(int i=2;i<num;i++){
      if(num%i==0){
          primo=false;
          break;
      }
    }
    if(primo){
      System.out.println("El numero "+num+" es primo ");
    }else{
      System.out.println("El numero "+num+" NO es primo ");
    }
    }
 }
