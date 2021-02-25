package dataClasses.in;

import dataClasses.Pair;

import java.util.Queue;

public class Street {

  public final String streetName;
  public Queue<Pair<Car, Integer>> drivingCar;
  public Queue<Car> queueCars;
  public final int drivingTime;
<<<<<<< HEAD
  public final int startIntersection;
  public final int finalIntersection;

  public Street(String streetName, int startIntersection, int finalIntersection, Integer drivingTime) {
    this.streetName = streetName;
=======
  public final Intersection startIntersection;
  public final Intersection finalIntersection;

  public Street(Intersection startIntersection, Intersection finalIntersection, Integer drivingTime) {
>>>>>>> 7ca6579c4ed9f33a0c1cdac68d2a56f950d4fb72
    this.startIntersection = startIntersection;
    this.finalIntersection = finalIntersection;
    this.drivingTime = drivingTime;
  }

  // 模拟
  public void simulate(int currentTime) {}

  // 把传进来的车放到路口（先进先出）
  public void addCar(Car car) {};
}
