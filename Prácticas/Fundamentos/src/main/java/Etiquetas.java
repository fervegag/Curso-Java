
public class Etiquetas {

    public static void main(String[] args) {

        inicio:
        for (var contador = 0; contador <= 10; contador++) {

            if (contador % 2 != 0) {
                continue inicio; //Ir a la linea donde esta la etiqueta
            }
            System.out.println("contador = " + contador);
        }
    }
}
