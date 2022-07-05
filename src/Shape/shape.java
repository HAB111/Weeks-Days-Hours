package Shape;

public class shape
{   private boolean isFilled;
    private String color;

    public shape()
    {
        this.isFilled = true;
        this.color = "Green";
    }
    public shape (boolean isFilled, String color)
    {
        this.isFilled = isFilled;
        this.color = color;
    }
    public String toString()
    {
     return "Filled: " + isFilled() + "\n" + "Color: " + getColor();
    }

    public boolean isFilled()
    {
        return this.isFilled;
    }

    public void setFilled(boolean filled)
    {
        this.isFilled = filled;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}
