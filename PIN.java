import java.awt.BorderLayout;

import javax.swing.*;

public class PIN  //the class that deals with all matters related to the PINs
{ 
	
	//static char[] pin;
	static String pin;
	static int attempt = 0;
	static String guess;
	//static char[] fail = {'f','a','i','l'};
	//static char[] cardEaten = {'c','a','r','d','E','a','t','e','n'};
	
	//Method Name: processPIN()
	//Description: Allow the user to enter their pin and test it against all known pins
	//@SuppressWarnings("deprecation")
	static String processPIN() 
	{
		String cardPinInput;
		System.out.print("Enter your Pin: ");

		while(attempt < 4)
		{
			cardPinInput = String.valueOf(GUI.pinNumBox.getPassword());
			
			if(!(cardPinInput == null))
				{
					if (cardPinInput.equals(CardServices.card[Main.userId].getPinNum()))
						{
						pin = cardPinInput;
						GUI.frame.remove(GUI.logIn);
						GUI.frame.repaint();
						GUI.logIn = new JTextArea("Your PIN was entered correctly.",10,10); 
						GUI.frame.getContentPane().add(BorderLayout.WEST, GUI.logIn);
						GUI.logIn.setEditable(false);
						GUI.logIn.setLineWrap(true);
						GUI.logIn.setWrapStyleWord(true);
						GUI.frame.repaint();
						GUI.frame.getContentPane().add(BorderLayout.WEST, GUI.logIn);
						GUI.frame.repaint();
						GUI.frame.revalidate();
						return pin;
						}
					
					if(attempt == 3)
						{
						System.out.println("Card now retracted.");
						GUI.frame.remove(GUI.logIn);
						GUI.frame.repaint();
						GUI.logIn = new JTextArea("Card now retracted.",10,10);
						GUI.frame.getContentPane().add(BorderLayout.WEST, GUI.logIn);
						GUI.logIn.setEditable(false);
						GUI.logIn.setLineWrap(true);
						GUI.logIn.setWrapStyleWord(true);
						GUI.frame.repaint();
						GUI.frame.revalidate();
						return eatPin();
						}
					
						{
						System.out.println("Your pin is not recognized. Try again.");
						GUI.frame.remove(GUI.logIn);
						GUI.frame.repaint();
						GUI.logIn = new JTextArea("Your PIN was entered incorrectly. Please try again.",10,10); 
						GUI.logIn.setEditable(false);
						GUI.logIn.setLineWrap(true);
						GUI.logIn.setWrapStyleWord(true);
						GUI.frame.getContentPane().add(BorderLayout.WEST, GUI.logIn);
						GUI.frame.repaint();
						GUI.frame.revalidate();
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						attempt++;
						}
				}
		}
	return "failed";	
	}
	
	//Method Name: eatPin()
	//Description: Method to 'destroy' the card
	public static String eatPin() 
		{
		//CardServices.card[Main.userId].setPinNum('0','0','0','0');
		return "cardEaten"; 		
		}
}
