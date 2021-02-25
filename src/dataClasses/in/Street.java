package dataClasses.in;

import dataClasses.Pair;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Street {

  public final String streetName;
  public Queue<Pair<Car, Integer>> drivingCar = new ArrayDeque<>(); // 正在开的车
  public Queue<Car> queueCars = new ArrayDeque<>(); // 排队等的车
  public final int drivingTime; // 这条路开车通过需要的时间
  public final int startIntersection; // 开始的路口
  public final int finalIntersection; // 结束的路口

  public Street(String streetName, int startIntersection, int finalIntersection, int drivingTime) {
    this.streetName = streetName;
    this.startIntersection = startIntersection;
    this.finalIntersection = finalIntersection;
    this.drivingTime = drivingTime;
  }

  public String getStreetName() {
    return streetName;
  }

  // 模拟
  public void simulate(int currentTime) {}

  // 把传进来的车放到路口（先进先出）
  public void addCar(Car car) {

  }

  // 将第一个正在路口等的车开出去
  public void nextCarLeave() {};

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append(String.format(
        "%s : %s -> %s; length = %s",
        streetName, startIntersection, finalIntersection, drivingTime));
    s.append(String.format("%nWaiting Cars:"));
    for (Car car : queueCars) {
      s.append(String.format("%n%s", car));
    }
    s.append(String.format("%nDriving Cars:"));
    for (Pair<Car, Integer> carIntegerPair : drivingCar) {
      s.append(String.format("%n%s; Entered at %s", carIntegerPair.first, carIntegerPair.second));
    }
    return s.toString();
  }
}
