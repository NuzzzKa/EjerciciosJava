package ejercicio2_3_4;
import java.util.Scanner;
public class Ejercicio2_3_4 
{
    public static void main(String[] args) 
    {
        Scanner entrada=new Scanner(System.in);
        int horas;
        
        
        System.out.println("Introduce cuantas horas has trabajado esta semana: ");
        horas=entrada.nextInt();
        System.out.println("Lo que vas a cobrar esta semana es: " + horas * 12 + " Euros");
    }
}