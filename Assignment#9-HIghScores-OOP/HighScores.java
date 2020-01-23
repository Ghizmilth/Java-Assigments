/**
Program created and submitted by Hidaner Ferrer

The purpose of this program is to create an OOP class to create
HighScores objects for a program that shows scores from mannually input scorers
by the program user
*/

public class HighScores
{
  
  private String name; //Variable to hold name of scorer
  private int score; //Variable to hold the value of scores

  //Constructor to initialize the array of HighScores objects with Name, Score keys:values
  public HighScores(String n, int s)
  {
    name = n;
    score = s;
  }

  //Sets the name of the scorer in the HighScores object
  public void setName(String n)
  {
    name = n;
  }

  //Sets the score value in the HighScores object
  public void setScore(int s)
  {
    score = s;
  }

  //Gets name of the scorer stored in the HighScores object
  public String getName()
  {
    return name;
  }

  //Gets the score value from the HighScores object
  public int getScore()
  {
    return score;
  }

}
