import br.com.dio.desafio.Domain.Bootcamp;
import br.com.dio.desafio.Domain.Curso;
import br.com.dio.desafio.Domain.Dev;
import br.com.dio.desafio.Domain.Mentoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
         curso1.setTitulo("Curso de Java");
         curso1.setDescricao("Curso com ensinamentos Java POO e APIs");
         curso1.setCargaHoraria(72);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso de .NET");
        curso1.setDescricao("Curso com ensinamentos .NET POO e APIs");
        curso1.setCargaHoraria(64);

         Mentoria mentoria1 = new Mentoria();

         mentoria1.setTitulo("Mentoria de POO em Java");
         mentoria1.setDescricao("Mentoria de 1000hrs");
         mentoria1.setData(LocalDate.now());


        //Primeiro bootcamp abstraido e instanciado
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT Start #7");
        bootcamp.setDescricao("Uma imersão completa no desenvolvimento back-end");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        //Abstração de Dev
        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos "+devFelipe.getNome() + ":" + devFelipe.getConteudosIncritos());
        System.out.println("Conteudos concluídos "+ devFelipe.getNome() + ":"+ devFelipe.getConteudosConcluidos());
        System.out.println("XP: "+ devFelipe.calcularTotalXp());
        devFelipe.progredir();
        System.out.println("Conteudo inscritos "+devFelipe.getNome() + ":" + devFelipe.getConteudosIncritos());
        System.out.println("Conteudos concluídos "+ devFelipe.getNome() + ":"+ devFelipe.getConteudosConcluidos());
        System.out.println("XP: "+ devFelipe.calcularTotalXp());
    }
}