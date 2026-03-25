package practica3;

import practica2.Empleado;

public class Vendedor extends Empleado {
    private int ventas;
    private float porComision;

    public Vendedor() {
    }

    public Vendedor(int ci, String nombre, byte edad, String telefono,
            int sal, int ven, float com) {
        super(ci, nombre, edad, telefono, sal, "Ventas");
        ventas= ven;
        porComision=com;
    }
    

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public float getPorComision() {
        return porComision;
    }

    public void setPorComision(float porComision) {
        this.porComision = porComision;
    }

    public int getComision(){
        return Math.round((ventas*porComision)/100);
    }
    @Override
    public int calcularSalario() {
        return Math.round((getSueldo() + (ventas * porComision)) * 0.91f);
    }

    @Override
    public int getIPS() {
        return Math.round((getSueldo() + (ventas * porComision)) * 0.09f);
    }

    @Override
    public String toString() {
        return "Vendedor{" + super.toString() + ", ventas=" + ventas
                + ", porComision=" + porComision + '}';
    }
}
