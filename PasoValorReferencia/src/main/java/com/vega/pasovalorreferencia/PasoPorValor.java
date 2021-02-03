package com.vega.pasovalorreferencia;

public class PasoPorValor {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x);
        cambioValor(x);
    }

    public static void cambioValor(int arg1) {
        //Se pasa una copia de la variable x
        //Si cambiamos el valor del argumento recibido, no afecta la varibale local x
        System.out.println("arg1 = " + arg1);

    }
}
