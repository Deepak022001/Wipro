import java.util.*;
public class LinkedListJ{
    public static void main(String[] args) {
        LinkedList<Integer>al1=new LinkedList<>();
        LinkedList<Integer>al2=new LinkedList<>(List.of(1,2,3,4,5,6));
         al2.add(10);
         for(Integer i:al2){
            System.out.println(i);
         }
         al2.forEach(n->show(n));
    }
    static void show(int n){
        System.out.println(n);
    }
}