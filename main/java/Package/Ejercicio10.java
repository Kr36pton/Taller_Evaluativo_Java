package Package;

import java.util.Scanner;

public class Ejercicio10 {
    /*
        10. Realizar una aplicación de consola, que al ingresar una
        frase por teclado elimine los espacios que esta contenga.
    */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la frase a eliminar espacios");
        String inputText = read.nextLine();

        System.out.println(inputText.replace(" ", ""));



    }
}
