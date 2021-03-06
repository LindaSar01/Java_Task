public class Point {
    
    private double x;
    private double y;

    public Point(double X, double Y)
    {
        x = X;
        y = Y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double X)
    {
        x = X;
    }

    public void setY(double Y)
    {
        y = Y;
    }

    private double distance()
    {
        double d = 0;
        d = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
        return d;
    }

    private double distance(Point secondPoint)
    {
        double d = 0;
        double spx = Math.abs(getX() - secondPoint.getX());
        double spy = Math.abs(getY() - secondPoint.getY());
        d = Math.sqrt(Math.pow(spx, 2) + Math.pow(spy, 2));
        return d;
    }

    public static void main(String[] args)
    {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 5);
        System.out.println(p1.distance(p2));

    }
}
