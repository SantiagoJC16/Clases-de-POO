
package correcion;


abstract public class Import_categoria {
    
    protected String nombre;
    protected int cantidad;
    protected double precioUnitario;
    protected int categoria;

    public Import_categoria(String nombre, int cantidad, double precioUnitario, int categoria) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCategoria() {
        return categoria;
    }
    
    abstract public double calcularPrecio();
    
}
