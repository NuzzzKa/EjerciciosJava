
package ejercicio2_2_10;


public class Ejercicio2_2_10 {


    public static void main(String[] args) {
        int numero = 100; 

        int esCero = (numero == 0) ? 1 : 0;
        int esPositivo = (numero > 0) ? 1 : 0;
        int esMenorQueCien = (numero < 100) ? 1 : 0;
        int esPar = (numero % 2 == 0) ? 1 : 0;

        System.out.println("ANALISIS DE UN NUMERO");
        System.out.println("--------------------");
        System.out.println("un numero entero: " + numero);
        System.out.println("\nRESULTADO");
        System.out.println("---------");
        System.out.println("El numero es cero: " + (esCero == 1));
        System.out.println("El numero es positivo: " + (esPositivo == 1));
        System.out.println("El numero es menor que 100: " + (esMenorQueCien == 1));
        System.out.println("El numero es par: " + (esPar == 1));
    }
    
}
