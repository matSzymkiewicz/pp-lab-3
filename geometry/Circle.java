package geometry;

public class Circle { 
    private Point center;
private double radius;

{
    Point center;  
    double radius; 
} 

public Circle(Point center, double radius, int i) {
    this.center = center; 
    this.radius = radius;
} 

public Point getCenter() {
    return center;
}

public double getRadius() {
    return radius; 
} 

public double calculatePerimeter() { 
    return 2 * Math.PI * radius; 

} 
}
// Cały czas pokazywało mi błąd, nie wiem dokładnie co zrobiłem, ale zaczęło działać 
