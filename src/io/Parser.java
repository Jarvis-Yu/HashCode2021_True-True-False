package io;

import dataClasses.in.InStructure;
import dataClasses.in.TrafficLight;

import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Parser {

  public static InStructure getA(){return null;}
  public static InStructure getB(){return null;}
  public static InStructure getC(){return null;}
  public static InStructure getD(){return null;}
  public static InStructure getE(){return null;}

  public static void main(String[] args) {
    List<String> res = new ArrayList<>(List.of("abc", "def"));
    var homeDir = FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath();
    writeFile(homeDir + "/Desktop/foo.txt", res);
  }

  public static List<String> readFile(String filePath) {
    List<String> list = new ArrayList<>();
    try {
      File file = new File(filePath);
      if (file.isFile() && file.exists()) {
        InputStreamReader read = new InputStreamReader(new FileInputStream(file));
        BufferedReader bufferedReader = new BufferedReader(read);
        String lineTxt;
        while ((lineTxt = bufferedReader.readLine()) != null) {
          list.add(lineTxt);
        }
        bufferedReader.close();
        read.close();
      }
    } catch (Exception e) {
      System.out.println("读取文件内容出错");
      e.printStackTrace();
    }
    return list;
  }

  public static InStructure parser(List<String> raw) {
    var fstLine = raw.get(0).split(" ");
    var timeLength = Integer.valueOf(fstLine[0]);
    var interNo = Integer.valueOf(fstLine[1]);
    var stNo = Integer.valueOf(fstLine[2]);
    var carNo =  Integer.valueOf(fstLine[3]);
    var bonus = Integer.valueOf(fstLine[4]);
    TrafficLight[] trafficLights = new TrafficLight[interNo];

    for (int i = 1; i < raw.size(); i++) {
      var line = raw.get(i).split(" ");
      var inter1 = trafficLights[Integer.parseInt(line[0])];
      var inter2 = trafficLights[Integer.parseInt(line[1])];
      var street = line[2];
      var weight = Integer.parseInt(line[3]);
      inter1.streets.add(street);
      inter1.durations.add(0);
      inter2.streets.add(street);
      inter2.durations.add(0);
    }

    return null;
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
