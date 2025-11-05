public class Triangle {
                           private double side1;
private double side2;
private double side3;
// Parameterized constructor
public Triangle(double side1, double side2, double side3) {
this.side1 = side1;
this.side2 = side2;
this.side3 = side3;
}
// Method to calculate the perimeter
public double getPerimeter() {
return side1 + side2 + side3;
}
// Method to calculate the area using Heron's formula
public double getArea() {
double s = getPerimeter() / 2.0;
return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
}
// Method to display the area and perimeter
public void display() {
System.out.println("Perimeter of triangle: " + getPerimeter());
System.out.println("Area of triangle: " + getArea());
}
// Main method to test the Triangle class
public static void main(String[] args) {
// Create a triangle with sides 3, 4, and 5
Triangle t = new Triangle(3, 4, 5);
  t.display();
 }
}
