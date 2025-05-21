package practicaarchivotxt;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    public void ArchivoCreate() throws IOException{
        FileWriter texto = new FileWriter("C:/Users/User/Desktop/archivos java/ArchivoPractica.txt");
        for(int i=0;i<10;i++){
            texto.write("Hola Socio"+i+" ");
        }
        texto.close();
    } 
    
}
