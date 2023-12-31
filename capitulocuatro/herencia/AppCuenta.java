package herencia;

import java.util.Scanner;

public class AppCuenta {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Cuenta de ahorros");
            System.out.println("Ingrese saldo inicial= $");
            float saldoInicialAhorros = input.nextFloat();
            System.out.print("Ingrese tasa de interés= ");
            float tasaAhorros = input.nextFloat();
            CuentaAhorro cuenta1 = new CuentaAhorro(saldoInicialAhorros, tasaAhorros);
            System.out.print("Ingresar cantidad a consignar: $");
            float cantidadDepositar = input.nextFloat();
            cuenta1.consignar(cantidadDepositar);
            System.out.print("Ingresar cantidad a retirar: $");
            float cantidadRetirar = input.nextFloat();
            cuenta1.retirar(cantidadRetirar);
            cuenta1.extractoMensual();
            cuenta1.imprimir();
        }
    }
}
