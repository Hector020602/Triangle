public class TestMyTriangle {
    public static void main(String[] args) {
        Triangle t = new Triangle(1,1,2,3,1,4);
        System.out.println(t);
        System.out.println("Perimeter is : " + t.getPerimeter());
        t.printType();

    }
}
