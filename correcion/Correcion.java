
package correcion;
import java.util.Scanner;

public class Correcion {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int numeroDatos;
        String nombre;
        int cantidad;
        double precioUnitario;
        int categoria;
        
        do{
            System.out.println("Cuantos datos quieres ingresar?");
            numeroDatos = scanner.nextInt();
            
            if(numeroDatos <= 0 ){
                System.out.println("los datos no pueden ser negativos y 0");
            }
            
        }while(numeroDatos <= 0);
        scanner.nextLine();
        
        Import_categoria[] producto = new Import_categoria[numeroDatos];
        
        for(int i=0; i<numeroDatos; i++){
            
            System.out.println("Producto "+(i+1)+":");
            do{
//                Aqui para ingresar solo letras se pone:
//                (nombre de la variable).matches("[a-zA-Z]+); Siempre ira el + o si no no saldra del ciclo

                System.out.println("ingresa el nombre del producto:");
            nombre = scanner.nextLine();
            
            if(nombre.matches("[a-zA-Z]+")){
                break;
            }else{
                System.out.println("Solo se permiten letras");
            }
            
            }while(true);
            
            do{
                
            System.out.println("ingresa la cantidad del producto:");
            cantidad = scanner.nextInt();
            
            if(cantidad <= 0 ){
                
                System.out.println("Ingresa bien la cantidad");
            }
            
            }while(cantidad <=0 );
            
            do{
                
            System.out.println("ingresa el precio unitario del producto:");
            precioUnitario = scanner.nextDouble();
            
             if(precioUnitario <= 0 ){
                
                System.out.println("Ingresa bien la cantidad");
            }
            
            }while(precioUnitario <=0);
            
            do{
                
            System.out.println("ingresa la categoria:");
            System.out.println("1 si es Hardware"); 
            System.out.println("2 si es software");
            System.out.println("3 si es Periferico");
            categoria = scanner.nextInt();
            
            if(categoria != 1 && categoria !=2 && categoria != 3){
                
                System.out.println("Solo debes poner los numero de las categorias mostradas");
            }
            }while(categoria != 1 && categoria !=2 && categoria != 3);
            scanner.nextLine();
            
            producto[i] = new categoria(nombre,cantidad,precioUnitario,categoria);
            
        }
        
        double precioTotalUnitario = 0;
        double precioFactura = 0;
        
        System.out.println("Factura");
        System.out.println("Producto| categoria| cantidad | precio unitario| total");
        for(Import_categoria precio : producto){
            
            precioTotalUnitario = precio.calcularPrecio();
            precioFactura += precioTotalUnitario;
            
            if(precio.getCategoria() == 1){
                System.out.printf("%-10s| %-10s| %-10d| %.2f| %.2f|\n",precio.getNombre(),"Hardware",precio.getCantidad(),precio.getPrecioUnitario(),precioTotalUnitario);
            }
             
            if(precio.getCategoria() == 2){
                System.out.printf("%-10s| %-10s| %-10d| %.2f| %.2f|\n",precio.getNombre(),"Software",precio.getCantidad(),precio.getPrecioUnitario(),precioTotalUnitario);
            }
            
            if(precio.getCategoria() == 3){
                System.out.printf("%-10s| %-10s| %-10d| %.2f| %.2f|\n",precio.getNombre(),"Periferico",precio.getCantidad(),precio.getPrecioUnitario(),precioTotalUnitario);
            }
            
        }
        
//        Aqui si quieres que solo imprima 2 digitos decimales debes poner
//        %.2f%n 
        System.out.printf("El total de la factura es: %.2f%n",precioFactura);
        
    }
    
    
    
}
