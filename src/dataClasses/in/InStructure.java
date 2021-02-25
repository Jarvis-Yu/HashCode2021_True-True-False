package dataClasses.in;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InStructure {

  public Map<String, Street> steetMap = new HashMap<>();
  public List<Intersection> intersections = new ArrayList<>();

  public InStructure() {}

  public void addStreet(Street street) {};
}
