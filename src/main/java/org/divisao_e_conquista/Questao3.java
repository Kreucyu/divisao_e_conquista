package org.divisao_e_conquista;

import org.divisao_e_conquista.algorithm.Algoritmo;

public class Questao3 {
    public static void main(String[] args) {
        System.out.println("\nQuestão 3:\n");
        String texto = "FURB";
        String[] vetorString = texto.split("");
        String texto1 = "PARALELEPIPEDO";
        String[] vetorString1 = texto1.split("");
        String texto2 = "HELLO WORLD";
        String[] vetorString2 = texto2.split("");
        String palavrasReversas = "BRUF\n" +
                "ODEPIPELELARAP\n" +
                "DLROW OLLEH";
        String[] vetorString3 = palavrasReversas.split("");


        Algoritmo algoritmo = new Algoritmo();
        System.out.println(algoritmo.inverterString(vetorString));
        System.out.println(algoritmo.inverterString(vetorString1));
        System.out.println(algoritmo.inverterString(vetorString2));
        System.out.println("\n" + algoritmo.inverterString(vetorString3));
    }
}