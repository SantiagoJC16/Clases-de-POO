
package modularidad;
import autenticacion.Autenticacion;
import usuarios.Usuarios;

public class Main {
    public static void main(String[] args){
        // Crear el usuario
        Usuarios usuario = new Usuarios("Santiago", "sxchafla@espe.edu.ec");
        
        //Crear un objeto de autentificacion
        Autenticacion autenticacion = new Autenticacion();
        
        //Autenticar al usuario
        if(autenticacion.autenticarUsuario(usuario, "contraseñaSecreta")){
            System.out.println("Usuario autenticado correctamente");
        }else{
            System.out.println("Error de autenticacion");
        }
        
        
    }
}
