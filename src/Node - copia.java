public class Node<E> {
    private E contenido;
    private Node<E> siguiente;
    private Node<E> anterior;

    public Node(E contenido) {
        this.contenido = contenido;
        this.siguiente = null;
        this.anterior = null;
    }
    public Node(){
        this.siguiente = null;
        this.anterior = null;
    }

    public Node<E> getSiguiente() {
        return this.siguiente;
    }

    public Node<E> getAnterior(){
        return this.anterior;
    }

    public E getContenido() {
        return this.contenido;
    }

    public void setContenido(E contenido) {
        this.contenido = contenido;
    }

    public void setSiguiente(Node<E> siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Node<E> anterior) {
      this.anterior = anterior;
    }

    @Override
    public String toString() {
        return  String.valueOf(this.getContenido());
    }
    
}