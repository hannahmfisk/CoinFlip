import java.util.Scanner;

public class CointFlip {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	Scanner userInput = new Scanner (System.in);
	System.out.println("How many times should I flip a coin?");
	double totalFlips = userInput.nextDouble();
	double headsCounter=0;
	double tailsCounter=0;
	double random;
	
	for(double i = 1; i<=totalFlips; i++)
	{
		
		
		random = (int)(Math.random()*2)+1;
		
		if(random == 2)
		{
			headsCounter=headsCounter+1;
		}
		
		else
		{
			tailsCounter=tailsCounter+1;
		}
		
	}
	System.out.println("Heads: "+headsCounter);
	System.out.println("Tails: "+tailsCounter);
	
	double percentH =headsCounter/totalFlips*100;
	
	System.out.println("Percent heads: "+ percentH);
	
	double percentT = tailsCounter/totalFlips*100;
	System.out.println("Percent Tails: "+percentT);
	}

}
