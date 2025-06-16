public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    DoubleLinkedList<Integer> lista = new DoubleLinkedList<>();
    System.out.println("Is empty?");
    System.out.println(lista.isEmpty());
    
    System.out.println("Agregar elementos al inicio");
    lista.addFirst(45);
    lista.addFirst(88);
    lista.addFirst(89);
    lista.addFirst(90);
    System.out.println(lista);
    System.out.println(lista);
    System.out.println(lista);
    System.out.println("Agregado para el sonarqube");
    System.out.println("Agregar el nodo con contenido 23 en el indice 1");
    lista.add(1, 23);
    System.out.println(lista);
    System.out.println("Agregar el nodo con contenido 48 en el indice 3");
    lista.add(3, 48);
    System.out.println(lista);

    System.out.println("Agregar un elemento al final");
    lista.addFinal(100);
    System.out.println(lista);
    
    System.out.println("Devolver el primer elemento");
    System.out.println(lista.getFirst());
    System.out.println("Devolver el elemento en indice 2");
    System.out.println(lista.get(2));
    System.out.println("Devolver el ultimo elemento");
    System.out.println(lista.getLast());
    System.out.println("Lista Inicial");
    System.out.println(lista);
    System.out.println("Remover el elemento en el indice 3 (se quita el 48)");
    lista.remove(3);
    System.out.println(lista);
    System.out.println("Remover el primer elemento");
    lista.removeFirst();
    System.out.println(lista);
    System.out.println("Remover el ultimo elemento");
    lista.removeLast();
    System.out.println(lista);
    System.out.println("Lista final");
    System.out.println(lista);
    System.out.println("Tamanio de la lista");
    System.out.println(lista.lenght());  
    
    

  }
}