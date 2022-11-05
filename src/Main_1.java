public class Main_1 {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    DoubleLinkedList_1<Integer> lista = new DoubleLinkedList_1<>();
    
    System.out.println(lista.isEmpty());
    lista.addFirst(45);
    lista.addFirst(88);
     System.out.println(lista.isEmpty());
   // lista.add(2, 32);
    lista.addFirst(89);
    lista.addFirst(90);
    
    lista.add(1, 23);
    lista.add(3, 48);
    System.out.println(lista);
    lista.addFinal(100);
    System.out.println(lista);
    lista.remove(3);
    lista.removeFirst();
    lista.removeLast();
    System.out.println(lista.lenght());

    
    System.out.println(lista);
   // lista.recorrer();
  }
}