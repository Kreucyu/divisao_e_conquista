package org.divisao_e_conquista.algorithm;

import org.divisao_e_conquista.entities.Resposta;

public class Algoritmo {
    private int[] vetor;

    public Algoritmo(int[] vetor) {
        this.vetor = vetor;
    }

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
            return pivo;
        }

        if(inicio < fim) {
            buscarValor(inicio, pivo, valorBusca);
            buscarValor(pivo + 1, fim, valorBusca);
        }
    }
}
