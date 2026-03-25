package practica2;

/**
 *
 * @author admin
 */
public class Gerente extends Empleado {
    private int bonificacion;

    public Gerente() {
    }

    public Gerente(int cedula, String nom, byte edad, int sal, int bonif) {
        super(cedula, nom, edad, sal);
        bonificacion = bonif;
    }
    
    public Gerente(int ci, String nombre, byte edad, String telefono, 
            int sal, String dep, int bonif) {
        super(ci, nombre, edad, telefono, sal, dep);
        bonificacion = bonif;
    }

    
    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public String toString() {
        return "Gerente{" + super.toString() + " Bonificacion: " + bonificacion + '}';
    }
    
    
    @Override
    public int calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
