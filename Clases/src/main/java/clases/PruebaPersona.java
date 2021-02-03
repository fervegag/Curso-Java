package clases;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        //Se llama al constructor vacio que se creó automáticamente
        persona1.nombre = "Juan";
        persona1.apellido = "Pérez";
        persona1.desplegarInformacion();

        Persona persona2 = new Persona();
        System.out.println("Persona2: " + persona2);

        persona2.desplegarInformacion();
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();

    }
}
