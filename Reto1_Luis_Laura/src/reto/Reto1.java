package reto;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opciones = 0;

         

        do {

            System.out.println("\nElige la opcion:"
                    + "\n1. Sumar"
                    + "\n2. Restar"
                    + "\n3. Multiplicar"
                    + "\n4. Dividir"
                    + "\n5. Es Par"
                    + "\n6. Es Impar"
                    + "\n7. Es Positivo"
                    + "\n8. Es Negativo"
                    + "\n0. Salir...");

            opciones = Funciones.dimeEntero("\nElige opción:", sc);

            int a, b;

            switch (opciones) {

                case 1:
                    a = Funciones.dimeEntero("Número 1:", sc);
                    b = Funciones.dimeEntero("Número 2:", sc);
                    System.out.println("Resultado: " + funciones1.sumar(a, b));
                    break;

                case 2:
                    a = Funciones.dimeEntero("Número 1:", sc);
                    b = Funciones.dimeEntero("Número 2:", sc);
                    System.out.println("Resultado: " + funciones1.restar(a, b));
                    break;

                case 3:
                    a = Funciones.dimeEntero("Número 1:", sc);
                    b = Funciones.dimeEntero("Número 2:", sc);
                    System.out.println("Resultado: " + funciones2.multiplicar(a, b));
                    break;

                case 4:
                    a = Funciones.dimeEntero("Número 1:", sc);
                    b = Funciones.dimeEntero("Número 2:", sc);
                    System.out.println(funciones2.dividir(a, b));
                    break;

                case 5:
                    a = Funciones.dimeEntero("Introduce número:", sc);
                    System.out.println("Es par: " + funciones1.espar(a));
                    break;

                case 6:
                    a = Funciones.dimeEntero("Introduce número:", sc);
                    System.out.println("Es impar: " + funciones1.esimpar(a));
                    break;

                case 7:
                    a = Funciones.dimeEntero("Introduce número:", sc);
                    System.out.println("Es positivo: " + funciones2.positivo(a));
                    break;

                case 8:
                    a = Funciones.dimeEntero("Introduce número:", sc);
                    System.out.println("Es negativo: " + funciones2.negativo(a));
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opciones != 0);

        sc.close();
    }
}
