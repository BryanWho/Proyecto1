public class Chequera {

    public void generarCheque(int valor, String nombre) {

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
                System.out.print("QUINCE MIL ");
            }
            if (decenasMil == 1 && unidadesMil == 4) {
                System.out.print("CATORCE MIL ");
            }
            if (decenasMil == 1 && unidadesMil == 3) {
                System.out.print("TRECE MIL ");
            }
            if (decenasMil == 1 && unidadesMil == 2) {
                System.out.print("DOCE MIL ");
            }
            if (decenasMil == 1 && unidadesMil == 1) {
                System.out.print("ONCE MIL ");
            }
            if (decenasMil == 1 && unidadesMil == 0) {
                System.out.println("DIEZ MIL ");
            }
            if (decenasMil == 2 && unidadesMil != 0) {
                System.out.print("VEINTI");
            }
            if (decenasMil == 2 && unidadesMil == 0) {
                System.out.print("VEINTE MIL ");
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
                if (decenas != 2 && decenas != 0) {
                    System.out.print("Y ");
                }
                if (centenasMil == 0 && decenasMil == 0 && unidadesMil == 0 && centenas == 0 && decenas == 0 && unidades == 1) {
                    System.out.print("UN ");
                } else {
                    System.out.print("UNO ");
                }
            }
            if (unidades == 2 && decenas != 1) {
                if (decenas != 2 && decenas != 0) {
                    System.out.print("Y ");
                }
                System.out.print("DOS ");
            }
            if (unidades == 3 && decenas != 1) {
                if (decenas != 2 && decenas != 0) {
                    System.out.print("Y ");
                }
                System.out.print("TRES ");
            }
            if (unidades == 4 && decenas != 1) {
                if (decenas != 2 && decenas != 0) {
                    System.out.print("Y ");
                }
                System.out.print("CUATRO ");
            }
            if (unidades == 5 && decenas != 1) {
                if (decenas != 2 && decenas != 0) {
                    System.out.print("Y ");
                }
                System.out.print("CINCO ");
            }
            if (unidades == 6) {
                if (decenas != 2 && decenas != 0) {
                    System.out.print("Y ");
                }
                System.out.print("SEIS ");
            }
            if (unidades == 7) {
                if (decenas != 2 && decenas != 0) {
                    System.out.print("Y ");
                }
                System.out.print("SIETE ");
            }
            if (unidades == 8) {
                if (decenas != 2 && decenas != 0) {
                    System.out.print("Y ");
                }
                System.out.print("OCHO ");
            }
            if (unidades == 9) {
                if (decenas != 2 && decenas != 0) {
                    System.out.print("Y ");
                }
                System.out.print("NUEVE ");
            }
        }
        if (centenasMil == 0 && decenasMil == 0 && unidadesMil == 0 && centenas == 0 && decenas == 0 && unidades == 1) {
            System.out.println("PESO.");
        } else {
            System.out.println("PESOS.");
        }
        System.out.println("*************************************************");
    }

    public void retirarDinero(int dinero) {
        int dineroOriginal = dinero;
        int billetesCincuenta = 0;
        int billetesVeinte = 0;
        int billetesDiez = 0;
        int billetesCinco = 0;
        int billetesDos = 0;
        int billetesMil = 0;
        int monedasQuinientos = 0;
        int monedasDocientos = 0;
        int monedasCien = 0;
        int monedasCincuenta = 0;
        int monedasVeinte = 0;
        int monedasDiez = 0;

        billetesCincuenta = (dinero / 50000);
        dinero = dinero - (billetesCincuenta * 50000);
        billetesVeinte = (dinero / 20000);
        dinero = dinero - (billetesVeinte * 20000);
        billetesDiez = (dinero / 10000);
        dinero = dinero - (billetesDiez * 10000);
        billetesCinco = (dinero / 5000);
        dinero = dinero - (billetesCinco * 5000);
        billetesDos = (dinero / 2000);
        dinero = dinero - (billetesDos * 2000);
        billetesMil = (dinero / 1000);
        dinero = dinero - (billetesMil * 1000);
        monedasQuinientos = (dinero / 500);
        dinero = dinero - (monedasQuinientos * 500);
        monedasDocientos = (dinero / 200);
        dinero = dinero - (monedasDocientos * 200);
        monedasCien = (dinero / 100);
        dinero = dinero - (monedasCien * 100);
        monedasCincuenta = (dinero / 50);
        dinero = dinero - (monedasCincuenta * 50);
        monedasVeinte = (dinero / 20);
        dinero = dinero - (monedasVeinte * 20);
        monedasDiez = (dinero / 10);
        System.out.println("El usuario va a retirar $" + dineroOriginal + " pesos.");
        if (billetesCincuenta != 0) {
            if (billetesCincuenta == 1) {
                System.out.println(billetesCincuenta + " billete de $50.000");
            } else {
                System.out.println(billetesCincuenta + " billetes de $50.000");
            }

        }
        if (billetesVeinte != 0) {
            if (billetesVeinte == 1) {
                System.out.println(billetesVeinte + " billete de $20.000");
            } else {
                System.out.println(billetesVeinte + " billetes de $20.000");
            }

        }
        if (billetesDiez != 0) {
            if (billetesDiez == 1) {
                System.out.println(billetesDiez + " billete de $10.000");
            } else {
                System.out.println(billetesDiez + " billetes de $10.000");
            }

        }
        if (billetesCinco != 0) {
            if (billetesCinco == 1) {
                System.out.println(billetesCinco + " billete de $5.000");
            } else {
                System.out.println(billetesCinco + " billetes de $5.000");
            }

        }
        if (billetesDos != 0) {
            if (billetesDos == 1) {
                System.out.println(billetesDos + " billete de $2.000");
            } else {
                System.out.println(billetesDos + " billetes de $2.000");
            }

        }
        if (billetesMil != 0) {
            if (billetesMil == 1) {
                System.out.println(billetesMil + " billete de $1.000");
            } else {
                System.out.println(billetesMil + " billetes de $1.000");
            }

        }
        if (monedasQuinientos != 0) {
            if (monedasQuinientos == 1) {
                System.out.println(monedasQuinientos + " moneda de $500");
            } else {
                System.out.println(monedasQuinientos + " monedas de $500");
            }

        }
        if (monedasDocientos != 0) {
            if (monedasDocientos == 1) {
                System.out.println(monedasDocientos + " moneda de $200");
            } else {
                System.out.println(monedasDocientos + " monedas de $200");
            }

        }
        if (monedasCien != 0) {
            if (monedasCien == 1) {
                System.out.println(monedasCien + " moneda de $100");
            } else {
                System.out.println(monedasCien + " monedas de $100");
            }

        }
        if (monedasCincuenta != 0) {
            if (monedasCincuenta == 1) {
                System.out.println(monedasCincuenta + " moneda de $50");
            } else {
                System.out.println(monedasCincuenta + " monedas de $50");
            }

        }
        if (monedasVeinte != 0) {
            if (monedasVeinte == 1) {
                System.out.println(monedasVeinte + " moneda de $20");
            } else {
                System.out.println(monedasVeinte + " monedas de $20");
            }

        }
        if (monedasDiez != 0) {
            if (monedasDiez == 1) {
                System.out.println(monedasDiez + " moneda de $10");
            } else {
                System.out.println(monedasDiez + " monedas de $10");
            }

        }

    }
}
