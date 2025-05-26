
package constructor;


public class Constructor {
//atrivutos privados
    private String nombre;
    private int edad;
    
    //Crear constructor
    //clik derecho, insert code, contructor
    // Manual: public o lo que sea, nombre de la calse(las variables que utilizaré){}
    public Constructor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodo para obtener el nombre
    // Click derecho, insert code, getter;
// get : obtener=getter
    public String getNombre() {
        return nombre;
    } 
    //Metodod para establecer el nombre
     // Click derecho, insert code, setter;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
// Metodos para la edad
    //el set es encambio para que obtenga un valor
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
 
    public static void main(String[] args) {
       //Crear objeto Constructor
       Constructor persona = new Constructor("Santiago Chafla",20);
       //Accerder a los datos a trevez de los metodos de acceso get
       
       System.out.println("nombre: "+persona.getNombre());
       System.out.println("edad: "+persona.getEdad());
       
       //Modificar datos a travez de los metodos de acceso set
       
       persona.setEdad(21);
        System.out.println("edad actualizada: "+persona.getEdad());
    }
    
}
