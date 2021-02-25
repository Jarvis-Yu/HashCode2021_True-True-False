package io;

import dataClasses.in.Intersection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Formatter {

  public static void formatter(List<Intersection> listOfIntersection, String filePath) {
    Intersection intersection;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(numOfScheduledIntersections(listOfIntersection));
    stringBuilder.append("\n");
    for (int i = 0; i < listOfIntersection.size(); i++) {
      stringBuilder.append(i);
      stringBuilder.append("\n");
      intersection = listOfIntersection.get(i);
      stringBuilder.append(numOfChanged(intersection));
      stringBuilder.append("\n");
      List<Integer> durations = intersection.durations;
      List<String> streets = intersection.streets;
      for (int j = 0; j < durations.size(); j++) {
        if (durations.get(j) != 0) {
          stringBuilder.append(streets.get(j));
          stringBuilder.append(" ");
          stringBuilder.append(durations.get(j));
          stringBuilder.append("\n");
        }
      }
    }
    // 为了match filewritter, 所以我用了一个list
    List<String> output = new ArrayList<>();
    output.add(stringBuilder.toString());
    writeFile(filePath, output);
  }

  public static int numOfChanged(Intersection inter) {
    List<Integer> durations = inter.durations;
    int n = 0;
    for (int d : durations) {
      if (d != 0) {
        n += 1;
      }
    }
    return n;
  }

  public static boolean isUnchanged(Intersection inter) {
    List<Integer> durations = inter.durations;
    boolean answer = true;
    for (int d : durations) {
      answer = answer && (d == 0);
    }
    return answer;
  }

  public static int numOfScheduledIntersections(List<Intersection> listOfIntersection) {
    int n = 0;
    for (Intersection inter : listOfIntersection) {
      if (!isUnchanged(inter)) {
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
            });
        fw.close();
      }
    } catch (Exception e) {
      System.out.println("创建文件出错");
      e.printStackTrace();
    }
  }
}
