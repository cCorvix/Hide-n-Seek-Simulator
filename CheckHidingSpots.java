import java.util.random.RandomGenerator;

public class CheckHidingSpots {
  public void checkHidingSpots(String[] args) throws InterruptedException {
    
    int hidingSpotChecked = RandomGenerator.getDefault().nextInt(1, 5);

    if (Integer.parseInt(Main.hidingSpotPicked) == hidingSpotChecked) {

      
      IO.println("The seeker is seeking...");
      Thread.sleep(6000);
      IO.println("Found you!");
      Thread.sleep(500);
      IO.println("YOU DIED...");

    } else {

      IO.println("The seeker is seeking...");
      Thread.sleep(6000);
      IO.println("You Win!");

    }


  }


}
