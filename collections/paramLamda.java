interface LamdaExpression{
    public int sum(int a ,int b);
}
public class paramLamda{
    public static void main(String[] args) {
        LamdaExpression L=(a,b)->a+b;
        int result=L.sum(10,20);
    System.out.println(result);
    }
}