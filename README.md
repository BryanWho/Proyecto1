TÉCNICAS DE PROGRAMACIÓN 1

PROYECTO 1

Objetivo:
Evaluar las habilidades adquiridas en el manejo de sentencias de control en el lenguaje JAVA, particularmente condicionales y ciclos.

Descripción:

Desarrollar un programa en JAVA que permita gestionar una cuenta bancaria.
El programa debe contar con el siguiente menú 
Generar Cheque.
Retirar Dinero
Salir

Descripción de las operaciones


Generar Cheque:
Cuando el usuario seleccione esta opción, el programa pedirá un valor entero positivo que no superará el valor de 999.999.

Posteriormente el programa debe imprimir el siguiente cheque

*******************************************************************
		BANCO KONRAD LORENZ
CUENTA No:  123.345.678.900
CLIENTE: [NOMBRE DEL ESTUDIANTE]
VALOR EN NÚMERO: [VALOR INGRESADO POR EL USUARIO PREVIAMENTE]
VALOR EN LETRAS:
SE DEBE PASAR EL VALOR NUMÉRICO A LETRAS
*******************************************************************



EJEMPLO:
Suponiendo que el usuario ha digitado el valor 120.510, se debe generar el siguiente cheque


*******************************************************************
		BANCO KONRAD LORENZ
CUENTA No:  123.345.678.900
CLIENTE: JAVIER ANDRES AVILA SALCEDO
VALOR EN NÚMERO: 120.510
VALOR EN LETRAS:
CIENTO VEINTE  MIL QUINIENTOS DIEZ MIL PESOS
*******************************************************************


Retirar Dinero:

El programa pedirá un valor entero positivo al usuario que no debe superar el valor 999.990 y será múltiplo de 10. El programa debe indicar la cantidad de billetes y monedas a entregar, se debe tener en cuenta que el cajero sólo contará con las siguientes denominaciones de billetes y monedas.
50.000, 20.000, 10.000, 5.000, 2.000, 1.000, 500, 200, 100, 50, 20, 10.

Las nominaciones inferiores o iguales a 500 son monedas, los demás son billetes.

Ejemplo:
El usuario va a retirar 540.230 pesos.
El programa debe arrojar el siguiente resultado

10 billetes de $50.000
2 billetes de $20.000
1 moneda de $200
1 moneda de $20
1 moneda de $10

Salir:

Permite finalizar el programa
