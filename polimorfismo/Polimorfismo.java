
package polimorfismo;

import java.util.ArrayList;

public class Polimorfismo {

    
    public static void main(String[] args) {
       
        //Arreglo
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        // Añadir datos al arrayList;
        empleados.add(new EmpleadoFijo("Carlos",470));
        empleados.add(new EmpleadoPorHoras(40,2,"Ana"));
        
        //Calcular el slario Total
        double salarioTotal = 0;
        //empleado va a tomar los valores que tiene empleados 
        for(Empleado empleado : empleados){
            salarioTotal -= empleado.calcularSalario();
                       
        }
        
        //Imprimir os valores
        System.out.println("el salario total de todos los empleados es:"+salarioTotal);
    }
    
}
