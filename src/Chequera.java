public class Chequera {

    void generarCheque(int valor, String nombre) {

        System.out.println("*************************************************");
        System.out.println("              BANCO KONRAD LORENZ");
        System.out.println("CUENTA No: 123.345.678.900");
        System.out.println("CLIENTE: " + nombre);
        System.out.println("VALOR EN NÚMERO: " + valor);
        int unidades = valor % 10;
        int decenas = (valor % 100) / 10;
        int centenas = (valor % 1000) / 100;
        int unidadesMil = (valor % 10000) / 1000;
        int decenasMil = (valor % 100000) / 10000;
        int centenasMil = (valor % 1000000) / 100000;
        if (centenasMil > 0) {
            if (centenasMil == 1) {
                System.out.print("CIENTO ");
            }
            if (centenasMil == 2) {
                System.out.print("DOCIENTOS ");
            }
            if (centenasMil == 3) {
                System.out.print("TRECIENTOS ");
            }
            if (centenasMil == 4) {
                System.out.print("CUATROCIENTOS ");
            }
            if (centenasMil == 5) {
                System.out.print("QUINIENTOS ");
            }
            if (centenasMil == 6) {
                System.out.print("SEISCIENTOS ");
            }
            if (centenasMil == 7) {
                System.out.print("SETECIENTOS ");
            }
            if (centenasMil == 8) {
                System.out.print("OCHOCIENTOS ");
            }
            if (centenasMil == 9) {
                System.out.print("NOVECIENTOS ");
            }
        }
        if (decenasMil > 0) {
            if (decenasMil == 1 && unidadesMil > 5) {
                System.out.print("DIECI");
            }
            if (decenasMil == 1 && unidadesMil == 5) {
                System.out.print("QUINCE ");
            }
            if (decenasMil == 1 && unidadesMil == 4) {
                System.out.print("CATORCE ");
            }
            if (decenasMil == 1 && unidadesMil == 3) {
                System.out.print("TRECE ");
            }
            if (decenasMil == 1 && unidadesMil == 2) {
                System.out.print("DOCE ");
            }
            if (decenasMil == 1 && unidadesMil == 1) {
                System.out.print("ONCE ");
            }
            if (decenasMil == 1 && unidadesMil == 0) {
                System.out.println("DIEZ ");
            }
            if (decenasMil == 2 && unidadesMil != 0) {
                System.out.print("VEINTI");
            }
            if (decenasMil == 2 && unidadesMil == 0) {
                System.out.print("VEINTE");
            }
            if (decenasMil == 3) {
                System.out.print("TREINTA ");
            }
            if (decenasMil == 4) {
                System.out.print("CUARENTA ");
            }
            if (decenasMil == 5) {
                System.out.print("CINCUENTA ");
            }
            if (decenasMil == 6) {
                System.out.print("SESENTA ");
            }
            if (decenasMil == 7) {
                System.out.print("SETENTA ");
            }
            if (decenasMil == 8) {
                System.out.print("OCHENTA ");
            }
            if (decenasMil == 9) {
                System.out.print("NOVENTA ");
            }
        }
        if (unidadesMil > 0) {
            if (unidadesMil == 1 && decenasMil != 1) {
                if (decenasMil != 2) {
                    System.out.print("Y ");
                }
                System.out.print("UN MIL ");
            }
            if (unidadesMil == 2 && decenasMil != 1) {
                if (decenasMil != 2) {
                    System.out.print("Y ");
                }
                System.out.print("DOS MIL");
            }
            if (unidadesMil == 3 && decenasMil != 1) {
                if (decenasMil != 2) {
                    System.out.print("Y ");
                }
                System.out.print("TRES MIL ");
            }
            if (unidadesMil == 4 && decenasMil != 1) {
                if (decenasMil != 2) {
                    System.out.print("Y ");
                }
                System.out.print("CUATRO MIL ");
            }
            if (unidadesMil == 5 && decenasMil != 1) {
                if (decenasMil != 2) {
                    System.out.print("Y ");
                }
                System.out.print("CINCO MIL ");
            }
            if (unidadesMil == 6) {
                if (decenasMil != 2) {
                    System.out.print("Y ");
                }
                System.out.print("SEIS MIL ");
            }
            if (unidadesMil == 7) {
                if (decenasMil != 2) {
                    System.out.print("Y ");
                }
                System.out.print("SIETE MIL ");
            }
            if (unidadesMil == 8) {
                if (decenasMil != 2) {
                    System.out.print("Y ");
                }
                System.out.print("OCHO MIL ");
            }
            if (unidadesMil == 9) {
                if (decenasMil != 2) {
                    System.out.print("Y ");
                }
                System.out.print("NUEVE MIL ");
            }
        }
        if (centenas > 0) {
            if (centenas == 1) {
                System.out.print("CIENTO ");
            }
            if (centenas == 2) {
                System.out.print("DOCIENTOS ");
            }
            if (centenas == 3) {
                System.out.print("TRECIENTOS ");
            }
            if (centenas == 4) {
                System.out.print("CUATROCIENTOS ");
            }
            if (centenas == 5) {
                System.out.print("QUINIENTOS ");
            }
            if (centenas == 6) {
                System.out.print("SEISCIENTOS ");
            }
            if (centenas == 7) {
                System.out.print("SETECIENTOS ");
            }
            if (centenas == 8) {
                System.out.print("OCHOCIENTOS ");
            }
            if (centenas == 9) {
                System.out.print("NOVECIENTOS ");
            }
        }
        if (decenas > 0) {
            if (decenas == 1 && unidades > 5) {
                System.out.print("DIECI");
            }
            if (decenas == 1 && unidades == 5) {
                System.out.print("QUINCE ");
            }
            if (decenas == 1 && unidades == 4) {
                System.out.print("CATORCE ");
            }
            if (decenas == 1 && unidades == 3) {
                System.out.print("TRECE ");
            }
            if (decenas == 1 && unidades == 2) {
                System.out.print("DOCE ");
            }
            if (decenas == 1 && unidades == 1) {
                System.out.print("ONCE ");
            }
            if (decenas == 1 && unidades == 0) {
                System.out.println("DIEZ ");
            }
            if (decenas == 2 && unidades != 0) {
                System.out.print("VEINTI");
            }
            if (decenas == 2 && unidades == 0) {
                System.out.print("VEINTE");
            }
            if (decenas == 3) {
                System.out.print("TREINTA ");
            }
            if (decenas == 4) {
                System.out.print("CUARENTA ");
            }
            if (decenas == 5) {
                System.out.print("CINCUENTA ");
            }
            if (decenas == 6) {
                System.out.print("SESENTA ");
            }
            if (decenas == 7) {
                System.out.print("SETENTA ");
            }
            if (decenas == 8) {
                System.out.print("OCHENTA ");
            }
            if (decenas == 9) {
                System.out.print("NOVENTA ");
            }
        }
        if (unidades > 0) {
            if (unidades == 1 && decenas != 1) {
                if (decenas != 2) {
                    System.out.print("Y ");
                }
                System.out.print("UNO ");
            }
            if (unidades == 2 && decenas != 1) {
                if (decenas != 2) {
                    System.out.print("Y ");
                }
                System.out.print("DOS ");
            }
            if (unidades == 3 && decenas != 1) {
                if (decenas != 2) {
                    System.out.print("Y ");
                }
                System.out.print("TRES ");
            }
            if (unidades == 4 && decenas != 1) {
                if (decenas != 2) {
                    System.out.print("Y ");
                }
                System.out.print("CUATRO ");
            }
            if (unidades == 5 && decenas != 1) {
                if (decenas != 2) {
                    System.out.print("Y ");
                }
                System.out.print("CINCO ");
            }
            if (unidades == 6) {
                if (decenas != 2) {
                    System.out.print("Y ");
                }
                System.out.print("SEIS ");
            }
            if (unidades == 7) {
                if (decenas != 2) {
                    System.out.print("Y ");
                }
                System.out.print("SIETE ");
            }
            if (unidades == 8) {
                if (decenas != 2) {
                    System.out.print("Y ");
                }
                System.out.print("OCHO ");
            }
            if (unidades == 9) {
                if (decenas != 2) {
                    System.out.print("Y ");
                }
                System.out.print("NUEVE ");
            }
        }
        System.out.println("PESOS.");
        System.out.println("*************************************************");
    }
}
