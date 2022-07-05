package Shape;

public class Circle extends shape
{
    private double radius;

    public Circle()
    {
       radius = 1;
    }

    public Circle(double d)
    {
        this.radius = d;
    }
    public Circle(double d, boolean isFilled, String color)
    {
        super(isFilled, color);
        this.radius = d;
    }
    // getArea is a METHOD
    public double getArea()
    {
        double area = Math.PI*Math.pow(this.radius, 2);
        return area;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String toString()
    {
        return "Radius: " + this.radius + "\n" + "Area: " + getArea() + "\n" + super.toString();
    }

}
