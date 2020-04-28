import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {

	public static int userId = -1;
	private String cardNum;
	private String name;
	private String pinNum;
	private float checkingBalance;
	private float savingsBalance;
	private int accountUse;
	static int amount;
	
	static Main[] card = new Main[5];
	
	//Method Name: getName()
		//Description: getter for the name of each person variable
		public String getName() 
		{
			return name;
		}
		
		//Method Name: getCardNum()
		//Description: getter for the card number variable
		public String getCardNum() 
		{
			return cardNum;
		}
		
		//Method Name: getPinNum
		//Description: getter for the card pin number variable
		public String getPinNum() 
		{
			return pinNum;
		}
		
		//Method Name: getCheckingBalance()
		//Description: getter for the checking account balance variable
		public float getCheckingBalance() 
		{
			return checkingBalance;
		}
		
		//Method Name: getSavingsBalance()
		//Description: getter for the savings account balance variable
		public float getSavingsBalance() 
		{
			return savingsBalance;
		}
		
		//Method Name: getAccountUse()
		//Description: getter for the number of times the savings accounts has been used
		public int getAccountUse()
		{
			return accountUse;
		}
		
		//Method Name: setName()
		//Description: setter for the name of each person variable
		public void setName(String Name) //setter for the name of each person variable
		{
			this.name = Name;
		}
		
		//Method Name: setCardNum
		// Description: setter for the card number variable
		public void setCardNum(String CardNumValue) 
		{
			this.cardNum = CardNumValue;
		}
		
		//Method Name: setPinNum()
		// Description: setter for the card pin number variable
		public void setPinNum(String Pin) 
		{
			//char Pin[] = {c, d, e, f};
			this.pinNum = Pin;
		}
		
		//Method Name: setCheckingBalance()
		//Description: setter for the checking account balance variable
		public void setCheckingBalance(float CheckingBalance) 
		{
			this.checkingBalance = CheckingBalance;
		}
		
		//Method Name setSavingsBalance()
		//Description: setter for the savings account balance variable
		public void setSavingsBalance(float SavingsBalance) 
		{
			this.savingsBalance = SavingsBalance;
		}
		
		//Method Name: getAccountUse()
			//Description: getter for the number of times the savings accounts has been used
			public void setAccountUse(int AccountUse)
			{
				this.accountUse = AccountUse;
			}
			
	
	public static void main(String[] args) 
	{
		for (int loopMain = 0; loopMain < 5; loopMain++)
		{
		GUI GUI = new GUI();
		GUI.Go();
		CardServices.initializeCardDB();
		
		while (GUI.proceed == 0) 
		{
			System.out.println(GUI.proceed);
		}
		
		if (CardServices.insertCard() == true)
		{
			GUI.textBoxActive = 1;
			System.out.print("Enter your Pin: ");
			GUI.logIn = new JTextArea("Enter your Pin",10,10); 
			GUI.frame.getContentPane().add(BorderLayout.WEST, GUI.logIn);
			GUI.logIn.setEditable(false);
			GUI.logIn.setLineWrap(true);
			GUI.logIn.setWrapStyleWord(true);
			GUI.frame.remove(GUI.panelCardNumSuper);
			GUI.frame.getContentPane().add(BorderLayout.NORTH, GUI.panelCardPinSuper);
			GUI.frame.revalidate();
			GUI.proceed = 1;
		}
		
		else 
		{
			GUI.proceed = 0;
		}
		
		
		while (GUI.proceed == 1)
		{
			System.out.println(GUI.proceed);
		}
		
		String pin = PIN.processPIN();
		if(!(pin.compareTo("cardEaten") == 0))
		{
			//System.out.println(pin);
			//System.out.println("so far so good");
			GUI.transactionScreen();
			
			while ( GUI.proceed < 3)
			{
				
				amount = GUI.fastCashAmount;
				System.out.println(amount);
				if (amount > 0) 
				{
					
				}
				else if (GUI.otherClicked == true)
				{
					
				}
				else if (GUI.proceed > 10) 
				{
				GUI.frame.repaint();
					break;
					
				}
			
					}
		 }
		GUI.clear();
		GUI.frame.dispose();
		GUI.proceed = 0;
		loopMain++;}
	}
}
