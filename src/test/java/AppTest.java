import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Triangle finder");
  }
  @Test
  public void equilateralTest() {
    goTo("http://localhost:4567/");
    fill("#sideA").with("3");
    fill("#sideB").with("3");
    fill("#sideC").with("3");
    submit(".btn");
    assertThat(pageSource()).contains("Equilateral");
  }
  @Test
  public void isoscelesTest() {
    goTo("http://localhost:4567/");
    fill("#sideA").with("4");
    fill("#sideB").with("3");
    fill("#sideC").with("3");
    submit(".btn");
    assertThat(pageSource()).contains("Isosceles");
  }
  @Test
  public void scaleneTest() {
    goTo("http://localhost:4567/");
    fill("#sideA").with("4");
    fill("#sideB").with("3");
    fill("#sideC").with("5");
    submit(".btn");
    assertThat(pageSource()).contains("Scalene");
  }
  @Test
  public void notATriangleTest() {
    goTo("http://localhost:4567/");
    fill("#sideA").with("4");
    fill("#sideB").with("3");
    fill("#sideC").with("100");
    submit(".btn");
    assertThat(pageSource()).contains("Not a Triangle");
  }
}
