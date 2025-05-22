
package schprueba;
import java.util.Scanner;

public class Ventas {
    
    public String nombre2;
    public int codigo;
    public double monto;
    public double comision;
    
    public void calcularComision(){
        
        Scanner pedir = new Scanner(System.in);
        
       System.out.println("Ingrese el codigo de venta");
       codigo = pedir.nextInt(); 
       System.out.println("Ingrese el monto de la venta");
       monto = pedir.nextDouble();
      
       comision = monto * 0.1;
    }
    
    public void MostrarDetalleVenta(Empleado empleado){
       
        nombre2 = empleado.nombre;
        
       System.out.println(" El vendedor "+nombre2);
       System.out.println(" Ha realizado una venta de "+monto+" $");
       System.out.println(" con una comision del 10%: "+comision+" $");
    }
    
}
