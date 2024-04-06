
import geometry.Circle; 
import geometry.Point; 
import geometry.ColoredCircle;

public class Main {
   public static void main (String[] args) {
       Point center = new Point(3.5, 2.0);
       Point point = new Point(3.5, 2.0);
     Circle circle = new Circle(center, 4,0); 
     ColoredCircle coloredCircle = new ColoredCircle(center, 7, "czerwony");

     System.out.println("Współrzędna x: " + point.getX());
     System.out.println("Współrzędna y: " + point.getY());
     System.out.println("Współrzędne środka koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
     System.out.println("Promień koła: " + circle.getRadius());
     System.out.println("Obwód koła: " + circle.calculatePerimeter());
     System.out.println("Współrzędne środka kolorowego koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
     System.out.println("Promień kolorowego koła: " + coloredCircle.getRadius());
     System.out.println("Kolor koła: " + coloredCircle.getColor());
     System.out.println("Obwód kolorowego koła: " + coloredCircle.calculatePerimeter());
    }
}