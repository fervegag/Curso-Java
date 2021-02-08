package com.vega.palabrathis;

class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: " + persona.nombre);
        System.out.println("persona apellido: " + persona.apellido);

    }
}

class Persona {

    String nombre;
    String apellido;
    Persona(){
        
    }
    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this: " + this);
        new Imprimir().imprimir(this);
        //De esta manera solo cambiamos la sintaxis
        // Imprimir imprimir = new Imprimir(this);
    }
}

class Imprimir {

    public void imprimir(Persona persona) {
        System.out.println("persona desde impirmir: " + persona);
        System.out.println("impresión del objeti actual (this): " + this);
    }
}
