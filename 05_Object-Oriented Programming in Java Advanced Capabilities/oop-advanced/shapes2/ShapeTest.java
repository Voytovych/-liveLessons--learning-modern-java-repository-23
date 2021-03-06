package shapes2;

/** Tests using mixed Shape types and the static sumAreas method.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ShapeTest {
  public static void main(String[] args) {
    Shape[] shapes = { new Circle(10),            // Area is about 314.159
                       new Rectangle(5, 10),      // Area is 50
                       new Square(10) };          // Area is 100
    System.out.println("Sum of areas: " +
                       ShapeUtils.sumAreas(shapes));  // Area is about 464.159
  }
}