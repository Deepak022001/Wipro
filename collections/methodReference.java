interface Mylamda{
    public void display(String str);
}
public class methodReference {
    public static void reverse(String str){
        StringBuffer s=new StringBuffer(str);
        s.reverse();
        System.out.println(s);
    }
    public static void main (String [] args){
        Mylamda ml=methodReference::reverse;
        ml.display("Hello");
    }
}



