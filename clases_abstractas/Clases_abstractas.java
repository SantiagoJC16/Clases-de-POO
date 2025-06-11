package clases_abstractas;

import java.util.Scanner;

public class Clases_abstractas {

    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        ItemFactura[] productos = new ItemFactura[3];
//        Ingreso de datos
        for(int i=0; i<3; i++){
            System.out.println("Producto "+(i+1)+":");
            System.out.println("Nombre");
            String nombre = scanner.nextLine();
            System.out.println("cantidad");
            int cantidad = scanner.nextInt();
            System.out.println("Precio Unitario:");
            double precioUnitario = scanner.nextDouble();
            scanner.nextLine();
            productos[i] = new Producto(nombre,cantidad,precioUnitario);
        
        }
//        Mostrar factura
      
        double totalFactura = 0;
        System.out.println("\nFactura");
        System.out.println("-----------------------");
        System.out.println("Producto     |     Cantidad    |   Precio Unitario   |    Total    ");
        for(ItemFactura item : productos){
            double total = item.calcularPrecioTotal();
            totalFactura += total;
            System.out.printf("%-10s | %-10d | %15.2f | %13.2f\n",item.getNombre(),item.getCantidad(),item.getPrecioUnitario(),total);
            System.out.println("total de la factura: "+totalFactura);
            scanner.close();
            
        }
    }
    
}
