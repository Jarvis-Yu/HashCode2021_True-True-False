package dataClasses.in;

import java.util.Arrays;
import java.util.List;

public class Car {
  public String[] streets;
  public int index;
  public final int pathLength;

  public InStructure inStructure;

  public Car(String[] streets, int pathLength, InStructure inStructure) {
    this.streets = streets;
    this.index = 0;
    this.pathLength = pathLength;
    this.inStructure = inStructure;
  }

  public int remainingLength() {
    return  pathLength - index;
  }

  public void moveToNextStreet (){
    // TODO: move out of original street
    index += 1;
    if (index < pathLength) {
      inStructure.streetMap.get(streets[index]).addCar(this);
    }
  }

  @Override
  public String toString() {
    return "Car{" +
        "streets=" + Arrays.toString(streets) +
        ", index=" + index +
        ", pathLength=" + pathLength +
        '}';
  }
}
