/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hogar
 */
public class Nodo<E> {
    private E contenido;
    private Nodo<E> siguiente;
    private Nodo<E> anterior;
    
    public  Nodo(E c){
	contenido = c;
	siguiente = null;
    }
    public Nodo(){}

    public Nodo<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public E getContenido() {
        return contenido;
    }

    public void setContenido(E contenido) {
        this.contenido = contenido;
    }

    public Nodo<E> getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo<E> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return String.valueOf(this.contenido);
    }
    
    
}
