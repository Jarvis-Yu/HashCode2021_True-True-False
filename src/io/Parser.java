package io;

import dataClasses.in.InStructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Parser {

  public static InStructure getA(){return null;}
  public static InStructure getB(){return null;}
  public static InStructure getC(){return null;}
  public static InStructure getD(){return null;}
  public static InStructure getE(){return null;}

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

  public static InStructure parser() {
    return null;
  }
}
