public class Polygon {
    public static final int NUM_POINTS = 100;
    private Point[] points;


    public Polygon() {
        points = new Point[NUM_POINTS];
        for (int i = 0; i < points.length; i++) {
            points[i] = null;
        }
    }

    public Polygon(Point[] points) {
        this.points = new Point[NUM_POINTS];
        for (int i = 0; i < this.points.length; i++) {
            if (i < points.length) {
                this.points[i] = points[i];
            }else {
                this.points[i] = null;
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        int i = 0;
        while (i < points.length && points[i] != null) {
            s += points[i] + "-";
            i++;
        }
        s += points[0];
        return s;
    }

    public double getLength() {
        int i = 1;
        Point p1,p2 = new Point();
        Segment segment;
        double length = 0;
        while (i < points.length -1 && points[i] != null) {
            p1 = points[i - 1];
            p2 = points[i];
            segment = new Segment(p1, p2);
            length += segment.getModule();
            i++;

        }
        segment = new Segment(points[i -1], points[0]);
        length += segment.getModule();
        return length;

    }
    public void setOffset(int offX, int offY) {
        int i = 0;
        while (i < points.length && points[i] != null) {
            points[i].setOffset(offX, offY);
            i++;
        }

    }
}
