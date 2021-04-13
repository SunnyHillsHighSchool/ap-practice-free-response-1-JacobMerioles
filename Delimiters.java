import java.util.*;

public class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}
  //Programmer: Jacob Merioles
	public ArrayList<String> getDelimitersList(String[] tokens)
	{
    //create delimiters ArrayList
		ArrayList<String> delimiters = new ArrayList<String>();
    //loop through tokens
    for (int i = 0; i < tokens.length; i++)
      /*if (tokens.get(i).equals(openDel) || tokens.get(i).equals(closeDel))
        delimiters.add(tokens.get(i));*/
      //Error: I used get() method for an ArrayList, but tokens is just an array
      //if the current token equals an open/closeDel, then add it to delimiters
      if (tokens[i].equals(openDel) || tokens[i].equals(closeDel))
        delimiters.add(tokens[i]);
    //return delimiters
    return delimiters;
	}
  //Programmer: Jacob Merioles
	public boolean isBalanced(ArrayList<String> delimiters)
	{
    //set var = 0
    int var = 0;
    //loop through delimiters
    for (int i = 0; i < delimiters.size(); i++){
      //if current equals openDel, var++
      if (delimiters.get(i).equals(openDel))
        var++;
      //if current equals closeDel, var--, and it should balance out var to 0
      if (delimiters.get(i).equals(closeDel))
        var--;
      //var shouldn't be over 0 if it is balanced
      if (var < 0)
        return false;
    }
    //return var
    return (var == 0);
  }
}