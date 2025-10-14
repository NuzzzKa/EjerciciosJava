
package ejercicio2_2_11;


public class Ejercicio2_2_11 {

    public static void main(String[] args) {
       String nombre = "Ana";
        String ape1 = "Torres";
        String ape2 = "Barros";

        nombre = nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase();
        ape1 = ape1.substring(0,1).toUpperCase() + ape1.substring(1).toLowerCase();
        ape2 = ape2.substring(0,1).toUpperCase() + ape2.substring(1).toLowerCase();

        boolean apta = 
            Character.toLowerCase(nombre.charAt(0)) == Character.toLowerCase(nombre.charAt(nombre.length()-1))
            && ape1.length() == ape2.length();

        System.out.println(nombre + " " + ape1 + " " + ape2);
        System.out.println(apta ? "Persona APTA para el concurso" : "Persona NO APTA para el concurso");   
    }
    
}
