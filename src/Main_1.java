public class Main_1 {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    DoubleLinkedList_1<Integer> lista = new DoubleLinkedList_1<>();
    
    lista.addFirst(2);
    System.out.println(lista.isEmpty());
    lista.addFirst(45);
    lista.addFirst(88);
    lista.addFirst(89);

    System.out.println(lista);
    //lista.recorrer();
  }
}