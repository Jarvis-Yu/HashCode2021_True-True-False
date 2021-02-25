package dataClasses.in;

import java.util.List;

public class Car {
  public List<String> streets;
  public int index;
  public final int pathLength;

  public InStructure inStructure;

  public Car(List<String> streets, int pathLength, InStructure inStructure) {
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
      inStructure.steetMap.get(streets.get(index)).addCar(this);
    }
  }
}
