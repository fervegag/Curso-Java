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

    }

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
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
        sb.append(", Persona").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
