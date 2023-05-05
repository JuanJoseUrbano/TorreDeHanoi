package torredehanoi;

import java.util.Scanner;

public class EjecucionFactorial {
    //hacer un digiturno
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
         FactorialRecursividad fr = new FactorialRecursividad();
         System.out.print("factoril de :");
          int x= entrada.nextInt();
          System.out.println("El factorial convencional de "+x+" es: "+fr.factorialConvecional(x));
          System.out.println("El factorial de "+x+" es: "+fr.factorialRecursividad(x));
          System.out.print("Digite la cantidad de numeros a sumar: ");
          int n = entrada.nextInt();
          System.out.println(fr.sumaRecursividad(n));
    } 
    
}
