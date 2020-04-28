import javax.swing.JTextArea;

public class CardServices { //the class that creates the user information and processes card number info
	
static String cardNumInput;
static boolean BoACard;

static Main[] card = new Main[5];

	//Method Name: initializeCardDB()
	//Description: Create the database of user cards and information
 public static void initializeCardDB()
 	{
	 	card[0] = new Main();
		card[0].setName("Kyle Bustami");
		card[0].setCardNum("123456789");
		card[0].setPinNum("1111"); 
		card[0].setCheckingBalance(500);
		card[0].setSavingsBalance(200);
		card[0].setAccountUse(2);


		card[1] = new Main();
		card[1].setName("Cory Chambers");
		card[1].setCardNum("135792468");
		card[1].setPinNum("2097"); 
		card[1].setCheckingBalance(100);
		card[1].setSavingsBalance(700);
		card[1].setAccountUse(3);
		
		card[2] = new Main();
		card[2].setName("Tanner Douglas");
		card[2].setCardNum("019283746");
		card[2].setPinNum("6194"); 
		card[2].setCheckingBalance(1500);
		card[2].setSavingsBalance(2500);
		card[2].setAccountUse(5);

		card[3] = new Main();
		card[3].setName("Jordan Jones");
		card[3].setCardNum("675849302");
		card[3].setPinNum("0071");
		card[3].setCheckingBalance(50);
		card[3].setAccountUse(0);

		card[4] = new Main();
		card[4].setName("Jesse Pecar");
		card[4].setCardNum("347821904");
		card[4].setPinNum("9871");
		card[4].setCheckingBalance(150);
		card[4].setSavingsBalance(250);
		card[4].setAccountUse(1);
	}

 //Method Name: insertCard()
 //Description: The method that allows the user to insert their card/ type in the correct card number
public static boolean insertCard()
	{
		System.out.print("Enter your Card Number: ");
		cardNumInput = GUI.textBox.getText();
		for(int loop = 0; loop < 5; loop++)
		{
			
			if (cardNumInput.equals(CardServices.card[loop].getCardNum()))
			{
			
				Main.userId = loop;
				System.out.println("Card Recognized.");
				return true;
			}
		
			if(loop == 4)
			{
				System.out.println("Card not recognized, please try again!");
				GUI.logIn = new JTextArea("Your card was entered incorrectly. Please try again.",10,10);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				GUI.frame.repaint();
				GUI.frame.revalidate();
				return insertCard();
			}
		}
		
	return false;
	}

	//Method Name: processCard()
	//Description: Ask the user if they want to continue to use their account or log off
	public static String processCard() 
		{
	
		//boolean Input = GUI.ContinueAnswer;
		int temp = 0;
		String answer = null;
		
			while(temp == 0)
			{
				if (GUI.ContinueAnswer == 1)
				{
					System.out.println("Transaction Proceeding.");
					temp++;
					answer = "continue";
					break;
				}
				
				else if (GUI.ContinueAnswer == 2)
				{
					System.out.println("Transaction complete. Please take your card");
					temp++;
					answer = "cancel";
					break;
				}
				
				else 
				{
					System.out.println("We did not recognize that command, please enter that again");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		return answer;
		}

	//Method Name: returnCard()
	//Description: End the transaction and return the card to the user
	public static void returnCard() 
		{
		System.out.println(" ");
		System.out.println("Transaction complete.");
		}
}
