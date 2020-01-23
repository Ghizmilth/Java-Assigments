/**
  Program created and submitted by HIDANER FERRER
  November 11, 2019
*/

public class StringProcessor
{

  //PRIVATE PROGRAM VARIABLES
  private String str;
  private int count = 0;
  private String[] strArray;
  private String noSpaceStr;
  private String noVowelsStr;
  private String numString;
  private String[] digitWordsArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
  private String[] digitArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};


  //CONSTRUCTORS
  public StringProcessor()
  {
    str = "";
  }

  public StringProcessor(String s)
  {
    str = s;
  }

  //STRING SETTER
  public void setString(String s)
  {
    str = s;
  }

  //STRING GETTER
  public String getString()
  {
    return str;
  }

  //COUNT WORDS IN STRING
  public int wordCount()
  {
    strArray = str.split(" ");
    return strArray.length;
  }

  //COUNT UPPERCASE LETTERS IN STRING
  public int upperCaseCount()
  {
    count = 0;

    for(int i = 0; i <= str.length()-1; i++)
    {
      if(Character.isUpperCase(str.charAt(i)))
      {
        count++;
      }
    }
    return count;
  }

  //COUNT DIGITS IN STRING
  public int digitCount()
  {
    count = 0;
    for(int i = 0; i <= str.length()-1; i++)
    {
      if(Character.isDigit(str.charAt(i)))
      {
        count++;
      }
    }
    return count;
  }

  //COUNTS DIGITS IN STRING
  public int digitWordCount()
  {
    count = 0;

    String tempStr = str.toLowerCase();
    String[] s2 = tempStr.split(" ");

    for (int i = 0; i < digitWordsArray.length; i++)
    {
      if(tempStr.contains(digitWordsArray[i]))
      {
        count++;
      }
    }

    return count;

  }

  //TAKES WHITESPACES OUT OF STRING
  public String getNoSpaceString()
  {
    String str2 = str.replace(" ", "");
    return str2;
  }

  //REPLACES VOWELS FOR DASHES
  public String getNoVowelString()
  {

    String str2 = str;
    str2 = str2.replaceAll("(?i)[aeiou]", "-");

    return str2;
  }

  //REPLACES DIGITS FOR WORDS
  public String getNoDigitWordString()
  {

    String s2 = str;

    for (int i = 0; i < digitWordsArray.length; i++)
    {
      s2 = s2.replaceAll("(?i)"+digitWordsArray[i], digitArray[i]);
    }

    return s2;
  }



}
