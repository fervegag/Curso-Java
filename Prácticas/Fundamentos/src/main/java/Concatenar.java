
public class Concatenar {

    public static void main(String[] args) {
        var usuario = "Fernando";
        var titulo = "Licenciado";

        var datos = titulo + " " + usuario;
        System.out.println("datos = " + datos);

        var i = 3;
        var j = 4;

        System.out.println(i + j); //Se realiza la suma
        System.out.println(i + j + datos); //la evaluación de la expresión de realiza de izquierda a derecha
        //por eso primero de hace la suma
        System.out.println(datos + i + j); //Contexto cadena

        //Concatenar y evaluar la expresión
        System.out.println(datos + " " + (i + j));
    }
}
