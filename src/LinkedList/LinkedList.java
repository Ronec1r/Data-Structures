package LinkedList;

public class LinkedList<T> {
    private Node<T> primeiroElemento=null;
    private int quantidadeObjetos = 0;

    public void adicionaNoInicio(T objeto){
        Node novoNodo = new Node(this.primeiroElemento, objeto);
        this.primeiroElemento = novoNodo;
        this.quantidadeObjetos+=1;
    }

    public void adicionaNaPosicao(T objeto, int posicao){

    }

    public void adicionaNoFinal(T objeto){
        Node novoNodo = new Node(null, objeto);
        Node nodo = (Node) pega(this.quantidadeObjetos-1);
        nodo.setProximoNodo(novoNodo);
        this.quantidadeObjetos+=1;
    }

    public T pega(int posicao){
        Node nodo = this.primeiroElemento;
        for (int i=0; i<posicao; i++){
            nodo = nodo.getProximoNodo();
        }
        return (T) nodo;
    }

    public void remove(){

    }

    public int tamanho(){
        return this.quantidadeObjetos;
    }

    public int busca(T objeto){
        Node nodo = this.primeiroElemento;
        for (int i=0; i<this.quantidadeObjetos; i++){
            if (nodo.getConteudo().equals(objeto)){
                return i;
            }else{
                nodo = nodo.getProximoNodo();
            }
        }
        return -1;
    }
}
