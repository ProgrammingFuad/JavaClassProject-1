# JavaClassProject-1
CSCI161 First Java Project Completed

This was my first Project of Spring Semester 2016. This project is all written in Java and fufilled the requirements listed below by the instructor of the course.
I created basic objects and classes in order to fufill the requirements below. In order to run the project you must download all files including the TXT file.


Requirements:


Driver

Should read in a file with candidate data for 10 candidates (we will be making this requirement more flexible for OoL #2).  The input file will be formatted like Candidate.txt
Use the candidate data to create 10 candidates
Run through a loop 365 times.  Each time through the loop, randomly select one of the following actions:
Fundraising (70% weighted):
Create a Fundraiser for a randomly selected candidate
Use the fundraiser to generate money
Printout the fundraiser’s information
Debate (30% weighted):
Create a debate for 2 randomly selected candidates (Candidates MAY NOT debate themselves)
Declare the winner of the debate
Printout the debate’s information
Create an election using all 10 candidates
Determine who won the election
Print the String announcing who won the election


Candidate

Has a name
Has a campaign slogan
Has money (randomly start from $0 to $100, both points inclusive)
Is a member of a Political Party
Should be able to endorse things…This should be a method which returns a String “My name is XXX, and I approve this message”.  Where XXX should be replaced by the name of the candidate.

Debate

Has a location
Has 2 candidates (we will increase this limit in OoL #2)
Should be able to declare a winner by:
Randomly generating a number for candidate 1
Randomly generating a number for candidate 2
Determining which number is bigger
Transfer ALL of the losing candidate’s money to the winning candidate
Returning a String declaring the winner and by how many “points”.

Fundraiser

Has a location
Has 1 candidate
Has donors
Should be able to generate money by:
Randomly generating a number of donors who attended (0 to 200, both points inclusive)
For each donor, generate a random number (0 to  151, zero inclusive, 151 exclusive) to represent how much that donor contributes
Add the contributions to the candidate’s money

Election

Has a title (i.e. U.S. President)
Has 10 candidates (We will adjust this limit in OoL #2)
Determine a winner by:
Determining which candidate has the most money
If there is a tie, randomly select from the candidates who are tied with the most amount of money
Return a String announcing the name of the candidate who won, use this template “XXX Is the winner of the YYY election” where:
XXX is the winning candidate’s name
YYY is the election’s title


