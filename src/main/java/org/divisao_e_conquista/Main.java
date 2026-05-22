package org.divisao_e_conquista;

import org.divisao_e_conquista.algorithm.Algoritmo;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nQuestão 1:");
        int[] vetorPar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetorImpar = {23, 34, 45, 65, 67, 90, 100, 101, 115, 125, 167};
        Algoritmo divisaoEConquista = new Algoritmo(vetorPar);
        Algoritmo divisaoEConquista1 = new Algoritmo(vetorImpar);

        System.out.println(divisaoEConquista.buscar(6).toString());
        System.out.println(divisaoEConquista1.buscar(167).toString());;
        System.out.println(divisaoEConquista1.buscar(6).toString());;

        System.out.println("\nQuestão 2:");
        int[] vetorPar1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] vetorImpar1 = {0, 1, 45, 65, 67, 90, 100, 101, 115, 125, 167};

        Algoritmo divisaoEConquista2 = new Algoritmo(vetorPar1);
        Algoritmo divisaoEConquista3 = new Algoritmo(vetorImpar1);

        System.out.println(divisaoEConquista2.buscarIndice(8).toString());
        System.out.println(divisaoEConquista2.buscarIndice(1).toString());
        System.out.println(divisaoEConquista3.buscarIndice(167).toString());;
        System.out.println(divisaoEConquista3.buscarIndice(0).toString());;
        System.out.println(divisaoEConquista3.buscarIndice(6).toString());;
    }
}