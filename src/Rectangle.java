public class Rectangle {
    private int length;
    public int width;

    public Rectangle(int rectLength, int rectWidth) {
        length = rectLength;
        width = rectWidth;
    }

    public void printArea() {
        int area = length * width;
        System.out.println("The area is " + area);
    }
}

