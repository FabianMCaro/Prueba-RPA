package Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ejercicio #1\n");
        int numero1 = 3;
        int terminos1 = 5;
        System.out.println("Entrada:  numero="+numero1+"  termino="+terminos1);
        System.out.println("Salida: " + sumOfRepeatedNumber(numero1, terminos1));
    }

    public static int sumOfRepeatedNumber(int numero, int terminos) {
        int sum = 0;
        int repeatedNumber = 0;
        for (int i = 1; i <= terminos; i++) {
            repeatedNumber = repeatedNumber * 10 + numero;
            sum += repeatedNumber;
        }
        return sum;
    }
}
