package dataClasses.in;

import dataClasses.Pair;

import java.util.Queue;

public class Street {

  public Queue<Pair<Car, Integer>> drivingCar;
  public Queue<Car> queueCars;
  public final Integer drivingTime;
  public final TrafficLight startIntersection;
  public final TrafficLight finalIntersection;

  public Street(TrafficLight startIntersection, TrafficLight finalIntersection, Integer drivingTime) {
    this.startIntersection = startIntersection;
    this.finalIntersection = finalIntersection;
    this.drivingTime = drivingTime;
  }

  public void simulate() {}

  public void addCar(Car car) {};
}
