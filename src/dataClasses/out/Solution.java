//package dataClasses.out;
//
//import dataClasses.in.Intersection;
//
//import java.util.List;
//
//public class Solution {
//  public int numberOfIntersections;
//  public List<Intersection> listOfIntersection;
//
//  public int numOfScheduledIntersections(){
//    int n = 0;
//    for (Intersection inter : listOfIntersection){
//      if (!inter.isUnchanged()) {
//        // 如果有变化
//        n += 1;
//      }
//    }
//    return n;
//  }
//}
