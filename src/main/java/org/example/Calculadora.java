package org.example;

public class Calculadora {

    double sumar(double a, double b) {
        return a + b;
    }

    double restar(double minuendo, double sustraendo) {
        return minuendo - sustraendo;
    }

    double multiplicar(double a, double b) {
        return a * b;
    }

    double dividir(double dividendo, double divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("El divisor es 0");
        }
        return dividendo / divisor;
    }

    double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    double raiz(double radicando) {
        return Math.sqrt(radicando);
    }

}
