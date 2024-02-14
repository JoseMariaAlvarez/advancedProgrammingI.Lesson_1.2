public class Segment {

  private Point origin, end;

  public Segment(Point pnt1, Point pnt2) { 
    origin = pnt1;
    end = pnt2;
  }

/*
public Segment(Point pnt1, Point pnt2) { 
    origin = new Point(pnt1.x(), pnt1.y());
    end = new Point(pnt2.x(), pnt2.y());
  }
*/

  // Other methods ...

  public double length() {
    return origin.distance(end);
  }
}
