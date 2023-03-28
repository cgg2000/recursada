/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.  
 * 
 */
package ejercicio3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.length;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner frace = new Scanner(System.in);
      String fra;
      System.out.println("ingrese una frace");
      fra= frace.nextLine();
        System.out.println(fra);
        String framin = toLowerCase(fra);
        String fraMAY = toUpperCase(fra);
        System.out.println(framin);
        System.out.println(fraMAY);
        System.out.println("esta es la prueba para verficar GitHub");
                
        System.out.println("El tamaño de :"  + fra + " es de , (" + fra.length() + ")caracteres");
           

       


    }
    
}
