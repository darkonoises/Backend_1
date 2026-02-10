
package backend_1;

import java.util.Locale;
import java.util.Scanner;


public class Backend_1 {

  
    public static void main(String[] args) {
        
           
    Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Hola Estudiante");
        System.out.println("Dime cual es tu nota: ");
        
        float number = entrada.nextFloat();
        
        if (number >= 3.0){System.out.println("Felicidades, Aprobaste");}
        else {System.out.println("Lo siento, no aprobaste. Sigue intentandolo");}
    
    entrada.close();
    
    
    
    
    
    
    
    }
    
}
