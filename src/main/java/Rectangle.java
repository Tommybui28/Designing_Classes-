public class Rectangle {

    int width;
    int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;


    }
    public int area(int width, int length) {
        return width * length;

    }
    public boolean isRectangle(int width, int length) {
        return length == width;

    }



}
