public class Main_1 {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    DoubleLinkedList_1<Integer> lista = new DoubleLinkedList_1<>();
    
    System.out.println(lista.isEmpty());
    lista.addFirst(45);
    lista.addFirst(88);
   // lista.add(2, 32);
    lista.addFirst(89);
    lista.addFirst(90);
    //lista.addFirst(45);
    

    
    System.out.println(lista);
   // lista.recorrer();
  }
}