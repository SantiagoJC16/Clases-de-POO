
package schprueba;
import java.util.Scanner;

public class Empleado {
    public String nombre;
    public String ocupacion;
    public int id;
    
    public void pedirDatos(){
        
        Scanner pedir = new Scanner(System.in);
        
        System.out.println("Hola dame tu nombre");
        nombre = pedir.nextLine();
        System.out.println("Es que te ocupas? ");
        ocupacion = pedir.nextLine();
        System.out.println("Ingresa tu ID? ");
        id = pedir.nextInt();
    }
    
    public void mostrarDatos(){
        
        System.out.println("Nomre: "+nombre);
        System.out.println("ocupacion: "+ocupacion);
        System.out.println("ID: "+id);
        
    }
    
}
