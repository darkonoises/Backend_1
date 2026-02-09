
package backend_1;


public class Backend_1 {

  
    public static void main(String[] args) {

        String nombre;
                String apellido;
                        int edad;
                        int fecha_nacimiento;
                        int edad2;

        boolean genero;

                nombre = ("Kevin");
                        apellido = ("Florec");
                        edad = (25);
                        genero = true;
                        fecha_nacimiento = (2026 - edad);
                        edad2 = (2026 - fecha_nacimiento);

                        for (int incremento = 1; incremento <= 10; incremento++){
                            System.out.println("Se incrementa " + incremento);
                        }
        System.out.println("El nombre es " + nombre + " el apellido es " + apellido + " la edad es " + edad);
        System.out.println("La fecha de nacimiento es " +fecha_nacimiento);
        System.out.println("La edad 2 es: " +edad2);
    
    
    
    
    }
    
}
