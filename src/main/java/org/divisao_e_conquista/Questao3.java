package org.divisao_e_conquista;

import org.divisao_e_conquista.algorithm.Algoritmo;

public class Questao3 {
    public static void main(String[] args) {
        System.out.println("\nQuestão 3:");
        String texto = "FURB";
        String[] vetorString = texto.split("");

        Algoritmo divisaoEConquista4 = new Algoritmo(null);
        System.out.println(divisaoEConquista4.inverterString(vetorString));
    }
}