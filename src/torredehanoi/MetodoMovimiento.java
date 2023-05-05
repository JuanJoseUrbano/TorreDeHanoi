package torredehanoi;

import javax.swing.*;
import java.util.Stack;

public class MetodoMovimiento {

    private int nMovimientos = 0;
    public void moverDisco(Stack<Integer> varillaA, Stack<Integer> varillaB) {
        int disco = varillaA.pop();
        varillaB.push(disco);
    }

    public void moverDiscos(int nDiscos, Stack<Integer> varillaA, Stack<Integer> varillaB, Stack<Integer> varillaC) {
        if (nDiscos == 1) {
            int disco = varillaA.pop();
            varillaB.push(disco);
            mostrarTorres(varillaA,varillaB,varillaC);
        } else {
            moverDiscos(nDiscos-1, varillaA, varillaB, varillaC);
            moverDisco(varillaA,varillaB);
            mostrarTorres(varillaA,varillaB,varillaC);
            moverDiscos(nDiscos-1, varillaC, varillaA, varillaB);
        }

    }
    public void mostrarTorres(Stack<Integer> varillaA, Stack<Integer> varillaB, Stack<Integer> varillaC) {
        System.out.println("Torre A: " + varillaA.toString());
        System.out.println("Torre B: " + varillaB.toString());
        System.out.println("Torre C: " + varillaC.toString());
        }
}