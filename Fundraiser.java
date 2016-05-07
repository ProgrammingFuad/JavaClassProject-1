/**
 * Fuad Mohamoud
 * Computer Science II
 * 01/29/2106
 */
import java.util.Random;
public class Fundraiser
{
     private String location = "DEFAULT";
     private Candidate candidate = null;
     private int donors;
     private Random rand = new Random();
     
     /**
      * Fundraiser constructor, takes in a Fundraiser
      * location along with a candidate
      */   
     public Fundraiser(String inLoc, Candidate inCandidate)
     {
          setLocation(inLoc);
          setCandidate(inCandidate);
          donors = rand.nextInt(201);
     }
     
     /**
      * Sets location equal to location provided
      */
     public void setLocation(String inLoc)
     {
          location = inLoc;
     }
     
     /**
      * returns location
      */
     public String getLocation()
     {
          return location;
     }
     
     /**
      * Sets Candidate to candidate provided
      */
     public void setCandidate(Candidate inCandidate)
     {
          candidate = inCandidate;
     }
     /**
      *returns Candidate
      */
     public Candidate getCandidate()
     {
          return candidate;
     }
     
     /**
      * returns random amount of donors created in
      * Fundraiser constructor
      */
     public int getDonors()
     {
          return donors;
     }
     
     /**
      * Gives each donor a random amount of money
      * Adds all that money together and add's it to
      * the Candidate we are doing fundraising for
      */
     public void raiseMoney()
     {
          int total = 0;
          for (int x = 0; x < donors; x++)
          {
               total += rand.nextInt(151);
          }
          candidate.addMoney(total);
     }
}