package Day2;
public class Rectangle {
    private float length;
    private float width;

    // constructors
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // getters and setters
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    // area and perimeter methods
    public float getArea() {
        return length * width;
    }

    public float getPerimeter() {
        return 2 * (length + width);
    }

    // toString method
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
