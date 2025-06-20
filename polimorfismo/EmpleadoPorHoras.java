
package polimorfismo;

public class EmpleadoPorHoras extends Empleado {
    
    //Variables
    private int horasTrabajadas;
    private double tarifaPorHora;
    
    //Constructor

    public EmpleadoPorHoras(int horasTrabajadas, double tarifaPorHora, String nombre) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    
    @Override
    public double calcularSalario(){
        return horasTrabajadas * tarifaPorHora;
    }
}
