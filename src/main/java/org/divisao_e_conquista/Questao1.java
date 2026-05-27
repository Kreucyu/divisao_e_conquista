package org.divisao_e_conquista;

import org.divisao_e_conquista.algorithm.Algoritmo;

public class Questao1 {
    public static void main(String[] args) {
        System.out.println("\nQuestão 1:");
        int[] vetorPar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetorImpar = {23, 34, 45, 65, 67, 90, 100, 101, 115, 125, 167};
        Algoritmo algoritmo = new Algoritmo();

        System.out.println(algoritmo.buscar(6, vetorPar));
        System.out.println(algoritmo.buscar(167, vetorImpar));
        System.out.println(algoritmo.buscar(6, vetorImpar));
    }
}
