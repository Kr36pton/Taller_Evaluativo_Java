package Package;

public class Ejercicio9 {
    /*
        9. Del texto, “La sonrisa sera la mejor arma contra la tristeza”
        Reemplaza todas las a del String anterior por una e, adicionalmente
        concatenar a esta frase una adicional que ustedes quieran incluir por
        consola y las muestre luego unidas.
    */
    public static void main(String[] args) {

        String starterText = "La sonrisa sera la mejor arma contra la tristeza";
        String endText = starterText.replaceAll("a", "e");
        endText = endText.concat(", se sonriente y mantente feliz");
        System.out.println(endText);
    }
}
