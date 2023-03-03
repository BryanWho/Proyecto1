import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************");
        System.out.println("    BIENVENIDO");
        System.out.println("******************");
        Chequera cheque = new Chequera();
        int valorcheque;
        String nombre;
        System.out.print("Por favor ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Por favor ingrese un valor entero positivo que no supere el valor de $ 999.999");
        System.out.print("$ ");
        valorcheque = sc.nextInt();
        while (valorcheque <= 0 || valorcheque >= 1000000) {
            System.out.println("DIGITE UN VALOR ENTERO POSITIVO MAYOR QUE CERO Y MENOR QUE 1'000.000");
            valorcheque = sc.nextInt();
        }
        cheque.generarCheque(valorcheque, nombre);
        sc.close();
    }
}