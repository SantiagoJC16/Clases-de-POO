package clases_abstractas;


public class Producto extends ItemFactura{

//    Constructor
    public Producto(String nombre, int cantidad, double precioUnitario){
        super(nombre,cantidad,precioUnitario);
          
    }
//    Llamar al metodod de la clase abstracta
    @Override
    public double calcularPrecioTotal(){
        return cantidad * precioUnitario;
    }
    
}
