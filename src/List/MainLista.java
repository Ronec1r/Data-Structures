package List;

public class MainLista {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Rone", "rone@gmail.com");
        Aluno aluno2 = new Aluno("Lucas", "lucas@gmail.com");
        Aluno aluno3 = new Aluno("Pedro", "pedro@gmail.com");
        Aluno aluno4 = new Aluno("Larissa", "larissa@gmail.com");
        Aluno aluno5 = new Aluno("Beatriz", "beatriz@gmail.com");

        List<Aluno> lista = new List<Aluno>();

        lista.adiciona(aluno1);
        lista.adiciona(aluno2);

        System.out.println(lista.pega(4));
        System.out.println(lista.pega(0));
        System.out.println(lista.pega(1));



        lista.adicionaNaPosicao(0, aluno3);
        System.out.println(lista.pega(0));


        lista.adiciona(aluno4);
        lista.adiciona(aluno5);



        System.out.println(lista.tamanho());
        System.out.println(lista.pega(2));

        lista.remove(2);
        System.out.println(lista.tamanho());
        lista.mostraLista();
    }
}