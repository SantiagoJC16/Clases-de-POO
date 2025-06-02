package herencias;
//perro es una calse que se hereda de animal por eso se pone asi:
public class Perro extends Animal{
    //variables
    private String raza;

    //Añadir un constructor con las variables de la clase padre añadiendo las variables de esta clase
    public Perro(String nombre, String tipo_alimentacion, int edad, String raza) {
        super(nombre, tipo_alimentacion, edad);
        this.raza = raza;
    }
    
    //Metodo get y set

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    //Metodo pra mostrar datos
    
    public void mostrar(){
        
        System.out.println( getNombre() +" "+getTipo_alimentacion()+" "+getEdad()+" "+getRaza() );
    }
    
}
