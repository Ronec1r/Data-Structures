package LinkedList;

public class Nodo<T> {
    private Nodo<T> proximoNodo;
    private Object conteudo;

    public Nodo<T> getProximoNodo() {
        return proximoNodo;
    }

    public void setProximoNodo(Nodo<T> proximoNodo) {
        this.proximoNodo = proximoNodo;
    }

    public void setConteudo(Object conteudo) {
        this.conteudo = conteudo;
    }


}
