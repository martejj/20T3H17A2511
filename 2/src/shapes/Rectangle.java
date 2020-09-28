package shapes;

public class Rectangle extends Shape{
    
    int height;
    int width;
    
    public Rectangle(int x, int y, int width, int height) {
        super(x, y, width*height);
        this.height = height;
        this.width = width;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", width=" + this.width + ", height=" + this.height;
    }
    
}
