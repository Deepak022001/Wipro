import java.util.*;
public class Arraydeque{
    public static void main(String[] args) {
        ArrayDeque<Integer>ad=new ArrayDeque<>();
        ad.offerLast(10);
        ad.offerLast(20);
        ad.offerLast(30);
        // ad.forEach((x)->System.out.println(x));
        ad.offerLast(1);
        ad.offerLast(2);
        ad.offerFirst(0);
        ad.pollFirst();
        ad.forEach((x)->System.out.println(x));
    }
}