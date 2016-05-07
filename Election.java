/**
 * Fuad Mohamoud
 * Computer Science II
 * 01/29/2106
 */
import java.util.Random;
public class Election
{
     private String title = "DEFAULT";
     private Candidate[] candidates = new Candidate[10];
     private Random rand = new Random();
     
     /**
      * Takes in a title, and 10 candidates for the election.
      */
     public Election(String inTitle, Candidate inC1, Candidate inC2, Candidate inC3, Candidate inC4, Candidate inC5, Candidate inC6, Candidate inC7, Candidate inC8, Candidate inC9, Candidate inC10)
     {
          setTitle(inTitle);
          setCandidates(inC1, inC2, inC3, inC4, inC5, inC6, inC7, inC8, inC9, inC10);
     }
     
     /**
      * sets title to what we passed in via constructor parameter
      */
     public void setTitle(String inTitle)
     {
          title = inTitle;
     }
     
     /**
      * returns title
      */
     public String getTitle()
     {
          return title;
     }
    
     /**
      * sets candidates equal to index of an array 
      */
     public void setCandidates(Candidate inC1, Candidate inC2, Candidate inC3, Candidate inC4, Candidate inC5, Candidate inC6, Candidate inC7, Candidate inC8, Candidate inC9, Candidate inC10)
     {
          //Spec for OoL #1 didn't say to ensure uniqueness for Election Candidates
          //Ergo, I didn't check for that yet!
          candidates[0] = inC1;
          candidates[1] = inC2;
          candidates[2] = inC3;
          candidates[3] = inC4;
          candidates[4] = inC5;
          candidates[5] = inC6;
          candidates[6] = inC7;
          candidates[7] = inC8;
          candidates[8] = inC9;
          candidates[9] = inC10;
     }
     
     /**
      * Returns candidates from candidates array
      */
     public String getCandidates()
     {
          String output = "";
          for (int x = 0; x < candidates.length - 1; x++)
          {
               output = output + candidates[x].getName() + ", ";
          }
          output = output + candidates[9].getName();
          return output;
     }
    
     /**
      * Declares a winner by
      * checking who has the most money
      */
     public String declareWinner()
     {
          Candidate winner = candidates[0];
          for (int x = 1; x < candidates.length; x++)
          {
               if (winner.getMoney() < candidates[x].getMoney())
               {
                    winner = candidates[x];
               }
               else if (winner.getMoney() == candidates[x].getMoney())
               {
                    if(rand.nextInt(2) == 1)
                    {
                         winner = candidates[x];
                    }
               }
          
          }
          
          return winner.getName() + " is the winner of the " + getTitle() + " election";
     }
     
}