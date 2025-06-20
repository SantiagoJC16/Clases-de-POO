
package polimorfismo;

abstract class Empleado {
   // Variables
    
   protected String nombre;
   protected double salario;
   
   //Cosntructor 
   // salario solo va a estar en las clases hijas 
   public Empleado(String nombre){
       
       this.nombre = nombre;
   
   }
   
   // Metodo
   public abstract double calcularSalario();
}
