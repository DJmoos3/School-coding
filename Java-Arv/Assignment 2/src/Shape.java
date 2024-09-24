public class Shape
{
    private int width;
    private int height;
    public Shape(int width, int height)
    {
        setWidth(width);
        setHeight(height);
    }

    public int getArea(int dividedBy)
    {
        return (getWidth()*getHeight())/dividedBy;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
