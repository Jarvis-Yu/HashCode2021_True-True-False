package algorithms.tony;

import dataClasses.in.*;

public class SimulateAnnealling {

  public static InStructure initialize(){


  }

  public static Solution update(Solution current){

  }

  public static int[] algo(InStructure structure){
    double T = 100;
    double T_min = 10;
    double r = 0.9999;
    int[] current = initialize(structure);
    int[] next;
    int dE;
    int count = 0;

    while(T > T_min){
      next = update(structure, current);

      dE = objectiveFunction(structure, next) - objectiveFunction(structure, current);

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
}
