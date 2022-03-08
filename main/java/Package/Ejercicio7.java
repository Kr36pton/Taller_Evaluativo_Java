package Package;

import java.util.Scanner;

public class Ejercicio7 {
    /*
    7. Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
    si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
    */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int inputNumber;
        do {
            System.out.println("Ingrese el número a comparar");
            inputNumber = leer.nextInt();
        } while (inputNumber != 0 || inputNumber >0);

        System.out.println("El número ingresado es: "+ inputNumber);

    }
}
