package Shape;

public class Rectangle extends shape
{   private double length;
    private double width;

    public Rectangle()
    {
        this.length = 2;
        this.width = 1;
    }
    public Rectangle(double l, double w)
    {
        setLW(w,l);
    }

    public Rectangle(double w, double l, boolean isFilled, String color)
    {
        super(isFilled, color);
        setLW(w,l);

    }
    public void setLW(double x, double y) {
        if (x > y) {
            this.length = x;
            this.width = y;
        } else {
            this.length = y;
            this.width = x;
        }

    }
        public double getArea()
        {
        double a;
        a = this.length * this.width;
        return a;
        }

        public String toString()
        {
        return "Width: " + this.width + "\n" + "Length: " + this.length + "\n" + "Area: " + getArea() + "\n" + super.toString();
        }

}
