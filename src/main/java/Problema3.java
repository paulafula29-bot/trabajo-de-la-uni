import java.util.Scanner;

abstract class Cuenta {
    protected String nombre;
    protected double saldo;

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public abstract void depositar(double monto);
    public abstract void retirar(double monto);

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
}

// 🔵 CUENTA AHORRO
class CuentaAhorro extends Cuenta {

    public CuentaAhorro(String nombre, double saldo) {
        super(nombre, saldo);
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        saldo -= monto;
    }
}

// 🔴 CUENTA CORRIENTE
class CuentaCorriente extends Cuenta {

    public CuentaCorriente(String nombre, double saldo) {
        super(nombre, saldo);
    }

    @Override
    public void depositar(double monto) {
        saldo += monto - 5000; // comisión
    }

    @Override
    public void retirar(double monto) {
        saldo -= monto;
    }
}

// 🟢 MAIN
public class Problema3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== BANCO ===");

        System.out.println("Ingrese nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese saldo inicial:");
        double saldo = sc.nextDouble();

        System.out.println("Tipo de cuenta (1.Ahorro 2.Corriente):");
        int tipo = sc.nextInt();

        Cuenta cuenta;

        if (tipo == 1) {
            cuenta = new CuentaAhorro(nombre, saldo);
        } else {
            cuenta = new CuentaCorriente(nombre, saldo);
        }

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver saldo");
            System.out.println("4. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Monto a depositar:");
                    double dep = sc.nextDouble();
                    cuenta.depositar(dep);
                    break;

                case 2:
                    System.out.println("Monto a retirar:");
                    double ret = sc.nextDouble();
                    cuenta.retirar(ret);
                    break;

                case 3:
                    cuenta.mostrarSaldo();
                    break;
            }

        } while (opcion != 4);

        System.out.println("Gracias por usar el banco");
    }
}
