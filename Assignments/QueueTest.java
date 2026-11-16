
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {

        Queue<String> Race = new ArrayDeque<String>();

        Race.offer("Lando Norris");
        Race.offer("Max Verstappen");
        Race.offer("Lewis Hamilton");

        System.out.println(Race);
        System.out.println(Race.peek());

        Race.poll();

        System.out.println(Race.peek());
    }
}
