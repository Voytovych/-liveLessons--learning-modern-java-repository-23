package coreservlets;

import java.util.*;

public class PolygonTest {
  public static void main(String[] args) {
    RegularPolygon[] polygons = { new EquilateralTriangle(10), new EquilateralTriangle(5), new Square(10), new Square(5) };
    System.out.printf("Polygons=%s%n.", Arrays.asList(polygons));
    System.out.printf("Total number of sides=%s%n.", RegularPolygon.totalSides(polygons));
  }
}
