import java.util.*;
import java.util.random.RandomGenerator;

public class Main {
  
  public static String hidingSpotPicked = "null";

  public static void main(String[] args) throws InterruptedException {

    DeathScreen death = new DeathScreen(); 
    CheckHidingSpots check = new CheckHidingSpots();
       
    String input = "null";
    int secondCounter = 10;

    IO.println("Welcome to Hide 'n Seek Simulator! Type start to play, type credits to view credits.");
    input = IO.readln();

    if ("start".equalsIgnoreCase(input)) {

    while (secondCounter > 0) {

      IO.println(secondCounter);
      secondCounter -= 1;
      Thread.sleep(1000);

      if (secondCounter == 0) {

      IO.println("Ready or not, here I come!");

      IO.println("Pick a hiding spot: 1, 2, 3, 4");
      hidingSpotPicked = IO.readln();

      int lookedForOrNot = RandomGenerator.getDefault().nextInt(1, 9);

      if  (lookedForOrNot == 3) {

        IO.println("\nThey forgot to look for you");
        Thread.sleep(1000);
        death.deathScreen();

      } else {

        check.checkHidingSpots(args);

      }


      
    }

  }
  
} else if ("credits".equalsIgnoreCase(input)) {

  IO.println("\nCoded by Quinn Coffee and Declan Dacey. Coded on September 28th, 2026(9/28/2026). Hide 'n Seek Simulator V1.0.0. Programming language: JAVA 21. For additional information, please refer to this link: https://docs.google.com/document/d/1yNbFeywhzPnQXgdiycp4cWu2MNHAe14u4Sq5nJkj8D4/edit?tab=t.0");

}


  }


}
