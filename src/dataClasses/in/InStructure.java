package dataClasses.in;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InStructure {

  public Map<String, Street> streetMap = new HashMap<>();
  public List<Intersection> intersections = new ArrayList<>();

  public InStructure() {}

  // constants in the simulation

  public int simulationLength; // # of seconds
  public int bonusPointPerCar; // # of points for each car reaching the goal
  public int point = 0; // total points at the time

  public void addStreet(Street street) {
    streetMap.put(street.getStreetName(), street);
  }

  public void addIntersection (Intersection intersection) {
    intersections.add(intersection);
  };

  /** @return 返回值不会直接更改intersection*/
  public List<Intersection> getIntersectionsSafe() {
    List<Intersection> output = new ArrayList<>();
    output.addAll(intersections);
    return output;
  }

  public void setIntersections(List<Intersection> intersections) {
    this.intersections = intersections;
  }

  // 我需要另一个方法，获得分数

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append(String.format("%n%nIntersections: %n"));
    for (Intersection intersection : intersections) {
      s.append(String.format("%s%n%n", intersection));
    }
    s.append(String.format("%n%nStreets: %n"));
    for (Street street : streetMap.values()) {
      s.append(String.format("%s%n%n", street));
    }
    return s.toString();
  }
}
