public class NumberGuesser
{
  //DECLARATION OF PRIVATE VARIABLES
  private int mainLowerBound; // variable to store original lower range
  private int mainUpperBound; // variable to store original higher value
  private int lowerBound; // varibel to store the lower bound guess number
  private int upperBound; // varibale to tore the uper bound guess number
  private int midPoint; // Stores midpoint of our guess game
  private int numberGuess; // stores the new guess number to show to user


  //METHOD TO SET THE VALUES OF OUR VARIABLES LOW AND HIGH BOUND
  public NumberGuesser(int low, int high)
  {
    mainLowerBound = low;
    lowerBound = mainLowerBound;
    mainUpperBound = high;
    upperBound = mainUpperBound;
  }

  //METHOD TO GET OUR LOWER RANGE BOUND
  public int getLowRange()
  {
    return lowerBound;
  }

  //METHOD TO GET OUR HIGHER RANGE BOUND
  public int getUpperRange()
  {
    return upperBound;
  }

  // METHOD TO SET THE NEW HIGH RANGE
  public void higher()
  {
    lowerBound = midPoint+1;
  }

  // METHOD TO SET THE NEW LOW RANGE
  public void lower()
  {
    upperBound = midPoint-1;
  }

  // METHOD TO GET THE CURRENT GUESS NUMBER TO SHOW TO USER, RETURNS AN INTEGER VALUE
  public int getCurrentGuess()
  {
    midPoint = (int)((lowerBound+upperBound)/2);
    return midPoint;
  }

  // METHOD RESETS THE GAME TO ITS ORIGINAL STATE AFTER THE USER WANTS TO PLAY AGAIN
  public void reset(){
    lowerBound = mainLowerBound;
    upperBound = mainUpperBound;
  }

}
