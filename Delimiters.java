//Programmer: Jacob Merioles
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

	public ArrayList<String> getDelimitersList(String[] tokens)
	{
		ArrayList<String> delimiters = new ArrayList<String>();
    for (int i = 0; i < tokens.length; i++)
      /*if (tokens.get(i).equals(openDel) || tokens.get(i).equals(closeDel))
        delimiters.add(tokens.get(i));*/
      //Error: I used get() method for an ArrayList, but tokens is just an array
      if (tokens[i].equals(openDel) || tokens[i].equals(closeDel))
        delimiters.add(tokens[i]);
    return delimiters;
	}

	public boolean isBalanced(ArrayList<String> delimiters)
	{
    int var = 0;
    for (int i = 0; i < delimiters.size(); i++){
      if (delimiters.get(i).equals(openDel))
        var++;
      if (delimiters.get(i).equals(closeDel))
        var--;
      if (var < 0)
        return false;
    }
    return (var == 0);
  }
}