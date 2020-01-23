public class MyCircle
{

  private double x;
  private double y;
  private double radius;
  private double area;

  /**
    The setX method stores a value in the
    circle's X axis
  */

  public void setX(double xValue)
  {
    x = xValue;
  }

  /**
    The setY method stores a value in the
    circle's Y axis
  */

  public void setY(double yValue)
  {
    y = yValue;
  }

  /**
    The setRadius method stores a value in the
    circle's radius
  */

  public void setRadius(double radiusValue)
  {
    radius = radiusValue;
  }

  /**
    The getArea method uses the variables declared in the class
    and calculates the Area of the circle. It returns a double
    variable.
  */

  public double getArea()
  {
    return (area = Math.PI * Math.pow(radius, 2));
  }

  /**
    The doesOverlap method uses calculates the distance
    between two circles and returns a Boolean if the circles
    overlap
  */

  public boolean doesOverlap(MyCircle obj)
  {
    // double circleDistance = Math.sqrt(Math.pow((circleB.x-circleA.x), 2)+Math.pow((circleB.y - circleA.y), 2));

    double circleDistance = Math.sqrt(Math.pow((obj.x-this.x), 2)+Math.pow((obj.y - this.y), 2));


    if(circleDistance <= (this.radius + obj.radius))
    {
      return true;
    } else
      return false;
  }

}
