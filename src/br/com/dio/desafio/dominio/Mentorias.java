package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorias extends Conteudo{


    LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentorias{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição=" + getDescricao() +
                ", data=" + data +
                '}';
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
