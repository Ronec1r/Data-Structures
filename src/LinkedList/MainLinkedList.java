package LinkedList;
import List.Aluno;

public class MainLinkedList {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Rone", "rone@gmail.com");
        Aluno aluno2 = new Aluno("Lucas", "lucas@gmail.com");
        Aluno aluno3 = new Aluno("Pedro", "pedro@gmail.com");
        Aluno aluno4 = new Aluno("Larissa", "larissa@gmail.com");
        Aluno aluno5 = new Aluno("Beatriz", "beatriz@gmail.com");

        LinkedList<Aluno> lista = new LinkedList<Aluno>();

        lista.adicionaNoInicio(aluno1);
        lista.adicionaNoInicio(aluno2);
        lista.adicionaNoFinal(aluno3);

        System.out.println(lista.pega(0));
        System.out.println("-------------------");
        System.out.println(lista.pega(1));
        System.out.println("-------------------");
        System.out.println(lista.pega(2));
        System.out.println("-------------------");
        System.out.println(lista.busca(aluno3));

        lista.adicionaNoInicio(aluno4);
        System.out.println(lista.pega(0));
        System.out.println("-------------------");
        System.out.println(lista.pega(1));
        System.out.println("-------------------");
        System.out.println(lista.pega(2));
        System.out.println("-------------------");
        System.out.println(lista.pega(3));
        System.out.println("-------------------");
        System.out.println(lista.busca(aluno3));


    }
}
