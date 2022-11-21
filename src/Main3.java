public class Main3 {
    public static void main(String[] args) {
        Point[] points = {new Point(1,3),
                new Point(3,3),
                new Point(3,2),
                new Point(1,2)};
        Polygon pol = new Polygon(points);
        System.out.println(pol);
        double length = pol.getLength();
        System.out.println("length = " + length);
        pol.setOffset(3,3);
        System.out.println(pol);

    }
}
