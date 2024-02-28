public class Trapezoid extends  Shape{
    private int a;
    private int b;
    private int c;
    private int  d;


    public Trapezoid(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String getPerimeter() {
        return "Trapezoid P = "+a+"+" +  b+"+" +  c+"+" +  d+" = " + (a+b+c+d);
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                "} " + super.toString();
    }
}
