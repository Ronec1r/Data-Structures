package LinkedList;

public class Node<T> {
    private Node<T> proximoNodo;
    private Object conteudo;

    public Node(Node<T> proximoNodo, Object conteudo) {
        this.proximoNodo = proximoNodo;
        this.conteudo = conteudo;
    }

    public Node<T> getProximoNodo() {
        return proximoNodo;
    }

    public void setProximoNodo(Node<T> proximoNodo) {
        this.proximoNodo = proximoNodo;
    }

    public Object getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return  "Conteudo=" + conteudo;
    }
}
