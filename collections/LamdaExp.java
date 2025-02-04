
interface LamdaExpression{
    void display(String str);
}

public class LamdaExp {

    public static void main(String[] args) {
        // LamdaExpression L =()->{System.out.println("Lambda expression are used to implement functional interface  in easy way");};        
        LamdaExpression L =(s)->{System.out.println(s);};        
        L.display("hi there");
    }
}