
import java.util.LinkedList;

public class LinkedListTest{
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.offer(5);
        linkedlist.offer(4);
        linkedlist.offer(3);
        System.out.println(linkedlist.peek());
        System.out.println(linkedlist.poll());
        System.out.println(linkedlist.peek());
    }
}