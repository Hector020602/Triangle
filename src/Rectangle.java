public class Rectangle extends Point{
    private int width;
    private int height;

    public Rectangle() {
        super();
        width = 0;
        height = 0;

    }
    public Rectangle(Point p, int newWidth, int newHeight) {
        super(p.getX(), p.getY());
        width = newWidth;
        height = newHeight;
    }

    public Rectangle(Point bottomLeft, Point upperRight) {
        super(bottomLeft.getX(), bottomLeft.getY());
        width = upperRight.getX() - bottomLeft.getX();
        height = upperRight.getY() - bottomLeft.getY();

    }

    public int getArea() {
        int area = width*height;
        return area;


    }
    public Point getPoint() {
        return new Point(getX(), getY());
    }

    public Point getTopLeftPoint() {
        return new Point(getX(), getY() + height);
    }

    public Point getTopRightPoint() {
        return new Point(getX() + width, getY());

    }

    public Point getBottomRightPoint() {
        return new Point(getX() + width, getY());
    }

    public Point getBottomLeftPoint() {
        return  new Point(getX(), getY());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " width = " + width + " height = " + height;
    }
}
