package io;

import dataClasses.in.Intersection;
import dataClasses.out.Solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import dataClasses.out.Solution;

public class Formatter {


  public static void formatter(List<Intersection> listOfIntersection) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(numOfScheduledIntersections(listOfIntersection));
    stringBuilder.append("/n");
    for (Intersection intersection : listOfIntersection){
      stringBuilder.append()
    }
  }

  public static int numOfScheduledIntersections(List<Intersection> listOfIntersection){
    int n = 0;
    for (Intersection inter : listOfIntersection){
      if (!inter.isUnchanged()) {
        // 如果有变化
        n += 1;
      }
    }
    return n;
  }

  public static void writeFile(String filePath, List<String> data) {
    File file = new File(filePath);
    try {
      if (file.createNewFile() && file.exists()) {
        FileWriter fw = new FileWriter(file);
        data.forEach(
            line -> {
              try {
                fw.write(line);
                fw.write("\n");
              } catch (IOException e) {
                System.out.println("创建文件出错");
                e.printStackTrace();
              }
            }
        );
        fw.close();
      }
    } catch (Exception e) {
      System.out.println("创建文件出错");
      e.printStackTrace();
    }
  }
}
