package Ejercicios;

import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ejercicio #3\n");

        List<Integer> list1 = List.of(12, 25, 1, 1, 7, 25);
        System.out.println("Entrada: list="+list1);
        System.out.println("Salida: " + grupoSimilares(list1)+"\n");

        List<Integer> list2 = List.of(6, 7, 8, 9,9);
        System.out.println("Entrada: list="+list2);
        System.out.println("Salida: " + grupoSimilares(list2));
    }

    public static List<List<Integer>> grupoSimilares(List<Integer> list) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int numero : list) {
            if (map.containsKey(numero)) {
                map.get(numero).add(numero);
            } else {
                List<Integer> newList = new ArrayList<>();
                newList.add(numero);
                map.put(numero, newList);
            }
        }
        return new ArrayList<>(map.values());
    }
}
