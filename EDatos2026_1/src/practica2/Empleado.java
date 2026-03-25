package practica2;

import practica1.Persona;

/**
 *
 * @author admin
 */
public abstract class Empleado extends Persona {
    private int sueldo;
    private String dpto;
    
    public static final int SALARIO_MINIMO = 3000000;
    
    public abstract int calcularSalario();
    public abstract int getIPS();

    public Empleado() {
    }

    public Empleado(int cedula, String nom, byte edad, int sal) {
        super(cedula, nom, edad);
        sueldo = sal;
        dpto = "Ventas";
    }

    public Empleado(int ci, String nombre, byte edad, String telefono,
            int sal, String dep) {
        super(ci, nombre, edad, telefono);
        sueldo = sal;
        dpto = dep;
    }

    
    
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + "sueldo=" + sueldo + ", dpto=" + dpto + '}';
    }
    
    
}
