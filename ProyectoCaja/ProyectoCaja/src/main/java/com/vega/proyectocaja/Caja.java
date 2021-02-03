package com.vega.proyectocaja;

public class Caja {

    //Definir atributos de la clase
    int ancho;
    int alto;
    int profundo;

    //Constructor vacio
    public Caja() {
        System.out.println("Ejecutando constructor vacio");
    }

    //Constructor con 3 argumentos
    public Caja(int ancho, int alto, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    //Metodo que calcule el volumen
    public int calcularVolumen() {
        int volumen = this.alto * this.ancho * this.profundo;
        return volumen;
    }
}
