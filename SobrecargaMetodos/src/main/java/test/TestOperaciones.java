package test;

import operaciones.Operaciones;

public class TestOperaciones {

    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado = " + resultado);
        var resultado2 = Operaciones.sumar(5.5, 3.2);
        System.out.println("resultado2 = " + resultado2);
        var resultado3 = Operaciones.sumar(4.2, 2);
        System.out.println("resultado3 = " + resultado3);
        var resultado4 = Operaciones.sumar(3, 5L);
        System.out.println("resultado4 = " + resultado4);
    }

}
