package Problem2Point;

public class Point
{
    private int x;
    private int y;

    public Point()
    {
        x = 0;
        y = 0;
    }
    public Point(int xVal, int yVal)
    {
        this.x = xVal;
        this.y = yVal;
    }
    public int getX()
    {

        return x;
    }
    public int getY()
    {

        return y;
    }
    public void setPoint(int newX, int newY)
    {
        this.x = newX;
        this.y = newY;
    }
    public String toString()
    {
       String s = "(" + x + ", " + y + ")";
        return s;
    }
    public double distance(Point pnt)
    {
        double dist = Math.sqrt(Math.pow((this.x-pnt.x), 2) + Math.pow((this.y-pnt.y), 2));
        return dist;
    }

}


