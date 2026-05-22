package org.divisao_e_conquista.algorithm;

import org.divisao_e_conquista.entities.Resposta;

public class Algoritmo {
    private final int[] vetor;

    public Algoritmo(int[] vetor) {
        this.vetor = vetor;
    }

    //Questão 1
    public Resposta buscar(int valorBusca) {
        var retorno = buscarValor(0, vetor.length - 1, valorBusca);
        if(retorno == null) {
            return new Resposta(false, "Valor não encontrado");
        }
        return retorno;
    }

    private Resposta buscarValor(int inicio, int fim, int valorBusca) {
        int pivo = (inicio + fim) / 2;
        if(vetor[pivo] == valorBusca) {
            return new Resposta(true, "Valor (" + valorBusca  + ") encontrado na posição: " + pivo);
        }
        if(inicio < fim) {
            if(vetor[pivo] > valorBusca) {
                return buscarValor(inicio, pivo, valorBusca);
            }
            if(vetor[pivo] < valorBusca) {
                return buscarValor(pivo + 1, fim, valorBusca);
            }
        }
        return null;
    }

    //Questão 2
    public Resposta buscarIndice(int valorBusca) {
        var retorno = buscarValorIndice(0, vetor.length - 1, valorBusca);
        if(retorno == null) {
            return new Resposta(false, "Valor não encontrado");
        }
        return retorno;
    }

    private Resposta buscarValorIndice(int inicio, int fim, int valorBusca) {
        int pivo = (inicio + fim) / 2;
        if(vetor[pivo] == pivo && vetor[pivo] == valorBusca) {
            return new Resposta(true, "Valor (" + valorBusca  + ") encontrado na posição: " + pivo);
        }
        if(inicio < fim) {
            if(vetor[pivo] > valorBusca) {
                return buscarValorIndice(inicio, pivo, valorBusca);
            }
            if(vetor[pivo] < valorBusca) {
                return buscarValorIndice(pivo + 1, fim, valorBusca);
            }
        }
        return null;
    }

    //Questão 3
    public String inverterString(String[] string) {

        return null;
    }
}
