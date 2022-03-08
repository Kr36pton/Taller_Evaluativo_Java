package Package;

import java.util.Scanner;

public class Ejercicio1_2 {
    /*
     1. Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
        Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
     2. Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.
    */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer número");
        int num1 = read.nextInt();
        System.out.println("Ingrese el valor del segundo número");
        int num2 = read.nextInt();

        if (num1>num2){
            System.out.println("EL número mayor es: "+num1);
        }else if (num1<num2){
            System.out.println("El número mayor es:"+num2);
        }else{
            System.out.println("Los números son iguales");
        }

    }
}



