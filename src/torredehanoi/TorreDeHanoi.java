package torredehanoi;

import java.util.Scanner;
import java.util.Stack;

public class TorreDeHanoi {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        MetodoMovimiento m = new MetodoMovimiento();
        Stack<Integer> varillaA = new Stack<Integer>();
        Stack<Integer> varillaB = new Stack<Integer>();
        Stack<Integer> varillaC = new Stack<Integer>();
        int nDiscos=0;
        System.out.println("TORRE HANOI\n"
                + "Digite el numero de discos: ");
        nDiscos = entrada.nextInt();
        for (int i = nDiscos; i > 0; i--) {
            varillaA.push(i);
        }// resuelve la Torre de Hanoi
        m.moverDiscos(nDiscos, varillaA, varillaB, varillaC);
        m.mostrarTorres(varillaA, varillaB, varillaC);
    }

}
