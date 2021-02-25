package algorithms.tony;

import dataClasses.in.*;

import java.util.List;

public class SimulateAnnealling {

  private static int randInt(int min, int max){
    double x = (Math.random()*((max-min)))+min;
    return (int) x;
  }

  public static List<Intersection> algo(InStructure structure){
    double T = 100;
    double T_min = 10;
    double r = 0.9999;
    List<Intersection> current;
    List<Intersection> next;
    int dE;
    int count = 0;

    while(T > T_min){
      current = structure.getIntersectionsSafe();

      int currentScore = objectiveFunction(structure);
      next = update(current);
      structure.setIntersections(next);
      int nextScore = objectiveFuntion(structure);

      dE = nextScore - currentScore;

      if (dE >= 0){
        current = next;
      }else if (Math.exp(dE / T) > Math.random() ){
        current = next;
      }
      T = r * T;
      count += 1;
      if (count % 230 == 0){
        System.out.print(".");
      }
      if (count % 2300 == 0){
        System.out.println("#");
      }
    }

    System.out.println(count);
    return current;
  }



  public static List<Intersection> update(List<Intersection> intersections){
    int indexOfChange = randInt(0, intersections.size());
    Intersection target = intersections.get(indexOfChange);
    List<Integer> durations = target.durations;
    int range = 3;
    for (int i = 0; i < durations.size(); i++) {
      durations.set(i, randInt(0,range));
    }
    return intersections;
  }
}
