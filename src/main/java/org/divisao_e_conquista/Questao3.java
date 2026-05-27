package org.divisao_e_conquista;

import org.divisao_e_conquista.algorithm.Algoritmo;

public class Questao3 {
    public static void main(String[] args) {
        System.out.println("\nQuestão 3:");
        String texto = "FURB";
        String[] vetorString = texto.split("");
        String texto1 = "PARALELEPIPEDO";
        String[] vetorString1 = texto1.split("");
        String texto2 = "HELLO WORLD";
        String[] vetorString2 = texto2.split("");

        Algoritmo divisaoEConquista4 = new Algoritmo(null);
        System.out.println(divisaoEConquista4.inverterString(vetorString));
        System.out.println(divisaoEConquista4.inverterString(vetorString1));
        System.out.println(divisaoEConquista4.inverterString(vetorString2));
    }
}