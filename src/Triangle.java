public class Triangle extends  Shape{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getPerimeter() {
        int result = a+b+c;
        return ("Triangle P = " + a + " + " + b + " + " + c + " = " + result);

    }


    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                "} " + super.toString();
    }
}
