package consolas;
import java.util.Scanner

public class Consolas {   
    public static void main(String[] args) {
        //lectura es un objeto de tipo scanner que me permiten trabajar con las variables.
        Scanner lectura = new Scanner(System.in);
        String nombre;
        String apellido;
        String celular;
         //para los valores te tipo string es [nombre del objeto.next()].
        
        System.out.println("Bienvenido a consolas");
        System.out.println("Ingrese el nombre");
        nombre = lectura.next();
        System.out.println("Ingrese el apellido");
        apellido = lectura.next();
        System.out.println("Ingrese el número de teléfono");
        celular = lectura.next();
        
        System.out.println("Los datos ingresado son: ");
        System.out.println("nombre: "+nombre+" "+apellido);
        System.out.println("el numero de telefono es: "+celular);
        
        
    }
    
}
