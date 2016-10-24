import java.util.Scanner;

public class AdventureStory
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Choose A to go right to the lake or B to go left to the amusment park: ");
    String c1 = sc.next();
    if(c1.equals("A")){
      System.out.print("Choose A to swim in the lake or B to meet a clown: ");
      String c2 = sc.next();
      if(c2.equals("A")){
        System.out.print("Choose A to dive down in the lake and get a shell or B to take a selfie with a clown: ");
        String c3 = sc.next();
        if(c3.equals("A")){
          System.out.println("You drown as you try to get a shell .");
        }
        else{
          System.out.println("You get a shell and bring it home.");
        }
      }
      else{
        System.out.print("Choose A to ride a bike or B to continue running: ");
        String c3 = sc.next();
        if(c3.equals("A")){
          System.out.println("You try to ride your bike and you fall and break your skull.");
        }
        else{
          System.out.println("You fall off your bike and break a leg.");
        }
      }
    }
    else{
      System.out.print("Choose A to go to the movies or B to go to the beach: ");
      String c2 = sc.next();
      if(c2.equals("A")){
        System.out.print("Choose A to watch a movie or B to sleep during the movie: ");
        String c3 = sc.next();
        if(c3.equals("A")){
          System.out.println("Nice job. You watched a movie.");
        }
        else{
          System.out.println("You sleep forever and never wake up.");
        }
      }
      else{
        System.out.print("A cop pulls you over. Choose A to pull over or B to drive away: ");
        String c3 = sc.next();
        if(c3.equals("A")){
          System.out.println("You get a 100000 fine for no reason.");
        }
        else{
          System.out.println("You rollover and skid off a bridge to your death.");
        }
      }
    }
  }
}