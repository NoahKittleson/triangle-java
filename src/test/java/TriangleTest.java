import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void isTriangle_equilateralTrianlge_equilateral() {
    Triangle myTriangle = new Triangle(3,3,3);
    assertEquals("Equilateral", myTriangle.getTriangleType());
  }
  @Test
  public void isTriangle_isoscelesTrianlge_isosceles() {
    Triangle myTriangle = new Triangle(4,3,3);
    assertEquals("Isosceles", myTriangle.getTriangleType());
  }
  @Test
  public void isTriangle_scaleneTrianlge_scalene() {
    Triangle myTriangle = new Triangle(4,3,5);
    assertEquals("Scalene", myTriangle.getTriangleType());
  }
  @Test
  public void isTriangle_notATrianlge_notATriangle() {
    Triangle myTriangle = new Triangle(4,3,20);
    assertEquals("Not a Triangle", myTriangle.getTriangleType());
  }
}
