
package ejercicio2_3_5;
import java.util.Scanner;

public class Ejercicio2_3_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la nota del primer examen: ");
        double nota1 = sc.nextDouble();
        System.out.print("Que nota quiere sacar en el trimestre? ");
        double mediaDeseada = sc.nextDouble();
        double nota2 = (mediaDeseada - nota1 * 0.4) / 0.6;
        System.out.println("Para tener un " + mediaDeseada + " en el trimestre necesita sacar un " + nota2 + " en el segundo examen.");    }
    
}
