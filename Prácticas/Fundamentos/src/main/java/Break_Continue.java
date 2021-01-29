
public class Break_Continue {

    public static void main(String[] args) {
        for (var contador = 0; contador <= 10; contador++) {

            if (contador % 2 == 0) {
                System.out.println("contador = " + contador);
                break;
                /*
                    De esta manera detenemos el cliclo
                    solo obtendremos el primero número par que se encontró
                 */
            }
        }
        System.out.println("\n**********************************************\n");
        for (var contador = 0; contador <= 10; contador++) {

            if (contador % 2 == 0) {
                continue;// Ir a la siguiente iteración del ciclo for
            }
            System.out.println("contador = " + contador);
        }
    }
}
