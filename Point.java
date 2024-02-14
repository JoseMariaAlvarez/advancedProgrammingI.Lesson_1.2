class Point {

  private double x, y;

  public Point() {
    x = y = 0;
  }

  public Point(double a, double b) {
    x = a;
    y = b;
  }

  public double abscissa() {
    return x;
  }

  public double ordinate() {
    return y;
  }

  public void abscissa(double a){ 
    x = a;
  }

  public void ordinate(double b){
    y = b;
  }

  public void move(double a, double b) {
    x += a; y += b;
  }

  public double distance(Point pnt) {
    return Math.sqrt(Math.pow(x - pnt.x, 2) + Math.pow(y - pnt.y, 2));
  }

}

