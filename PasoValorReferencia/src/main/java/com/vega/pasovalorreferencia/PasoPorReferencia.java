package com.vega.pasovalorreferencia;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Fernando";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiaValor(persona1);//Se pasa su referencia, más no su valor
        System.out.println("persona1 con cambio de nombre: " + persona1.nombre);
    }
    
    public static void cambiaValor(Persona persona){
        persona.nombre = "Karla";
    }
}
