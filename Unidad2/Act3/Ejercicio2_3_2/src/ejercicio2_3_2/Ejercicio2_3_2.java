package ejercicio2_3_2;
import java.util.Scanner;
public class Ejercicio2_3_2 
{
    public static void main(String[] args) 
    {
        Scanner entrada=new Scanner(System.in);
        double numero1;
        double numero2;
        
        System.out.println("Introduce el primer numero: ");
        numero1=entrada.nextDouble();
        
        entrada.nextLine();
        
        System.out.printf("Introduce el segundo numero: ");
        numero2=entrada.nextDouble();
        System.out.printf("El total de sumar el primer numero por el primero es: %.1f%n", numero1 + numero2);
        System.out.printf("El total de restar el primer numero por el primero es: %.1f%n", numero1 - numero2);
        System.out.printf("El total de multiplicar el primer numero por el primero es: %.1f%n", numero1 * numero2);
        System.out.println("El total de dividir el primer numero por el primero es: " + numero1 / numero2);

    }
}