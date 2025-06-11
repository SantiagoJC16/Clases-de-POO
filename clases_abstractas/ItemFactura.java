
package clases_abstractas;


abstract public class ItemFactura {
    
    protected String nombre;
    protected int cantidad;
    protected double precioUnitario;

//    Constructor
    public ItemFactura(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
    
//    Metodos (un metodos abstracto no se puede instanciar desde el metodo main)
//    Por eso no se utiliza set en una clase abstracta, se utiliza get

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
    
//    Metodos para calcular el precio total
    public abstract double calcularPrecioTotal();
    
    
    
    
    
    
    
}
