package inheritance;

public class Rectangle {
    private int height;
    private int width;
    public Rectangle(int height, int width) {
        setHeight(height);
        setWidth(width);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return height * width;
    }
}
