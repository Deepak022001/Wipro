import java.util.*;
public class ListDemo{
    public static void main(String [] args){
        ArrayList<Integer> al1=new ArrayList<>(20);
        ArrayList<Integer>al2=new ArrayList<>(List.of(50,60,70,80,90));
        al1.add(20); 
        al1.add(0,5); 
        al1.addAll(al2);
        for(int i=0;i<al1.size();i++){
            System.out.println(al1.get(i));
        } 
        System.out.println("second method");
        for(Integer i:al2){
            System.out.println(i);
        }
        for(var x:al1){
            System.out.println(x);
        }
    Iterator<Integer>it=al1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Iterator<Integer>lit=al2.iterator();
        al1.forEach(System.out::println);
    }
}  