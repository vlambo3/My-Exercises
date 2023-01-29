package com.exercises.my.exercises;

import java.util.HashMap;

public class ValidLetters {

    /**
     * El metodo debe retornar un booleano indicando si el parametro `cadena` cumple con alguna de las siguientes propiedades:
     * 1- Todos los caracteres aparecen la misma cantidad de veces.
     *     Ejemplos: "aabbcc", "abcdef", "aaaaaa"
     * 2- Todos los caracteres aparecen la misma cantidad de veces, a excepcion de 1, que aparece un vez mas o una vez menos.
     *     Ejemplos: "aabbccc", "aabbc", "aaaaccccc"
     * @param cadena la cadena a evaluar
     * @return booleano indicando si la cadena cumple con las propiedades
     */

    public static void main(String[] args) {
        String p = "aa3311oo";
        System.out.println(isValid(p));

    }
    static Boolean isValid(String cadena) {
        HashMap<Character, Integer> map_occurrences = new HashMap<>();

        for (char i: cadena.toCharArray()) {
            map_occurrences.put(i, map_occurrences.getOrDefault(i, 0)+1);
        }

        Long differentValues = map_occurrences.values().stream().distinct().count();

        if (differentValues < 3) {
            return true;
        }

        return false;
    }


}

