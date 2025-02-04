import java.util.PriorityQueue;

public class Prioritydemo{
    public static void main(String[] args) {
        PriorityQueue<Integer>p=new PriorityQueue<>();
        p.add(10);
        p.add(20);
        p.add(30);
        p.add(40);
        System.out.println(p.peek());
        System.out.println(p.poll());
    }
}