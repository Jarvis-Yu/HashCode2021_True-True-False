package simulation;

import dataClasses.in.InStructure;
import dataClasses.in.Intersection;
import dataClasses.out.Solution;
import io.Parser;

public class Simulation {



  public static int Score(Solution solution, InStructure map){
    InStructure inStructure = Parser.parser(Parser.readFile("data/in/b.txt"));

    for (int time = 0; time < inStructure.simulationLength; time ++){
      for (String streetName : inStructure.streetMap.keySet()) {
        inStructure.streetMap.get(streetName).simulate(time);
      }
      for (Intersection intersection : inStructure.intersections) {
        intersection.simulate(time);
      }
    }

    return inStructure.point;
  }

  public static void main(String[] args) {
    System.out.println(Score(new Solution(), new InStructure()));
  }
}
