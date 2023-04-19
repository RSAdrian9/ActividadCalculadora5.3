package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    // Definimos el objeto para usarlo en todos los tests
    static Calculadora miCalculadora;

    @BeforeAll
    public static void setUpClass(){
        miCalculadora = new Calculadora();
    }

    @Test
    @DisplayName("Suma dos números")
    void testSumar() {
        assertEquals(5, miCalculadora.sumar(2, 3));
        assertEquals(-5, miCalculadora.sumar(-2, -3));
        assertEquals(0, miCalculadora.sumar(0, 0));
        assertEquals(5, miCalculadora.sumar(-5, 10));
    }

    @Test
    @DisplayName("Resta dos números")
    void testRestar() {
        assertEquals(1, miCalculadora.restar(-2, -3));
        assertEquals(2, miCalculadora.restar(5, 3));
        assertEquals(2, miCalculadora.restar(3.5, 1.5));
        assertEquals(15, miCalculadora.restar(10, -5));
    }

    @Test
    @DisplayName("Multiplica dos números")
    void testMultiplicar() {
        assertEquals(6, miCalculadora.multiplicar(-2,-3));
        assertEquals(5.25, miCalculadora.multiplicar(3.5,1.5));
        assertEquals(6, miCalculadora.multiplicar(2,3));
        assertEquals(-50, miCalculadora.multiplicar(10,-5));
    }

    @Test
    @DisplayName("Divide dos números")
    void testDividir() throws Exception {
        assertEquals(3, miCalculadora.dividir(6,2));
        assertEquals(0, miCalculadora.dividir(0,5));
        assertEquals(2.3333333333333335, miCalculadora.dividir(3.5,1.5));
        assertEquals(2, miCalculadora.dividir(-6,-3));
    }

    @Test
    @DisplayName("Potencia dos números")
    void testPotencia() {
        assertEquals(-125, miCalculadora.potencia(-5, 3));
        assertEquals(16, miCalculadora.potencia(-2, 4));
        assertEquals(1, miCalculadora.potencia(5, 0));
        assertEquals(8, miCalculadora.potencia(2, 3));
    }

    @Test
    @DisplayName("Raíz de dos números")
    void testRaiz() {
        assertEquals(4, miCalculadora.raiz(16));
        assertEquals(3, miCalculadora.raiz(9));
        assertEquals(2, miCalculadora.raiz(4));
        assertEquals(1.5, miCalculadora.raiz(2.25));
    }

}

