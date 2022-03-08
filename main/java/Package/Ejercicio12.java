package Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio12 {
    /*
        12. Pedir dos palabras por teclado, indicar si son
        iguales, sino son iguales mostrar sus diferencias.
    */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la primer palabra");
        String word1 = read.nextLine();
        System.out.println("Ingrese la segunda palabra");
        String word2 = read.nextLine();

        List<Character> characters = new ArrayList<>();


        if(word1.equals(word2)){
            System.out.println("Las dos palabras son iguales");
        }else{
            System.out.println("Las dos palabras son dierentes");
        }

        if(word1.length() < word2.length()){
            for (int i = 0; i < word1.length(); i++){
                if (word1.charAt(i) != word2.charAt(i)){
                    characters.add(word1.charAt(i));
                }
            }
        }else if(word1.length() > word2.length()){
            for (int i = 0; i < word2.length(); i++){
                if (word1.charAt(i)!= word2.charAt(i)){
                    characters.add(word2.charAt(i));
                }
            }
        }else if (word1.length()== word2.length()){
            for (int i = 0; i < word1.length(); i++){
                if (word1.charAt(i) != word2.charAt(i)){
                    characters.add(word2.charAt(i));
                }
            }
        }
        System.out.println("Son diferentes en los characters "+ characters);

    }
}