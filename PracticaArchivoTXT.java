
package practicaarchivotxt;
import java.io.FileWriter;
import java.io.IOException;

public class PracticaArchivoTXT {

    
    public static void main(String[] args) {
       Archivo archivo = new Archivo();
       try{
           archivo.ArchivoCreate();
       } catch (IOException e){
           System.out.println("El archivo no se pudo crear"+e);
         }
    }
    
}
