package Package;

public class Ejercicio6 {
    //6. Realiza el ejercicio anterior usando un ciclo for.
    public static void main(String[] args) {

        int[] pairNumber = new int [50];
        int pairCounter = 0;
        int[] oddNumber = new int [50];
        int oddCounter = 0;

        for (int i=1; i<=100; i++){
            if (i % 2 == 0){
                pairNumber[pairCounter] = i;
                pairCounter = pairCounter + 1;
            }else if(i % 2 == 1){
                oddNumber[oddCounter] = i;
                oddCounter = oddCounter +1;
            }
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
