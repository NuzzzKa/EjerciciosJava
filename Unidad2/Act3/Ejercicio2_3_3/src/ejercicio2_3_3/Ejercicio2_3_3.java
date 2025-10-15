package ejercicio2_3_3;
import java.util.Scanner;
public class Ejercicio2_3_3 
{
    public static void main(String[] args) 
    {
        Scanner entrada=new Scanner(System.in);
        double base = 0;
        double iva = 0;
        double total = 0;

        System.out.println("Introduce el primer numero: ");
        base=entrada.nextDouble();
        
        iva = base * 0.21;
        total = base + iva;

        System.out.println("Base imponible: " + base + " Euros");
        System.out.printf("IVA: %.2f%n", iva,  " Euros");
        System.out.println("-------------");
        System.out.printf("Total: %.2f%n", total,  " Euros");
    }
}