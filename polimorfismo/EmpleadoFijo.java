
package polimorfismo;

public class EmpleadoFijo extends Empleado{
    
    // Variables
    private double salarioMensual;
    
    // Constructor
    public EmpleadoFijo(String nombre, double salarioMensual){
        
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
        
    }
    
    
}
