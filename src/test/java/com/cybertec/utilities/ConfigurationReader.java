package com.cybertec.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- we create properties object
   private static Properties properties = new Properties();

   static {
       //2 -get the path and store in String , or directly pass into fileInputStream obj
       String path = "configuration.properties";
       try {
           //3 need to open the file
           FileInputStream file = new FileInputStream(path);
           //4-need to load the file
           properties.load(file);
           //5 - close.file
           file.close();
       } catch (IOException e) {
           System.out.println("Properties file not found");
       }

   }

   public static String getProperty(String keyWord){
       return properties.getProperty(keyWord);
   }

}
