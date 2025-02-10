interface Mylamda{
    public void display(String str);
}

public class methodReference1{
    public static void main(String[] args) {
        Mylamda ml=System.out::println;
        ml.display("Deepak singh");
    }
}