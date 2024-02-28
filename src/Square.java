public class Square extends  Shape{
    private  int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public String getPerimeter() {
        return "Square P = "+a+" * "+ "4 = " + a*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                "} " + super.toString();
    }
}
