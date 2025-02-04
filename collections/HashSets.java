import java.util.*;
public class HashSets{
    public static void main(String[] args) {
        HashSet<Integer>h=new HashSet<>(List.of(5,6,2,3,42,3));
        h.add(10);
        h.add(2);
        h.add(3);
        // h.forEach((x)->System.out.println(h));
        System.out.println(h);
    }
}