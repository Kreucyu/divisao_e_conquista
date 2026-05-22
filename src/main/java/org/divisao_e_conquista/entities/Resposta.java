package org.divisao_e_conquista.entities;

public class Resposta {
    private boolean estado;
    private String mensagem;

    public Resposta(boolean estado, String mensagem) {
        this.estado = estado;
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Resposta{" +
                "estado=" + estado +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }
}
