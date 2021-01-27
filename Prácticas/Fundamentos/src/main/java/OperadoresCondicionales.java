
public class OperadoresCondicionales {

    public static void main(String[] args) {
        var a = -1;
        var valorMaximo = 10;
        var valorMinimo = 0;

        //Operador AND &&
        //ambos valores deben ser verdaderos
        var resultado = a >= 0 && a <= 10;
        System.out.println("resultado = " + resultado);
        if (resultado) {
            System.out.println("Dentro del rango");
        } else {
            System.out.println("Fuera del rango");
        }

        //Operador OR ||
        //si un valor es verdadero, toda la expresión es verdadera
        var vacaciones = true;
        var diaDescanso = false;
        if (vacaciones || diaDescanso) {
            System.out.println("El padre puede asistir al juego de su hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }
    }
}
