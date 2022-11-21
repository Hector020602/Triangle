public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment() {
        startPoint = new Point();
        endPoint = new Point();
    }

    public Segment(Point startPoint,Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;

    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public  double getModule(){
        int c1 = endPoint.getX() - startPoint.getX();
        int c2 = endPoint.getY() - startPoint.getY();
        double h = Math.sqrt(c1 * c1 + c2 * c2);
        return  h;

    }

    @Override
    public String toString() {
        return "(" + startPoint.getX() + ", " + startPoint.getY() +
                ") - (" + endPoint.getX() + ", " + endPoint.getY() + ")";

    }
    public void setoffset(int offX , int offY) {
        startPoint.setOffset(offX, offY);
        endPoint.setOffset(offX, offY);

    }
}
