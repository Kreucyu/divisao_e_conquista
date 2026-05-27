package org.divisao_e_conquista.algorithm;

import org.divisao_e_conquista.entities.Resposta;

import java.util.HashMap;
import java.util.Map;

public class Algoritmo {
    private int[] vetor;
    private String[] stringVetor;
    private Map<Integer, Integer> ocorrenciasNumericas;

    public Algoritmo() {
    }

    //Questão 1
    public Resposta buscar(int valorBusca, int[] vetor) {
        this.vetor = vetor;
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
    public Resposta buscarIndice(int valorBusca, int[] vetor) {
        this.vetor = vetor;
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
        this.stringVetor = string;
        return inverterStringRecursivo(0, string.length - 1);
    }


    private String inverterStringRecursivo(int inicio, int fim) {
        if(inicio == fim) {
            return stringVetor[inicio];
        }
        int meio = (inicio + fim) / 2;
        return  inverterStringRecursivo(meio + 1, fim)  + inverterStringRecursivo(inicio, meio);
    }

    //Questão 4
    public String encontrarMaioria(int[] vetor) {
        this.vetor = vetor;
        this.ocorrenciasNumericas = new HashMap<>();
        encontrarMairoriaBuscar(0, vetor.length - 1);
        int valor = 0;
        int ocorrencias = 0;
        for(Map.Entry<Integer, Integer> buscar : ocorrenciasNumericas.entrySet()) {
            if(buscar.getValue() > ocorrencias) {
                ocorrencias = buscar.getValue();
                valor = buscar.getKey();
            }
        }
        if(ocorrencias > vetor.length / 2) {
            return "O valor em maioria é "
                    + valor +
                    ", com o total de "
                    + ocorrencias +
                    " ocorrências";
        }
        return "Não foi encontrado nenhum valor em maioria, " +
                "porém o valor com maior ocorrência é "
                + valor +
                ", com o total de "
                + ocorrencias +
                " ocorrências";
    }

    private void encontrarMairoriaBuscar(int inicio, int fim) {
        int meio = (inicio + fim) / 2;
        if(inicio == fim) {
            if(ocorrenciasNumericas.containsKey(vetor[meio])) {
                int ocorrencias = ocorrenciasNumericas.get(vetor[meio]);
                ocorrencias++;
                ocorrenciasNumericas.put(vetor[meio], ocorrencias);
                return;
            }
            ocorrenciasNumericas.put(vetor[meio], 1);
            return;
        }
        if(inicio < fim) {
            encontrarMairoriaBuscar(inicio, meio);
            encontrarMairoriaBuscar(meio + 1, fim);
        }
    }
}
