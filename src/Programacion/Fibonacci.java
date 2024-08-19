
package Programacion;
import java.util.Scanner;
public class Fibonacci {
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Ingrese hasta que termino desea obtener la serie de Fionacci");
    int termino=sc.nextInt();
    int N0=0;
    int N1=1;
    int N;
    for(int i=1;i<=termino;i++){
      System.out.print(N0 + "_");
      N=N0+N1;
      N0=N1;
      N1=N;
    }
  }
}
