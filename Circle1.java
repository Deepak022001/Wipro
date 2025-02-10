class Circle
{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double permiter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return permiter();
    }
}
class Cylinder extends Circle{
    public double height;
    public double volume(){
        return area()*height;
    }
}

public class Circle1{
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.radius=7;
        c.height=10;
        System.out.println("Volume "+c.volume());
        System.err.println("Area "+c.area());
    }
}