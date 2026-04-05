import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== PROGRAMA DE MATRÍCULA ===");

        System.out.println("Ingrese nombres:");
        String nombres = sc.nextLine();

        System.out.println("Ingrese apellidos:");
        String apellidos = sc.nextLine();

        System.out.println("Ingrese documento:");
        String documento = sc.nextLine();

        System.out.println("Ingrese dirección:");
        String direccion = sc.nextLine();

        System.out.println("Ingrese teléfono:");
        String telefono = sc.nextLine();

        System.out.println("¿El curso es en línea? (true/false):");
        boolean enLinea = sc.nextBoolean();

        System.out.println("Ingrese semestre:");
        int semestre = sc.nextInt();

        System.out.println("Ingrese número de créditos:");
        int creditos = sc.nextInt();

        double total = 0;

        if (enLinea) {
            total = 1500;

            if (semestre >= 5) {
                total = total + (total * 0.05);
            }

        } else {

            int valorCredito;

            if (semestre <= 3) {
                valorCredito = 20;
            } else if (semestre <= 6) {
                valorCredito = 25;
            } else {
                valorCredito = 30;
            }

            total = creditos * valorCredito;
        }

        System.out.println("\n--- RECIBO DE MATRÍCULA ---");
        System.out.println("Nombre: " + nombres + " " + apellidos);
        System.out.println("Documento: " + documento);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Total a pagar: $" + total);

    }
}