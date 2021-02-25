package io;

import dataClasses.out.Solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Formatter {

  public static void formatter(Solution out) {

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
