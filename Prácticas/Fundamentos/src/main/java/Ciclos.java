
public class Ciclos {

    public static void main(String[] args) {
        var contador = 0;
        //Ciclo While
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }
        System.out.println("\n**********************************************\n");
        //Ciclo Do - While
        var contador2 = 0;
        do {
            System.out.println("contador2 = " + contador2);
            contador2++;
        } while (contador2 < 3);
        System.out.println("\n**********************************************\n");
        //Ciclo for
        for(var contador3 = 0; contador3 < 3; contador3++){
            /*
                La variable contador3 solo se puede utilizar dentro del ciclo for
                una evs terminado el proceso, la varible se destruye
            */
            System.out.println("contador3 = " + contador3);
        }
    }
}
