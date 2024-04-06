package geometry;

public class ColoredCircle extends Circle {
    private String color;

    public ColoredCircle(Point center, double radius, String color) {
        super(center, radius, 0);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}