package ejercicio2_2_4;

public class Ejercicio2_2_4 {
    public static void main(String[] args) {
        double base = 0;
        double iva = 0;
        double total = 0;

        base = 22.75;
        iva = base * 0.21;
        total = base + iva;

        System.out.println("Base imponible: " + base + " Euros");
        System.out.println("IVA: " + String.format("%.2f", iva) + " Euros");
        System.out.println("-------------");
        System.out.println("Total: " + String.format("%.2f", total) + " Euros");
    }
}

