import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class CoinFlip extends JFrame
	{
		static int className;
		static JFrame frame = new JFrame("Probability");

		public static void main(String[] args)
			{
				
				makeThingsHappen();
				
			}

		public static void makeThingsHappen()
			{
				
				String name = JOptionPane.showInputDialog("What is your name?");
				JOptionPane.showMessageDialog(frame, "Hi, " + name);

				frame.setSize(400, 400);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setResizable(false);
				frame.setLocationRelativeTo(null);

				String totalFlipsInput = JOptionPane.showInputDialog("Input how many times I should flip a coin!");
				int totalFlips = Integer.parseInt(totalFlipsInput);

				double headsCounter = 0;
				double tailsCounter = 0;
				double random;

				for (double i = 1; i <= totalFlips; i++)
					{

						random = (int) (Math.random() * 2) + 1;

						if (random == 2)
							{
								headsCounter = headsCounter + 1;
							}

						else
							{
								tailsCounter = tailsCounter + 1;
							}

					}
				double percentH = headsCounter / totalFlips * 100;
				double percentT = tailsCounter / totalFlips * 100;

				DecimalFormat df = new DecimalFormat("####0.00");
				percentH = Double.valueOf(df.format(percentH));
				percentT = Double.valueOf(df.format(percentT));

				JOptionPane.showMessageDialog(frame, new Object[]
					{ " Heads: " + headsCounter, " Percent Heads: " + percentT, " Tails: " + tailsCounter,
							" Percent Tails " + percentT });
				playAgain();

			}

		public static void playAgain()
			{
				Object [] options = {"Yes", "No"};
					className = JOptionPane.showOptionDialog(frame, "Play again?", "Maybe?",
							JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null, options, options[1]);
					
					switch(className)
					{
						case 0:
								{
									makeThingsHappen();
									break;
								}
						case 1:
								{
									JOptionPane.showMessageDialog(frame, "Goodbye!");
									break;
								}
					}
						

			}

	}
