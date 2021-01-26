
public class InferenciaTipos {

    public static void main(String[] args) {
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);

        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);

        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);

        //Unicode
        var varChar = '\u0021';
        System.out.println("varChar = " + varChar);

        var varCharDecimal = (char) 33;
        System.out.println("varCharDecimal = " + varCharDecimal);

        var varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);

        int letra = 'a';
        System.out.println("letra = " + letra);
    }
}
