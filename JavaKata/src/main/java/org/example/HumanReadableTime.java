package org.example;

public class HumanReadableTime {

  public static void main(String[] args) {

  }

  public static String makeReadable(int seconds) {
    int secounds = 0;
    int minutes = 0;
    int hours = 0;
    while (seconds > 0) {
      if(secounds < 59) {
        secounds++;
      } else if (secounds == 59 && minutes < 59) {
        secounds = 0;
        minutes++;
      } else if (secounds == 59 && minutes == 59) {
        secounds = 0;
        minutes = 0;
        hours++;
      }
      seconds--;
    }
    String secR = secounds < 10 ? "0" + Integer.toString(secounds) : Integer.toString(secounds);
    String minR = minutes < 10 ? "0" + Integer.toString(minutes) : Integer.toString(minutes);
    String horR = hours < 10 ? "0" + Integer.toString(hours) : Integer.toString(hours);
      return String.format("%s:%s:%s",horR,minR,secR );
  }
}