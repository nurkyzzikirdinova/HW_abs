/**public abstract double getPerimeter()
 деген абстракт методун  Shape деген класска кошунуз.
 Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.*/
public class Main {
    public static void main(String[] args) {
Shape rectangle = new Rectangle(2, 3);
Shape triangle = new Triangle(3, 5, 3);
Shape square = new Square(2);
Shape pentagon = new Pentagon(4);
Shape trapezoid = new Trapezoid(4, 4, 2, 4);

Shape [] shapes = {rectangle, triangle, square, pentagon, trapezoid};

        for (Shape shape : shapes) {
            System.out.println(shape.getPerimeter());
        }

    }
}