package Package;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {
    //13. Algoritmo que permite consultar la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La fecha y hora son "+ dtf.format(LocalDateTime.now()));

    }
}
