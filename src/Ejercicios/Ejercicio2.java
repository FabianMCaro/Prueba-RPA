package Ejercicios;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ejercicio #2\n");

        List<Integer> entrada1 = List.of(24, 150, 300, 660, 295, 1050, 50);
        System.out.println("Entrada: "+entrada1);
        System.out.println("Salida: " + DivisiblePorCinco(entrada1) + "\n");

        List<Integer> entrada2 = List.of(110, 720, 307, 555, 1095, 12, 300, 1000);
        System.out.println("Entrada: "+entrada2);
        System.out.println("Salida: " + DivisiblePorCinco(entrada2));
    }

    public static List<Integer> DivisiblePorCinco(List<Integer> entrada) {
        List<Integer> salida = new ArrayList<>();
        for (int numero : entrada) {
            if (numero % 5 == 0 && numero <= 600) {
                salida.add(numero);
            }
            if (numero > 1000) {
                break;
            }
        }
        return salida;
    }
}
