 
import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class Driver
{
     public static void main(String[] args) throws FileNotFoundException
     {
          File cList = new File("/Users/fuadmohamoud/Documents/Candidate.txt");
          Scanner cScanner = new Scanner(cList);
          
          Candidate[] candidates = new Candidate[10];
          
          int cCounter = 0;
          while(cScanner.hasNext())
          {
               String line = cScanner.nextLine();
               String[] token = line.split("1");
               candidates[cCounter] = new Candidate(token[0],token[1],token[2]);
               cCounter++;
          }
          cScanner.close();
          
          Random rand = new Random();
          for (int x = 0; x < 365; x++)
          {
               if (rand.nextInt(100) < 70)
               {
                    Fundraiser funds = null;
                    String place = "THIS PLACE";
                    cCounter = rand.nextInt(10);
                    funds = new Fundraiser(place, candidates[cCounter]);
                    System.out.print("The fundraiser at " + funds.getLocation() + " increased " + funds.getCandidate().getName() + "'s funds from $" + funds.getCandidate().getMoney() + " to $");
                    funds.raiseMoney();
                    System.out.println(funds.getCandidate().getMoney());
               }
               else
               {
                    Debate debating = null;
                    String place = "THIS PLACE";
                    Candidate one = null;
                    Candidate two = null;
                    while (one == two) //If same memory location, probably same Candidate
                    {
                         cCounter = rand.nextInt(10);
                         one = candidates[cCounter];
                         
                         cCounter = rand.nextInt(10);
                         two = candidates[cCounter];
                    }
                    debating = new Debate(place, one, two);
                    System.out.println("New Debate: " + debating.getCandidates() + ": " + debating.declareWinner());
               }
          }
          
          Election presidental = new Election("U.S. President", candidates[0], candidates[1], candidates[2], candidates[3], candidates[4], candidates[5], candidates[6], candidates[7], candidates[8], candidates[9]);
          System.out.println(presidental.declareWinner());
          
          for (int x = 0; x < candidates.length; x++)
          {
               System.out.println(candidates[x].getName() + " has " + candidates[x].getMoney());
          }
     }
     

}