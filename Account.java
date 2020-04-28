

public class Account { //the class that deals with names and account ownership

	//Method Name: select()
	//Description: Allow user to select either checking or savings
	public static String select() 
	{
		
		String InputBase;
		String Input = GUI.accountType;
		System.out.println("What woud you like to do?");
		System.out.println("View");
		System.out.println("Deposit");
		System.out.println("Withdraw");
		System.out.println("Transfer");
		InputBase = GUI.accountAnswer;
		
		if(InputBase.compareToIgnoreCase("deposit") == 0)
			{
				System.out.println("Do you want to " +InputBase +" to 'savings' or 'checking?'");
				Input = GUI.accountType;
				
				if (Input.toUpperCase().equalsIgnoreCase("CHECKING") && InputBase.equalsIgnoreCase("deposit"))
				{
					Input = "dCHECKING";
					return Input;
				}
			
				if (Input.toUpperCase().equalsIgnoreCase("SAVINGS")  && InputBase.equalsIgnoreCase("deposit"))
				{
					Input = "dSAVINGS";
					return Input;
				}
			}
		
			if (InputBase.compareToIgnoreCase("withdraw") == 0 )
			{
				System.out.println("Do you want to " +InputBase +" from 'savings' or 'checking?'");
				Input = GUI.accountType;
				if (Input.toUpperCase().equalsIgnoreCase("CHECKING"))
				{
					Input = "CHECKING";
					return Input;
				}
			
				if (Input.toUpperCase().equalsIgnoreCase("SAVINGS"))
				{
					Input = "SAVINGS";
					return Input;
				}
			}
		
		else if(InputBase.equalsIgnoreCase("transfer"))
		{
			System.out.println("Do you want to " +InputBase +" from 'savings' or from 'checking'?");
			Input = GUI.accountType;
			
			if (Input.toUpperCase().equalsIgnoreCase("CHECKING"))
			{
				Input = "tCHECKING";
				return Input;
			}
			
			if (Input.toUpperCase().equalsIgnoreCase("SAVINGS"))
			{
				Input = "tSAVINGS";
				return Input;
			}
		}
		
		else if(InputBase.equalsIgnoreCase("view"))
		{
			System.out.println("");
			System.out.println("Your checkings account balance is: $" +CardServices.card[Main.userId].getCheckingBalance()
								+" and you savings balance is: $" +CardServices.card[Main.userId].getSavingsBalance());
			System.out.println("and you have used your savings account: " +CardServices.card[Main.userId].getAccountUse()
								+" times this month");
			return "null";
		}
		
		else
		{
			System.out.println("Error: unknown input. Please type in your selection again.");
			return select();
		}
		
		return Input;
	}

	
}
