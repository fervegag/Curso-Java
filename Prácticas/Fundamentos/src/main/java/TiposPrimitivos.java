
public class TiposPrimitivos {

    public static void main(String[] args) {
        //Tipos enteros: byte, short, int, long

        byte numeroByte = 10;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor mínimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo byte: " + Byte.MAX_VALUE);
        byte numeroByte2 = (byte) 129;
        System.out.println("numeroByte2 = " + numeroByte2);
        System.out.println("*************************************************");

        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor mínimo short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo short: " + Short.MAX_VALUE);
        System.out.println("*************************************************");

        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor mínimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo int: " + Integer.MAX_VALUE);
        int numeroInt2 = (int) 2147483648L;
        System.out.println("numeroInt2 = " + numeroInt2);
        System.out.println("*************************************************");

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor mínimo long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo long: " + Long.MAX_VALUE);
        System.out.println("*************************************************");

        //Tipos Flotantes: float, double
        float numeroFloat = 10.0F;
        float numeroFloat2 = (float) 10.0;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("numeroFloat2 = " + numeroFloat2);
        System.out.println("Valor mínimo float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo float: " + Float.MAX_VALUE);
        float numeroFloat3 = (float) 3.4028236E38D;
        System.out.println("numeroFloat3 = " + numeroFloat3);
        System.out.println("*************************************************");

        double numeroDouble = 10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor mínimo double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo double: " + Double.MAX_VALUE);
        double numeroDouble2 = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble2);
        System.out.println("*************************************************");

        //Tipos Char
        char miCaracter = 'M';
        System.out.println("miCaracter = " + miCaracter);

        //Unicode
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);

        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        //Tipos boolean
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        boolean varBoolean1 = false;
        System.out.println("varBoolean1 = " + varBoolean1);
    }
}
