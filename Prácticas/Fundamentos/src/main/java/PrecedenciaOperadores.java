
public class PrecedenciaOperadores {

    public static void main(String[] args) {
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado = 4 + 5 * 6 / 3;
        /*
            5 * 6 = 30 -> 4 + 30 /3
            30 / 3 = 10 -> 4 + 10
            4 + 10 = 14
            Resultado = 14
        */
        System.out.println("resultado = " + resultado);
        
        //Agrupando y modificando la expresión
        var resultado2 = (4 + 5) * 6 / 3;
        /*
            (4 + 5) = 9 -> 9 * 6 / 3
            9 * 6 = 54 - > 54 / 3
            54 / 3 = 18
            Resultado2 = 18
        */
        System.out.println("resultado2 = " + resultado2);
    }
}
