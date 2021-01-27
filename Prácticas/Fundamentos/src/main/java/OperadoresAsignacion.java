
public class OperadoresAsignacion {

    public static void main(String[] args) {
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("c = " + c);

        a += 1; //a = a + 1
        System.out.println("a = " + a);
        
        a -= 1; //a = a - 1
        System.out.println("a = " + a);
        
        b *= 2; //b = b * 2
        System.out.println("b = " + b);
        
        b /= 4; //b = b / 4
        System.out.println("b = " + b);
        
        a %= 2; //a = a % 2
        System.out.println("a = " + a);
    }
}
