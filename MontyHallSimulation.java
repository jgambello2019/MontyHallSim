import java.util.Scanner;


public class MontyHallSimulation
{
/**
*This method simulates a Monty Hall and returns
*1 if the switch wins and returns 0 otherwise
*@author Jack Gambello
*@version 1.0
*/
	public static void main(String[] args)
	{
		String input = args[0];
		
		int numSim = Integer.parseInt(input);
		System.out.println(numSim);
		
		int switchWin = 0;
		
		for(int i = 0; i < numSim; i++)
			switchWin += game();
		
		double percentSwitchWin = format ((double) switchWin / numSim * 100);
		double percentStayWin = format (100 - percentSwitchWin);
		System.out.println("% switch win: " + percentSwitchWin);
		System.out.println("% stay win: " + percentStayWin);
	}
	
	/**
	*This methods takes in a double and truncates it 2 decimal places
	*@param d the double input to be truncated
	*@return double formatted to 2 decimal places
	*/
	public static double format(double d)
	{
		int temp = (int) (d * 100);
		return temp / 100.0;

	}
	
	/**
	*This method creates random ints between 1 and 3 for the userPicka and car then compares them.
	*@return 0 if they equal each other (meaning the stay wins) returns 1 if they don't (meaning the switch wins)
	*/
	
	
	public static int game()
	{
		int car = ((int) (Math.random() * 3 + 1));
		int userPick = ((int) (Math.random() * 3 + 1));
		
		if (car == userPick)
			return 0;
		else
			return 1;
	}
}