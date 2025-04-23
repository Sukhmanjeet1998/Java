package shape;

public class Main {
    public static void main(String[] args) {

//        Shape rectangle = new Rectangle(5,3);
//        Shape circle = new Circle(5);
//        Shape sphere = new Sphere(5);
//        Shape triangle = new Triangle(5,3);
//        System.out.println("Area of rectangle is "+ rectangle.area());
//        System.out.println("Area of circle is "+ circle.area());
//        System.out.println("Area of sphere is "+ sphere.area());
//        System.out.println("Area of triangle is "+ triangle.area());


        // Create an array to store different Shape instances
        Shape[] shapes = {
                new Rectangle(5, 3),
                new Circle(5),
                new Sphere(5),
                new Triangle(5, 3)
        };
        // Loop through the array and print the area of each shape
        for (Shape shape : shapes) {
            // Use getClass().getSimpleName() to get the class name for better output
            System.out.printf("Area of %s is %.2f%n",
                    shape.getClass().getSimpleName(), shape.area());
        }

    }
}