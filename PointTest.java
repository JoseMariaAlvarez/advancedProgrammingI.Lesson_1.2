public class PointTest {
  public static void main(String [] args){
    Point p1, p2;
    p1 = new Point(1, 1);
    p2 = new Point(1, 1);
    System.out.println("Distance between points is: " + p1.distance(p2));
    System.out.println("Moving first point (+2, +3).");
    p1.move(2.0, 3.0);
    System.out.println("Distance between points is: " + p1.distance(p2));
  }
}
