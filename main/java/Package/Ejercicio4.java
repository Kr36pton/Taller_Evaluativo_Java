package Package;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    4. Lee un número por teclado que pida el precio de un producto (puede tener decimales)
    y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
    */
    public static void main(String[] args) {

        final double IVA = 0.21;
        double endPrice;
        double ivaValue;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double ingresoPrecioProducto = leer.nextDouble();

        ivaValue = ingresoPrecioProducto * IVA;
        endPrice = ivaValue + ingresoPrecioProducto;
        System.out.println("El precio del producto con IVA es:" +endPrice);

    }
}
