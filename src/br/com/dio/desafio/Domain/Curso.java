package br.com.dio.desafio.Domain;

public class Curso extends Conteudo{


    private int cargaHoraria;



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
//Metodo ToString()
    @Override
    public String toString() {
        return "Curso{\n" +
                "titulo='" + getTitulo()  +"\n"+
                ", descricao='" + getDescricao() +"\n"+
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


    @Override
    public double calcularXp() {
        return Xp_Padrao * cargaHoraria;
    }
}
