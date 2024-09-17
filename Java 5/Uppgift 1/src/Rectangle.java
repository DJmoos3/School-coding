public class Rectangle
{
    int x;
    int y;
    int width;
    int height;
    public Rectangle()
    {
        setHeight(0);
        setWidth(0);
        setX(0);
        setY(0);
    }
    public Rectangle(int height, int width)
    {
        setHeight(height);
        setWidth(width);
        setX(0);
        setY(0);
    }
    public Rectangle(int height, int width, int x, int y)
    {
        setHeight(height);
        setWidth(width);
        setX(x);
        setY(y);
    }
    public double calculateArea()
    {
        return x*y;
    }
    public double calculatePerimiter()
    {
        return height*2 + width*2;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}
