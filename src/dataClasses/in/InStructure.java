package dataClasses.in;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InStructure {

  public Map<String, Street> streetMap = new HashMap<>();
  public List<Intersection> intersections = new ArrayList<>();

  public InStructure() {}

  public void addStreet(Street street) {
    streetMap.put(street.getStreetName(), street);
  };

  public void addIntersection (Intersection intersection) {
    intersections.add(intersection);
  };

  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append(String.format("%n%nIntersections: %n"));
    for (Intersection intersection : intersections) {
      s.append(intersection);
    }
    s.append(String.format("%n%nStreets: %n"));
    for (Street street : streetMap.values()) {
      s.append(street);
    }
    return s.toString();
  }
}
