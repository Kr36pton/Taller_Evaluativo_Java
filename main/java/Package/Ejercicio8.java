package Package;

import java.util.Scanner;

public class Ejercicio8 {
    /*
    8. Crea una aplicación por consola que nos pida un día de la semana y
    que nos diga si es un día laboral o no. Usa un switch para ello.
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana");
        String inputDay = read.nextLine();
        inputDay = inputDay.toUpperCase();

        switch (inputDay){
            case "LUNES":
                System.out.println("Es un día laboral");
                break;
            case "MARTES":
                System.out.println("Es un día laboral");
                break;
            case "MIERCOLES":
                System.out.println("Es un día laboral");
                break;
            case "JUEVES":
                    System.out.println("Es un día laboral");
                    break;
            case "VIERNES":
                System.out.println("No es un día laboral");
                break;
            case "SABADO":
                System.out.println("No es un día laboral");
                break;
            case "DOMINGO":
                System.out.println("No es un día laboral");
                break;
            default:
                System.out.println("Día inexistente");
        }
    }
}
