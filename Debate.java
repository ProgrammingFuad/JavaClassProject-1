/**
 * Fuad Mohamoud
 * Computer Science II
 * 01/29/2106
 */
import java.util.Random;
public class Debate
{
     private String location = "DEFAULT";
     private Candidate[] candidates = new Candidate[2];
     private Random rand = new Random();
     
     /**
      * Debate Constructor takes in Location
      * along with 2 candidates that will be
      * debating
      */
     public Debate(String inLoc, Candidate inC1, Candidate inC2)
     {
          setLocation(inLoc);
          setCandidates(inC1, inC2);
     }
     
     /**
      * Sets location equal to one provided in constructor
      */
     public void setLocation(String inLoc)
     {
          location = inLoc;
     }
     
     /**
      * Returns location
      */
     public String getLocation()
     {
          return location;
     }
     
     /**
      * Takes in two candidates. First checks to see if they are equal
      * We dont want the same candidate debating him or herself.
      * Then if all is good, we set each candidate to a index in an Array.
      */
     public void setCandidates(Candidate inC1, Candidate inC2)
     {
          if (inC1 == inC2) //Same place in memory, must be same Candidate!
          {
               return; //No self debates!!!
          }
          candidates[0] = inC1;
          candidates[1] = inC2;
     }
     
     /**
      * Returns Candidates Debating
      */
     public String getCandidates()
     {
          return candidates[0].getName() + " VERSUS " + candidates[1].getName();
     }
     
     /**
      * Sets two variables to random numbers
      * The greater number determines who won or lost the debate
      * Winning Candidate gets the losing candidates money
      * Losing Candidate gets money set to zero. 
      */
     public String declareWinner()
     {
          int c1Points = 0;
          int c2Points = 0;
          
          while (c1Points == c2Points)
          {
               c1Points = rand.nextInt(100);
               c2Points = 100 - c1Points;
          }
          
          if (c1Points > c2Points)
          {
               candidates[0].addMoney(candidates[1].getMoney());
               candidates[1].addMoney(-1 * candidates[1].getMoney());
               return candidates[0].getName() + " won the debate by " + (c1Points - c2Points) + " points.";
          }
          else
          {
               candidates[1].addMoney(candidates[0].getMoney());
               candidates[0].addMoney(-1 * candidates[0].getMoney());
               return candidates[1].getName() + " won the debate by " + (c2Points - c1Points) + " points.";
          }
     }
     
}