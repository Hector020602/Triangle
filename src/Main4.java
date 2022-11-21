public class Main4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r);
        r.moveTo(4,7);
        System.out.println(r);


        Rectangle r2 = new Rectangle(new Point(1,1), 8 , 6);
        System.out.println(r2);

        Rectangle r3 = new Rectangle(new Point(2,2),new Point(5,8));
        System.out.println(r3);
        System.out.println(r3.getArea());

        System.out.println(r3.getPoint());
        System.out.println("top-left: " + r3.getTopLeftPoint());
        System.out.println("top-right: " + r3.getTopRightPoint());
        System.out.println("bottom-left: " + r3.getBottomLeftPoint());
        System.out.println("bottom-right: " + r3.getBottomRightPoint());
    }
}
