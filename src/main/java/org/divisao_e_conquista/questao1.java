package org.divisao_e_conquista;

import org.divisao_e_conquista.algorithm.Algoritmo;

public class questao1 {
    public static void main(String[] args) {
        System.out.println("\nQuestão 1:");
        int[] vetorPar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetorImpar = {23, 34, 45, 65, 67, 90, 100, 101, 115, 125, 167};
        Algoritmo divisaoEConquista = new Algoritmo(vetorPar);
        Algoritmo divisaoEConquista1 = new Algoritmo(vetorImpar);

        System.out.println(divisaoEConquista.buscar(6).toString());
        System.out.println(divisaoEConquista1.buscar(167).toString());;
        System.out.println(divisaoEConquista1.buscar(6).toString());;
    }
}
