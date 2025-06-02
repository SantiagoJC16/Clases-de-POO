package herencias;
import java.util.Scanner;

public class Herencias {
    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
          
        System.out.println("Nombre del perro: ");
        String nombrePerro = pedir.nextLine();
        System.out.println("Tipo de aliemto del perro: ");
        String tipo_alimentoPerro = pedir.nextLine();
        System.out.println("Edad del perro: ");
        int edadPerro = pedir.nextInt();
        pedir.nextLine();
        System.out.println("Raza del perro: ");
        String razaPerro = pedir.nextLine();
        
        Perro perro = new Perro(nombrePerro,tipo_alimentoPerro,edadPerro,razaPerro);
        
        System.out.println("Nombre del gato: ");
        String nombreGato = pedir.nextLine();
        System.out.println("Tipo de aliemto del gato: ");
        String tipo_alimentoGato = pedir.nextLine();
        System.out.println("Edad del gato: ");
        int edadGato = pedir.nextInt();
        pedir.nextLine();
        System.out.println("Raza del gato: ");
        String razaGato = pedir.nextLine();
        
        Gato gato = new Gato(nombreGato,tipo_alimentoGato,edadGato,razaGato);
        
        System.out.println("Nombre del caballo: ");
        String nombreCaballo = pedir.nextLine();
        System.out.println("Tipo de aliemto del caballo: ");
        String tipo_alimentoCaballo = pedir.nextLine();
        System.out.println("Edad del caballo: ");
        int edadCaballo = pedir.nextInt();
        pedir.nextLine();
        System.out.println("Raza del caballo: ");
        String razaCaballo = pedir.nextLine();
       
        Caballo caballo = new Caballo(nombreCaballo,tipo_alimentoCaballo,edadCaballo,razaCaballo);
        System.out.println( "  ");
        perro.mostrar();
        System.out.println("----------------------------------");
        gato.mostrar();
        System.out.println("----------------------------------");
        caballo.mostrar();
        System.out.println("----------------------------------");
        
        
    }
    
}
