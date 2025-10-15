
package ejercicio2_3_6;
import java.util.Scanner;

public class Ejercicio2_3_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad en stock: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce el nombre del producto: ");
        String producto = sc.nextLine();
        System.out.print("Introduce el precio unitario: ");
        double precio = sc.nextDouble();
        double total = cantidad * precio;
        System.out.println("Producto: " + producto + " - Cantidad: " + cantidad + " - Precio unitario: " + precio + " Euros - Precio total: " + total + " Euros");    }
    
}
