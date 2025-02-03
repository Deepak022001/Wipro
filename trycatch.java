public class trycatch {
    public static void main(String [] args){
        try{
        int []array={0,2,3,4,5,6,7,8,9,0};
        System.out.println(array[20]);
        int r=array[1]/array[0];
        System.out.println(r);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
