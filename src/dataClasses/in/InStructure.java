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
}
