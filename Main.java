
import geometry.Rectangle;
import geometry.Square;

public class Main {
   public static void main (String[] args) {
       
    
             Rectangle rectangle = new Rectangle(8.0, 9.0);
             Square square = new Square(3.0);
     
        System.out.println("Długość prostokąta: " + rectangle.getLength());
        System.out.println("Szerokość prostokąta: " + rectangle.getWidth());
        System.out.println("Pole prostokąta: " + rectangle.calculateArea());
        System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());
        System.out.println("Długość boku kwadratu: " + square.getLength()); 
        System.out.println("Pole kwadratu: " + square.calculateArea()); 
        System.out.println("Obwód kwadratu: " + square.calculatePerimeter()); 
    }
} 