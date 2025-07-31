package br.com.dio.desafio.Domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo{


    private LocalDate data;

    @Override
    public double calcularXp() {
        return Xp_Padrao + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
// Metodo ToString
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }



}
