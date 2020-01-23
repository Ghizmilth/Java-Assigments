/**
  Assigment # 8 - Submitted and created by HIDANER FERRER
  Program that uses Aggregation, Multiple Constructors,
  Copy Constructors, toString Method and equals method.
*/


public class Circle
{

  private Point center;
  private double radius;




  public Circle(Point o, double r)
  {
      center = new Point(o);
      radius = r;
  }


  public Circle(double xValue, double yValue, double r)
  {
    center = new Point(xValue, yValue);
    radius = r;
  }

  public Circle()
  {
    center = new Point();
    radius = 1;
  }

  public Circle(Circle c)
  {
    center = new Point(c.getX(), c.getY());
    radius = c.getRadius();
  }

  public Point getCenter()
  {
    return center;
  }

  public void setCenter(Point p)
  {
    center = new Point(p);
  }


  public void setX(double value)
  {
      center.setX(value);
  }

  public double getX()
  {
    return center.getX();
  }

  public void setY(double value)
  {
    center.setY(value);
  }

  public double getY()
  {
    return center.getY();
  }

  public void setRadius(double value)
  {
    radius = value;
  }

  public double getRadius()
  {
      return radius;
  }

  public double getArea()
  {
      return (Math.PI * Math.pow(radius, 2));
  }

  public String toString()
  {
      return ("The elements of this circle are: "+
        "\nX value: " + center.getX() +
        "\nY value: " + center.getY() +
        "\nRadius value: " + this.getRadius()+"\n"
        );
  }

  public Boolean equals(Circle c)
  {
    if(center.equals(c.center) && radius == c.radius)
    {
      return true;
    }
    else
    {
      return false;
    }

  }

  public boolean doesOverlap(Circle c)
  {
    // double circleDistance = Math.sqrt(Math.pow((circleB.x-circleA.x), 2)+Math.pow((circleB.y - circleA.y), 2));

    double circleDistance = Math.sqrt(Math.pow((c.getX()-this.getX()), 2)+Math.pow((c.getY() - this.getY()), 2));


    if(circleDistance <= (this.getRadius() + c.getRadius()))
    {
      return true;
    } else
      return false;
  }

}
