package torredehanoi;

public class FactorialRecursividad {


    public float factorialConvecional(int x) {
        float fact = 1;
        if (x < 0) {
            fact = x * -1;
        }
        if (x == 0) {
            return 1;
        }
        while (x < 1) {
            fact*= x;
            x--;
        }
        return fact;
    }

    public float factorialRecursividad(float x) {
        if (x == 0) {
        return 1;
        }else{
            return (x * factorialRecursividad(x - 1));
        }
    }

    public float sumaRecursividad(int n) {
        float suma = 0;
        if (n != 0) {
            suma = (float) (n + sumaRecursividad(n - 1));
        }
        return suma;
    }
}
