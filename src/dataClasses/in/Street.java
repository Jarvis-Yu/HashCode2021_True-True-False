package dataClasses.in;

import dataClasses.Pair;

import java.util.Queue;

public class Street {

  public final String streetName;
  public Queue<Pair<Car, Integer>> drivingCar; // 正在开的车
  public Queue<Car> queueCars; // 排队等的车
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
  public void addCar(Car car) {};
}
