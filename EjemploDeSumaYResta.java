package ejemplo.de.suma.y.resta;
public class EjemploDeSumaYResta {
    //Declaración de variables
    private int num1, num2, sumar, restar;
    public EjemploDeSumaYResta(int num1, int num2){
    this.num1=num1;
    this.num2=num2;
}
    //Imprimir suma
    public void suma(){
        sumar= num1 + num2;
        System.out.println("La suma de los numeros es = "+sumar);
        
    }
    public void resta(){
        restar= num1 - num2;
        System.out.println("La resta de los numeros es = "+restar);
    }
    
   
   public static void main(String[] args) {
       //llamar al método
        EjemploDeSumaYResta resultado = new EjemploDeSumaYResta(1,2);
        // resultado es el objeto
        resultado.suma();
        resultado.resta();
       
       
    }
    
}
