package Package;

import java.util.Scanner;

public class Ejercicio14 {
    //14. Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num =  read.nextInt();

        for (int i = num; i < 1000; i++ ){
            System.out.println(i);
            i = i + 1;
        }
    }
}
