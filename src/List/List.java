package List;

public class List<T> {
    private Object[] lista = new Object[100];
    private int quantidadeObjetos =0;

    public void adiciona(T objeto){
        this.adicionaNaPosicao(this.quantidadeObjetos, objeto);
    }
    public T pega(int posicao){
        if (lista[posicao] == null){
            return null;
        }
        System.out.println("Objeto da posição "+posicao+": ");
        return (T) lista[posicao];
    }
    public int tamanho(){
        System.out.println("Tamanho da lista:");
        return this.quantidadeObjetos;
    }

    public void remove(int posicao){
        while(lista[posicao+1]!=null){
            lista[posicao]=lista[posicao+1];
            lista[posicao+1]=null;
        }
        this.quantidadeObjetos -=1;
        System.out.println("Removido");
    }
    public void adicionaNaPosicao(int posicao, T objeto){
        while (lista[posicao]!=null){
            T proximoObjeto = (T) lista[posicao];
            lista[posicao]=objeto;
            objeto=proximoObjeto;
            posicao+=1;
        }
        lista[posicao]=objeto;
        this.quantidadeObjetos +=1;
        System.out.println("Adicionado");
    }

    public void mostraLista(){
        System.out.println("....");
        for (int i=0; i< lista.length; i++){
            if (lista[i]!=null){
                System.out.println(lista[i]);
            }
        }
    }

    public int busca(T objeto){
        for (int i=0; i<this.quantidadeObjetos-1; i++){
            if(lista[i].equals(objeto)){
                System.out.println("Objeto encontrado na posição "+i);
                return i;
            }
        }
        System.out.println("Objeto não encontrado na lista");
        return -1;
    }
}
