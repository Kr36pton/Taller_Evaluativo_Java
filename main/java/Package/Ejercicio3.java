package Package;

import javax.swing.*;

public class Ejercicio3 {
    /*
    3. Haz una aplicación que calcule el área de un círculo(pi*R2).
    El radio se pedirá por teclado (recuerda pasar de String a double
    con Double.parseDouble). Usa la constante PI y el método pow de Math.
    */
    public static void main(String[] args) {
        String radiusInput;
        double radius;
        double circleArea;


        radiusInput = JOptionPane.showInputDialog("Ingrese el radio del circulo");
        radius  = Double.parseDouble(radiusInput);

        circleArea = Math.PI*Math.pow(radius,2);

        JOptionPane.showMessageDialog(null,"El area del circulo es: "+circleArea);

    }
}
