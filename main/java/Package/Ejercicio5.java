package Package;

public class Ejercicio5 {
    //5. Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
    public static void main(String[] args) {

        int num = 1;
        int[] pairNumber = new int [50];
        int pairCounter = 0;
        int[] oddNumber = new int [50];
        int oddCounter = 0;

        while (num <=100){

            if(num % 2 == 0){
                pairNumber[pairCounter] = num;
                pairCounter = pairCounter +1;
            }else if(num % 2 == 1){
                oddNumber[oddCounter] = num;
                oddCounter = oddCounter +1;
            }
            num = num + 1;
        }
        System.out.println("Los números pares son:");
        for (int i = 0; i< pairNumber.length-1; i++){
            System.out.println(pairNumber[i]);
        }
        System.out.println("Los números impares son:");
        for (int i = 0; i< oddNumber.length-1; i++){
            System.out.println(oddNumber[i]);
        }

    }
}
