class Rectangle {
    public int l;
    public int b;

    // No-argument constructor
    Rectangle() {
        System.out.println("Non-param constructor of Rectangle");
    }

    // Parameterized constructor
    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
        System.out.println("Parameterized constructor of Rectangle");
    }

    // Method to calculate area of rectangle
    public int area() {
        return l * b;
    }
}

class Square extends Rectangle {
    // No-argument constructor of Square
    Square() {
        super();  // Calls the Rectangle's no-argument constructor
        System.out.println("Non-param constructor of Square");
    }

    // Parameterized constructor of Square (since it's a square, only one side is needed)
    Square(int h) {
        super(h, h);  // Calls the Rectangle constructor with both sides as 'h'
        System.out.println("Parameterized constructor of Square");
    }

    // Additional method to calculate area of square (inherited from Rectangle)
    public int area() {
        return l * b;  // or return l * l; since it's a square
    }
}

public class paramConstructor {
    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle r = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + r.area());

        // Creating a Square object using the parameterized constructor
        Square s = new Square(4);
        System.out.println("Square Area: " + s.area());

        // Creating a Square object using the non-parameterized constructor
        Square s2 = new Square();
    }
}
