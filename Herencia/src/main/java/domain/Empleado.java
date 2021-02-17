package domain;

public class Empleado extends Persona {

    /*Cuando no se especifica la clase de la cual extiende,
    el compilador hace que extienda de la clase Object
    En Java no hay herencia multiple*/

 /*Los constructores no se heredan
    pero podemos acceder a ellos con la palabra reservada super()*/
    
    protected int idEmpleado;
    protected double sueldo;
    protected static int contadorEmpleado;

    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
        //super(nombre);
        //Ya no utilizaremos super para inicializar el atributo nombre
        //Llamamos al constructor vacío con this();
        this();
        //No se puede tener super y this el mismo tiempo
        this.nombre = nombre; //Pertenece a la clase padre
        this.sueldo = sueldo; //Pertenece a la clase hija
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
//        sb.append(", nombre=").append(this.nombre);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
