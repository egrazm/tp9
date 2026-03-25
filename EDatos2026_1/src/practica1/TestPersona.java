
package practica1;

/**
 * Clase para probar la aplicacion
 * @author cbarua
 */
public class TestPersona {
    Persona p, p2, p3;
    Persona[] personas;

    public TestPersona() {
        personas = new  Persona[10];
        /**
        p = new Persona();
        //System.out.println(p);   //hashcode
        //System.out.println(p.ci + " " + p.nombre);
        p.ci = 1234567;
        p.nombre = "Trump Ito";
        //System.out.println(p.getCi() + " " + p.nombre);
        p2 = new Persona(5423651, "Juana La Cubana", (byte)50);
        //System.out.println(p2);
        p3 = new Persona(4521254, "Ramon Casco", (byte)25, "999-123456");
        //System.out.println(p3);
        */
        personas[0] = p;
        //personas[1] = new Persona(12365487, "Luisa Vera", (byte)28);
        personas[2] = p2;
        personas[3] = p3;
        
        for (Persona per : personas) 
            if(per != null) System.out.println(per);
        
    }
    
    public static void main(String[] args) {
        new TestPersona();
    }
    
}
