package Package;

import java.util.Scanner;

public class Ejercicio11 {
    /*
        11. Realizar la construcción de un algoritmo que
        permita de acuerdo a una frase pasada por consola,
        indicar cual es la longitud de esta frase, adicionalmente
        cuantas vocales tiene de “a,e,i,o,u”.
    */
    public static void main(String[] args) {

        int vowels = 0;
        int vowelA = 0;
        int vowelE = 0;
        int vowelI = 0;
        int vowelO = 0;
        int vowelU = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String input = read.nextLine();

        int sentenceLenght = input.length();
        System.out.println("La frase tiene una longitud de: "+ sentenceLenght);

        for (int i = 0; i< input.length(); i++ ){
            char vowel = input.charAt(i);
            if (vowel == 'a'){
                vowels++;
                vowelA++;
            }else{
                if (vowel == 'e'){
                    vowels++;
                    vowelE++;
                }else {
                    if (vowel == 'i') {
                        vowels++;
                        vowelI++;
                    } else {
                        if (vowel == 'o') {
                            vowels++;
                            vowelO++;
                        } else {
                            if (vowel == 'u') {
                                vowels++;
                                vowelU++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("La frase tiene "+ vowels + " vocales. " + vowelA + "-A  " + vowelE + "-E  " + vowelI + "-I  " + vowelO + "-O  " + vowelU + "-U  ");
    }
}