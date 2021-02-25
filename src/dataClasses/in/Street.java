package dataClasses.in;

import dataClasses.Pair;

import java.util.Queue;

public class Street {

  public final String streetName;
  public Queue<Pair<Car, Integer>> drivingCar;
  public Queue<Car> queueCars;
  public final int drivingTime;
  public final int startIntersection;
  public final int finalIntersection;

  public Street(String streetName, int startIntersection, int finalIntersection, Integer drivingTime) {
    this.streetName = streetName;
    this.startIntersection = startIntersection;
    this.finalIntersection = finalIntersection;
    this.drivingTime = drivingTime;
  }

  // 模拟
  public void simulate(int currentTime) {}

  // 把传进来的车放到路口（先进先出）
  public void addCar(Car car) {};
}
