interface A{
    static void display(){
        System.out.println("Static method");
    }
    default void deepak(){
        System.out.println("deepak");
    }
}
class B implements A{
    public static void display(){
        System.out.println("implementation class");
    }
}
public class staticMethods {
    public static void main(String[] args) {
        B b=new B();
        B.display();
        b.deepak();
        A.display();
    }

    
}