
import geometry.Circle; 
import geometry.Point; 
import geometry.ColoredCircle;

public class Main {
   public static void main (String[] args) {
       
    
     Circle[] circles = new Circle[2];

     circles[0] = new Circle(new Point(2.0, 3.0), 5.0, 0);
     circles[1] = new ColoredCircle(new Point(5.0, 7.0), 3.0, "czerwony");

     for (Circle circle : circles) {
         double area = circle.calculateArea();
         System.out.println("Pole powierzchni koła: " + area);

         if (circle instanceof ColoredCircle) {
             String color = ((ColoredCircle) circle).getColor();
             System.out.println("Kolor koła: " + color);
   
   
    }
}
}}
   
   