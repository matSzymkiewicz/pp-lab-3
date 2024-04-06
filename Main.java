
import geometry.Circle; 
import geometry.Point; 

public class Main {
   public static void main (String[] args) {
       Point center = new Point(3.5, 2.0);
       Point point = new Point(3.5, 2.0);
     Circle circle = new Circle(center, 4,0); 
     
     System.out.println("Współrzędna x: " + point.getX());
     System.out.println("Współrzędna y: " + point.getY());
     System.out.println("Współrzędne środka koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
     System.out.println("Promień koła: " + circle.getRadius());
     System.out.println("Obwód koła: " + circle.calculatePerimeter());
   }
}