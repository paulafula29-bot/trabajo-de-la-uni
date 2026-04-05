import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== ALQUILER DE AMARRE ===");

        // Datos del cliente
        System.out.println("Ingrese nombre del cliente:");
        String nombre = sc.nextLine();

        // Datos del barco
        System.out.println("Ingrese matrícula del barco:");
        String matricula = sc.nextLine();

        System.out.println("Ingrese eslora (metros):");
        double eslora = sc.nextDouble();

        System.out.println("Ingrese año de fabricación:");
        int anio = sc.nextInt();

        System.out.println("Ingrese número de días de alquiler:");
        int dias = sc.nextInt();

        // Cálculo
        double precioDia = 25000;
        double subtotal = dias * precioDia;
        double impuesto = subtotal * 0.19;
        double total = subtotal + impuesto;

        // Recibo
        System.out.println("\n--- RECIBO DE ALQUILER ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Eslora: " + eslora + " metros");
        System.out.println("Año: " + anio);
        System.out.println("Días: " + dias);
        System.out.println("Total a pagar: $" + total);

    }
}