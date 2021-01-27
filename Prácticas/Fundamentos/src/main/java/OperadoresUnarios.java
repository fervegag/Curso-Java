
public class OperadoresUnarios {

    public static void main(String[] args) {
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //Pre-incremento (Símbolo antes de la variable)
        var e = 3;
        var f = ++e; //Primero se incrementa la variable y después se usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //Post-incremento (Simbolo después de la variable)
        var g = 5;
        var h = g++; //Primero se utiliza el valor de la variable y después de incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //Pre-decremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //Post-decremento
        var k = 4;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
