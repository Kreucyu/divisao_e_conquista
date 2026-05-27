package org.divisao_e_conquista;

import org.divisao_e_conquista.algorithm.Algoritmo;

public class Questao2 {
    public static void main(String[] args) {
        System.out.println("\nQuestão 2:");
        int[] vetorPar = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] vetorImpar = {0, 1, 45, 65, 67, 90, 100, 101, 115, 125, 167};

        Algoritmo algoritmo = new Algoritmo();

        System.out.println(algoritmo.buscarIndice(8, vetorPar).toString());
        System.out.println(algoritmo.buscarIndice(1, vetorPar).toString());
        System.out.println(algoritmo.buscarIndice(167, vetorImpar).toString());
        System.out.println(algoritmo.buscarIndice(0, vetorImpar).toString());
        System.out.println(algoritmo.buscarIndice(6, vetorImpar).toString());
    }
}
