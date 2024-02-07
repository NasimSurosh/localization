package com.localiyation;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
  /* Locale - will help us store the information or language, country etc..
   * ResourceBundle - will fetch the files to the Locale object.
   */

  public static void main(String[] args) {
    
    String language = "persion";
    String country = "AF";
    Locale locale = new Locale(language, country);
    
    ResourceBundle rb = ResourceBundle.getBundle("com.localiyation/config", locale);
    
    String s = rb.getString("BirthdayMSG");
    
    System.out.println(s);
    
    

  }

}
