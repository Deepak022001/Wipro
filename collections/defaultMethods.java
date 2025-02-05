interface A{
    default void display(){
        System.out.println("A inteface ");
    }
}

interface B{
    default void display(){
        System.out.println("B inteface ");
    }
}


public class defaultMethods implements A,B{
    public void display(){
        B.super.display();
    }
    public static void main(String[] args) {
        defaultMethods d=new defaultMethods();
        d.display();
    }
    
}