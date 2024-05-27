package oop.labor14;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Point implements Comparable<Point> {
    private final double x;
    private final double y;
    private static final NumberFormat FORMATTER = new DecimalFormat("#0.00");

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Point that){
        double d = Math.sqrt(this.x-that.x)*(this.x-that.x)+(this.y-that.y)*(this.y-that.y);
        return d;
    }
    public double slopeTo(Point that) {
        if (this.x == that.x) {
            if (this.y == that.y) return Double.NEGATIVE_INFINITY; // same point
            return Double.POSITIVE_INFINITY; // vertical line
        }
        return (that.y - this.y) / (that.x - this.x);
    }

    @Override
    public int compareTo(Point that) {
        if (this.y == that.y) {
            return Double.compare(this.x, that.x);
        }
        return Double.compare(this.y, that.y);
    }

    @Override
    public String toString() {
        return "(" + FORMATTER.format(x) + ", " + FORMATTER.format(y) + ")";
    }

}
