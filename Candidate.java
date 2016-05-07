/**
 * Fuad Mohamoud
 * Computer Science II
 * 01/29/2106
 */
import java.util.Random;
public class Candidate
{
     private String name = "DEFAULT";
     private String slogan = "DEFAULT";
     private int money;
     private String party = "DEFAULT";
     private Random rand = new Random();
     
     
     /**
      * Candidate constructor takes in name, slogan, and party affiliation.
      */
     public Candidate(String inName, String inSlogan, String inParty)
     {
          setName(inName);
          setSlogan(inSlogan);
          setParty(inParty);
          money = rand.nextInt(101);
     }
     
     /**
      * Sets Name
      */
     public void setName(String inName)
     {
          name = inName;
     }
     
     /**
      * gets name
      */
     public String getName()
     {
          return name;
     }
     
     /**
      * Sets slogan
      */
     public void setSlogan(String inSlogan)
     {
          slogan = inSlogan;
     }
     
     /**
      * Returns Slogan
      */
     public String getSlogan()
     {
          return slogan;
     }
     
     /**
      * Sets party
      */
     public void setParty(String inParty)
     {
          party = inParty;
     }
     
     /**
      * returns party
      */
     public String getParty()
     {
          return party;
     }
     
     /**
      * returns random money set for each candidate 
      * in constructor.
      */
     public int getMoney()
     {
          return money;
     }
     
     /**
      * Adding Money method, which is needed for debates and Fundraisers later
      */
     public void addMoney(int newMoney)
     {
          money += newMoney;
     }
     
     /**
      * Returns a String with Candidates name and a Endorsement Message.
      */
     public String endorse()
     {
          return "My name is " + getName() + " and I approve this message";
     }
}