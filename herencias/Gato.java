package herencias;

public class Gato extends Animal{
    
    //Variable
    String raza;
    
    public Gato(String nombre, String tipo_alimentacion, int edad, String raza) {
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
    
    public void mostrar(){
        
        System.out.println( getNombre() +" "+getTipo_alimentacion()+" "+getEdad()+" "+getRaza() );
    }
    
}
