public class Rectangle extends  Shape{
private int length;
private int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width= width;
    }

    @Override
    public String getPerimeter() {
        int result =  2*(length+width);
        return ("Rectangle P = "+2 + "*" + "( " + length + "+" + width + ") = " + result);


    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "} " + super.toString();
    }
}
