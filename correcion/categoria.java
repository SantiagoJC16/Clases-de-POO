
package correcion;


public class categoria extends Import_categoria{
    
    double precioTotal;
    
    public categoria(String nombre, int cantidad, double precioUnitario, int categoria){
        super(nombre,cantidad,precioUnitario,categoria);
        
    }
    
    @Override
    public double calcularPrecio(){
        
        if(getCategoria() == 1){
            
            precioTotal = getCantidad() * getPrecioUnitario() * 1.12;
        }
        if(getCategoria() == 2){
            
            precioTotal = getCantidad() * getPrecioUnitario() * 1.05;
        }
        if(getCategoria() == 3){
            
            precioTotal = getCantidad() * getPrecioUnitario();
        }
        
        return precioTotal;
    }
}
