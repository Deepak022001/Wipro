class parent{
    public parent(){
        System.out.println("Constructor of parent ");
    }
}
class child extends parent{

    public child(){
        System.out.println("parent constructor");
    }
}
public class ConstructorHeritance {
    public static void main(String []args){
        child c=new child();
    }
    
}
