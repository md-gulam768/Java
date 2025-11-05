public class Volume {
                       // Method to calculate volume of a cube
public double calculateVolume(double side) {
return side * side * side;
}
// Method to calculate volume of a cuboid
public double calculateVolume(double length, double breadth, double height) {
return length * breadth * height;
}
// Method to calculate volume of a sphere
public double calculateVolume(float radius) {
return (4.0 / 3.0) * Math.PI * radius * radius * radius;
}
public static void main(String[] args) {
Volume v = new Volume();
// Cube with side 5
double cubeVolume = v.calculateVolume(5.0);
System.out.println("Volume of Cube: " + cubeVolume);
// Cuboid with length=5, breadth=4, height=3
double cuboidVolume = v.calculateVolume(5.0, 4.0, 3.0);
System.out.println("Volume of Cuboid: " + cuboidVolume);
// Sphere with radius=6
double sphereVolume = v.calculateVolume(6.0f); Write a Java program to simulate an Online Shopping Cart where 'Item' is a class with attributes (id, name, price). Create multiple items and calculate the total bill.
System.out.println("Volume of Sphere: " + sphereVolume);
}
}
