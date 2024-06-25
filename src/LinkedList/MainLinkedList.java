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


        //Adição no inicio e final
        lista.adicionaNoInicio(aluno1);
        lista.adicionaNoInicio(aluno2);
        lista.adicionaNoFinal(aluno3);

        lista.mostraLista();
        System.out.println("--------------");

        //Adição na posicão
        lista.adicionaNaPosicao(aluno4, 1);
        lista.adicionaNaPosicao(aluno5,0);

        lista.mostraLista();
        System.out.println("--------------");

        //Remove de uma posição
        lista.remove(0);
        lista.remove(3);


        lista.mostraLista();
        System.out.println("--------------");

        //Tamanho da lista
        System.out.println(lista.tamanho());

        //Pega o objeto de acordo com uma posição
        System.out.println(lista.pega(0));

        //Pega a posição de um determinado objeto
        System.out.println(lista.busca(aluno2));
    }
}
