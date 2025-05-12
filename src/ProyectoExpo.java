public class ProyectoExpo {
    public static void main(String[] args){ 
      File archivo = new File("cuento.txt");
 /*Aquí solo le decimos a Java:
“Este es el archivo que quiero abrir”.*/
      Scanner lector = new Scanner(archivo); // ← Aquí ocurre el problema.
 /*Aquí Java intenta abrir realmente el archivo.
Pero… ¿qué pasa si ese archivo no existe?
Java no puede continuar porque no tiene el archivo que le pedimos.
Entonces, lanza una excepción:
FileNotFoundException (¡Archivo no encontrado!)*/
        
        //¿COMO SE ARREGLA?
        
         /*Capturar el error con try-catch (es como ponerle casco a Java)*/
         /*Dentro del bloque try, intentamos ejecutar el código que podría causar un 
                 error (en este caso, al intentar abrir el archivo con new File("cuento.txt") y al crear el Scanner para leerlo):*/
         try {
            // Intentamos abrir el archivo llamado "cuento.txt"
            /*Aquí, si el archivo no se encuentra (es decir, si "cuento.txt" 
            no existe en la ubicación especificada), Java lanza automáticamente una excepción FileNotFoundException.*/
            File archivo = new File("cuento.txt");
            Scanner lector = new Scanner(archivo);

            System.out.println("Contenido del archivo:");
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }

            lector.close(); // Cerramos el lector
            /*Si ocurre una excepción (por ejemplo, el archivo no existe), el flujo de ejecución 
                    salta al bloque catch, donde manejamos el error:*/

        } catch (FileNotFoundException e) {
            // Si el archivo no existe, mostramos un mensaje de error
            System.out.println("¡Ups! No pude encontrar el archivo 'cuento.txt'.");
        }
    }
}




    

