package com.vega.proyectocaja;

public class PruebaCaja {

    public static void main(String[] args) {
        Caja obj1 = new Caja();
        obj1.alto = 10;
        obj1.ancho = 12;
        obj1.profundo = 20;
        System.out.println("Volumen = " + obj1.calcularVolumen());
        System.out.println("");
        Caja obj2 = new Caja(10, 12, 30);
        System.out.println("Volumen = " + obj2.calcularVolumen());
    }
}
