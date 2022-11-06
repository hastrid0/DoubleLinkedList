public class DoubleLinkedList<E> {
  private Node<E> primero;
  private Node<E> ultimo;
  private int size;

  public DoubleLinkedList() {
    primero = null;
    ultimo = null;
    size = 0;
  }

  public boolean addFirst(E e) {
    Node<E> newnode = new Node<>(e);

    if (isEmpty()) {
      this.primero = newnode;
      this.ultimo = newnode;
      /*
      this.primero.setSiguiente(newnode);
      this.ultimo.setSiguiente(newnode);*/
      this.size++;

      return true;
    } 
    else {
      newnode.setSiguiente(this.primero);
      newnode.setAnterior(this.ultimo);
     // this.primero.setAnterior(newnode);
      this.primero = newnode;
      this.ultimo.setSiguiente(this.primero);
      this.size++;
      return true;
    }


  }

  public boolean add(int index, E e) {
    if (e != null) {
      if (index == 0 || isEmpty()) {
        return addFirst(e);
      } else if (index == this.size - 1) {
        return addFinal(e);
      } else {
        Node<E> newNode = new Node<>(e);
        Node<E> temp = this.primero;
        for (int i = 0; i != index-1; i++) {
          temp = temp.getSiguiente();
        }
        newNode.setSiguiente(temp.getSiguiente());
        newNode.setAnterior(temp);
        temp.getSiguiente().setAnterior(newNode);
        temp.setSiguiente(newNode);
       
        this.size++;
        return true;
      }
    }
    return false;
  }

  public boolean isEmpty() {
    return (primero == null && ultimo == null);
  }

  public boolean addFinal(E e) {
    if (e != null) {
      Node<E> newNode = new Node(e);
      newNode.setAnterior(this.ultimo);
      this.ultimo.setSiguiente(newNode);
      this.ultimo = newNode;
      this.ultimo.setSiguiente(this.primero);
      this.size++;
      return true;
    }
    return false;

  }

  // Retira el primer elemento
  public E removeFirst() {

    this.primero.getSiguiente().setAnterior(this.ultimo);
    this.ultimo.setSiguiente(this.primero.getSiguiente());
    this.size--;
    return this.primero.getContenido();

  }

  // Retira el indice dado
  public E remove(int index) {
    E elemento = null;
    if (index < 0 || index >= size) {
      return null;
    } 
    else {
      Node<E> p = getAnterior(index);
      Node<E> t = get(index);
      Node<E> x = t.getSiguiente();
      p.setSiguiente(x);
      size--;
      elemento = t.getContenido();
    }
    return elemento;

  }

  // Retira el ultimo
  public E removeLast() {
    this.ultimo.getAnterior().setSiguiente(this.primero);
    this.primero.setAnterior(this.ultimo.getAnterior());
    this.size--;
    return this.ultimo.getContenido();
  }

  public E getFirst() {
    return this.primero.getContenido();
  }

  public Node<E> getAnterior(int index) {
    int i = 0;
    Node<E> resultado = null;
    for (Node<E> n = primero; n != ultimo; n = n.getSiguiente()) {
      if (i++ == index - 1) {
        resultado = n;
      }
    }
    return resultado;
  }

  public Node<E> get(int j) {

    Node<E> n = this.ultimo;
    Node<E> resultado = new Node<>();
    
       int cont = -1;
        while(cont!=j){
                n = n.getSiguiente();
                cont++;
                if(cont == j){
                    resultado = n;
                }
        }
    return resultado;
  }

  public E getLast() {
    return this.ultimo.getContenido();
  }

  public int lenght() {
    /*
     * Node<E> n;
     * int contador = 0;
     * for(n = this.primero; n!= null; n = n.getSiguiente()){
     * contador ++;
     * 
     * }
     * return contador;
     */
    return this.size;
  }

  @Override
    public String toString() {
       String s= "";
     
       Node<E> n = this.ultimo;
       int cont = 0;
        while(cont<size){
                n = n.getSiguiente();
                s+= n.toString()+ " ";
                cont++;
        }
        return s;
    }
  
  
  public void recorrer(){
       String s= "";
     
       Node<E> n = this.ultimo;
       int cont = 0;
        while(cont<size){
                n = n.getSiguiente();
                s+= n.toString()+ " ";
                cont++;
        }
       
        System.out.println(s);
    }

}