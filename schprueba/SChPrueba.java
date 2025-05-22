
package schprueba;


public class SChPrueba {

    public static void main(String[] args) {
       Empleado empleado = new Empleado();
       Ventas ventas = new Ventas();
       
       empleado.pedirDatos();
       ventas.calcularComision();
       empleado.mostrarDatos();
       ventas.MostrarDetalleVenta(empleado);
    }
    
}
