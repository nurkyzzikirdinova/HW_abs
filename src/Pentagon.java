public class Pentagon extends  Shape{
    private int a;

    public Pentagon(int a) {
        this.a = a;
    }

    @Override
    public String getPerimeter() {

        return "Pentagon P = 5" + " * "+a +" = " + 5*a;
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                "a=" + a +
                "} " + super.toString();
    }
}
