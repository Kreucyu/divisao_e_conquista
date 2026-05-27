package org.divisao_e_conquista;

import org.divisao_e_conquista.algorithm.Algoritmo;

public class Questao4 {
    public static void main(String[] args) {
        System.out.println("\nQuestão 4:\n");
        int[] vetor1 = {1, 2, 1, 1, 3};
        int[] vetor2 = {1, 2, 0, 2, 2, 3, 2, 7, 2, 1, 2, 1, 3, 2, 2};
        int[] vetor3 = {1, 1, 2, 5, 2, 0};

        Algoritmo algoritmo = new Algoritmo(vetor1);
        Algoritmo algoritmo1 = new Algoritmo(vetor2);
        Algoritmo algoritmo2 = new Algoritmo(vetor3);

        System.out.println(algoritmo.encontrarMaioria());
        System.out.println(algoritmo1.encontrarMaioria());
        System.out.println(algoritmo2.encontrarMaioria());

    }
}
