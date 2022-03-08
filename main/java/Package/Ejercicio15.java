package Package;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int option;
        do {
            System.out.println("GESTIÓN CINEMATOGRAFICA");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");

            System.out.println("Ingrese la option:");
            option = leer.nextInt();
            switch (option){
                case 1:
                    System.out.println("Aquí ves el nuevo actor");
                    break;
                case 2:
                    System.out.println("Aquí buscas el actor");
                    break;
                case 3:
                    System.out.println("Aquí eliminas el actor");
                    break;
                case 4:
                    System.out.println("Aquí modificas el actor");
                    break;
                case 5:
                    System.out.println("Aquí ves todos los actores");
                    break;
                case 6:
                    System.out.println("Aquí Ves las categorias de películas y actores");
                    break;
                case 8:
                    break;
                default:
                    System.out.println("OPCIÓN INCORRECTA");
            }
        } while (option != 8);

        System.out.println("Has salido del menú");
    }
}
