import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        Chequera cheque = new Chequera();

        while (!salir) {
            System.out.println("******************");
            System.out.println("    BIENVENIDO");
            System.out.println("******************");

            System.out.println("1. Generar Cheque");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Salir");

            System.out.println("Digite una opción");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int valorcheque;
                    String nombre;
                    System.out.print("Por favor ingrese su nombre: ");
                    nombre = sc.nextLine();
                    nombre = sc.nextLine();
                    System.out.println(" ");
                    System.out
                            .println("Por favor ingrese un valor entero positivo que no supere el valor de $ 999.999");
                    System.out.print("$ ");
                    valorcheque = sc.nextInt();

                    while (valorcheque <= 0 || valorcheque >= 1000000) {
                        System.out.println("DIGITE UN VALOR ENTERO POSITIVO MAYOR QUE CERO Y MENOR QUE 1'000.000");
                        valorcheque = sc.nextInt();
                    }
                    cheque.generarCheque(valorcheque, nombre);
                    break;

                case 2:
                    int dinero = 0;
                    System.out.println("¿Cuánto dinero desea retirar");
                    dinero = sc.nextInt();
                    while (dinero % 10 != 0 || dinero > 999990) {
                        System.out.println("Solo se puede retirar múltiplos de 10 que sean menores a $999.990");
                        dinero = sc.nextInt();

                    }
                    cheque.retirarDinero(dinero);
                    break;

                case 3:
                    salir = true;
                    break;

                default:
                    System.out.println("Solo números entre 1 y 3");
            }
        }
        sc.close();
    }
}