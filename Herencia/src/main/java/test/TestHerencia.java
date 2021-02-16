package test;

import domain.Empleado;
import domain.Cliente;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Fernando", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        Cliente cliente1 = new Cliente("Eduardo", new Date(), true, 'M', 23, "Valle");
        System.out.println("cliente1 = " + cliente1);
        Cliente cliente2 = new Cliente("Karla", new Date(), false, 'F', 21, "Condesa");
        System.out.println("cliente2 = " + cliente2);
    }
}
