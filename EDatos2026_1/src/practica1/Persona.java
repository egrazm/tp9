
package practica1;

/**
 * TDA Persona, define los atributos y comportamientos de todas las personas
 * @author cbarua
 */
public abstract class Persona {
    protected int ci;
    protected String nombre;
    protected byte edad;
    protected String telefono;

    public Persona() {
        nombre = "NN";
        telefono = "";
    }
    
    public Persona(int cedula, String nom, byte edad) {
        ci = cedula;
        nombre = nom;
        this.edad = edad;
        telefono = "Sin Telef";
    }

    public Persona(int ci, String nombre, byte edad, String telefono) {
        this.ci = ci;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return ci + ", " + nombre +  " " + edad + " anhos, telef. " + telefono;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
    
}
