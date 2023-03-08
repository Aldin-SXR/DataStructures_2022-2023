package week2;

public class App {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();

    list.addToFront(4); // 4
    list.addToFront(5); // 5, 4
    list.addToFront(7); // 7, 5, 4
    list.addToRear(9);  // 7, 5, 4, 9
    list.addToRear(11); // 7, 5, 4, 9, 11
    list.removeFromFront();  // 5, 4, 9, 11
    list.removeFromRear();   // 5, 4, 9
    System.out.println("Linked list elements: ");
    list.print();

    list.reverse(); // 9, 4, 5
    System.out.println("Linked list after reversal: ");
    list.print();
  }
}
