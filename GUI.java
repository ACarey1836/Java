import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUI {
//GUI.go()

	static JFrame frame = new JFrame();
	static JTextField textBox = new JTextField(9);
	static JPasswordField pinNumBox = new JPasswordField(4);
	static JPanel panelMega = new JPanel();
	static JPanel panelMoneyAction = new JPanel();
	static JPanel panelSideRight = new JPanel();
	static JPanel panelCheckingSaving = new JPanel();
	static JTextArea logIn = new JTextArea(" "
			+ " "
			+ " "
			+ "Please log into your account. "
			+ "Enter your Account Card Number and click the enter button on the keypad.",10,10);
	static JPanel panelCardNumSuper = new JPanel();
	static JPanel panelCardPinSuper = new JPanel();
	static JLabel cardNumLabel = new JLabel("Card Number");
	static JLabel cardPinLabel = new JLabel("PIN");
	JPanel panelCardNum = new JPanel();
	JPanel panelPinNum = new JPanel();
	int textBoxActive = 0;
	static int ContinueAnswer = 0;
	static int proceed = 0;
	static boolean pinNumEntered = false;
	static JPanel panelCashOptions = new JPanel();
	static JTextArea FastCashText = new JTextArea("Select an amount of cash, choose a differnt transaction, or end this visit by "
			+ "clicking 'Other Transactions', 'End Transaction'..", 10, 10);
	static JTextField fastCashTextBox = new JTextField(5);
	static JPanel panelFastCashTextBox = new  JPanel();
	static JLabel fastCashLabel = new JLabel("Fast Cash Amount:");
	static JButton fastCashEnter = new JButton("Continue");
	static int fastCashAmount = 0;
	static JPanel fastCashFinalPanel = new JPanel();
	static JPanel panelOtherTransactions = new JPanel();
	static String accountAnswer = null;
	static String accountType = null;
	static JPanel panelMoneyActionTextBox = new JPanel();
	static JTextArea otherTransactionArea = new JTextArea("Select an action and an account, if required. You may terminate this transaction by"
			+ "selecting 'End'.",10,10);
	static JTextField moneyActionTextBox = new JTextField();
	static JButton goAhead = new JButton("Continue");
	static JPanel chargeCheckOptions = new JPanel();
	static String chargeAnswer = "null";
	static int chargeLoop = 0;
	static int cashAmount;
	static int billAmount;
	static	int amountOnes = 0;
	static int amountFives = 0;
	static	int amountTens = 0;
	static int amountTwentys = 0;
	static int oneStorage = 50;
	static int fiveStorage = 40;
	static int tenStorage = 25;
	static int twentyStorage = 25;
	static int clearTwenties = 0;
	static int clearTens = 0;
	static int clearFives = 0;
	static int clearOnes = 0;
	static int amount = 0;
	static JButton submit = new JButton("Submit");
	static boolean otherClicked = false;
	static JTextArea goodBye = new JTextArea("This is the end of the program. The frame will now clear itself. Good bye!", 10, 10);
	//static JButton fastCashConfirm = new JButton("Confirm");
	//static JButton fastCashCancel = new JButton("Cancel");
	//static JLabel fastCashLabelFinal = new JLabel("You selected: " + fastCashAmount);
	//static int fastCashAmount = 0;
	
	//Method Name:ones()
		//Description: Dispenses one dollar bills
		public static void ones()
		{
			amountOnes++;
			oneStorage--;
		}
		
		//Method Name:fives()
		//Description: Dispenses five dollar bills
		public static void fives() 
		{
			amountFives++;
			fiveStorage--;
		}
		
		//Method Name:tens()
		//Description: Dispenses ten dollar bills
		public static void tens() 
		{
			amountTens++;
			tenStorage--;
		}
		
		//Method Name:twentys()
		//Description: Dispenses twenty dollar bills
		public static void twentys()
		{
			amountTwentys++;
			twentyStorage--;
		}
		
		//Method Name: cash()
		//Description: Counts the bills, totals the money, and debts accounts
		public static void cash() 
		{
				int total = (int) amount;
				while(total > 0)
				{
					if(total >= 20 && twentyStorage > 0)
					{
						twentys();
						total = total - 20;
					}
					
					else if(total >= 10 && tenStorage > 0)
					{
						tens();
						total = total - 10;
					}
				
					else if(total >= 5 && fiveStorage > 0)
					{
						fives();
						total = total - 5;
					}
				
					else if(total >= 1 && oneStorage > 0)
					{
						ones();
						total = total - 1;
					}
				}
			
			System.out.println(" ");
			System.out.print(amount +" will be returned, consisting of " +amountTwentys +" twenties, "
					+amountTens +" tens, " +amountFives +" fives, and " +amountOnes +" ones ");
			}

		//Method Name: clearBills()
		//Description: Clears the cache of bills | sets the number of bills withdrawn to zero
		public static void clearBills()
		{
			amountOnes = 0;
			amountFives = 0;
			amountTens = 0;
			amountTwentys = 0;
		}

	 

	public void Go() 
	{
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button0 = new JButton("0");
		JButton buttonEnterNum = new JButton("ENT");
		JButton buttonClearNum = new JButton("BCK");
		
		button1.addActionListener(new Button1Listener());
		button2.addActionListener(new Button2Listener());
		button3.addActionListener(new Button3Listener());
		button4.addActionListener(new Button4Listener());
		button5.addActionListener(new Button5Listener());
		button6.addActionListener(new Button6Listener());
		button7.addActionListener(new Button7Listener());
		button8.addActionListener(new Button8Listener());
		button9.addActionListener(new Button9Listener());
		button0.addActionListener(new Button0Listener());
		buttonEnterNum.addActionListener(new buttonEnterNumListener());
		buttonClearNum.addActionListener(new buttonClearNumListener());
		
		JPanel panel123 = new JPanel();
		JPanel panel456 = new JPanel();
		JPanel panel789 = new JPanel();
		JPanel panel0EC = new JPanel();
		

		frame.getContentPane().add(BorderLayout.WEST, logIn);
		
		panel123.setLayout(new BoxLayout(panel123, BoxLayout.X_AXIS));
		panel123.add(button1);
		panel123.add(button2);
		panel123.add(button3);
		
		panel456.setLayout(new BoxLayout(panel456, BoxLayout.X_AXIS));
		panel456.add(button4);
		panel456.add(button5);
		panel456.add(button6);
		
		panel789.setLayout(new BoxLayout(panel789, BoxLayout.X_AXIS));
		panel789.add(button7);
		panel789.add(button8);
		panel789.add(button9);
		
		panel0EC.setLayout(new BoxLayout(panel0EC, BoxLayout.X_AXIS));
		panel0EC.add(buttonEnterNum);
		panel0EC.add(button0);
		panel0EC.add(buttonClearNum);
		
		frame.getContentPane().add(BorderLayout.CENTER, panelMega);
		panelMega.setLayout(new BoxLayout(panelMega, BoxLayout.Y_AXIS));
		panelMega.add(panel123);
		panelMega.add(panel456);
		panelMega.add(panel789);
		panelMega.add(panel0EC);
		
		logIn.setEditable(false);
		logIn.setLineWrap(true);
		logIn.setWrapStyleWord(true);
		
		
		panelCardNumSuper.setLayout(new BoxLayout(panelCardNumSuper, BoxLayout.Y_AXIS));
		panelCardNumSuper.add(panelCardNum);
		panelCardNum.add(cardNumLabel);
		panelCardNum.add(textBox);
		frame.getContentPane().add(BorderLayout.NORTH, panelCardNumSuper);
		
		panelCardPinSuper.setLayout(new BoxLayout(panelCardPinSuper, BoxLayout.Y_AXIS));
		panelCardPinSuper.add(panelPinNum);
		panelPinNum.add(cardPinLabel);
		panelPinNum.add(pinNumBox);
		
		JButton b20 = new JButton("$20");
		JButton b40 = new JButton("$40");
		JButton b60 = new JButton("$60");
		JButton b80 = new JButton("$80");
		JButton b100 = new JButton("$100");
		JButton b200 = new JButton("$200");
		
		b20.addActionListener(new B20Listener());
		b40.addActionListener(new B40Listener());
		b60.addActionListener(new B60Listener());
		b80.addActionListener(new B80Listener());
		b100.addActionListener(new B100Listener());
		b200.addActionListener(new B200Listener());
		
		JPanel panelCashOptionsTop = new JPanel();
		JPanel panelCashOptionsBottom = new JPanel();
		
		panelCashOptionsTop.setLayout(new BoxLayout(panelCashOptionsTop, BoxLayout.X_AXIS));
		panelCashOptionsTop.add(b20);
		panelCashOptionsTop.add(b40);
		panelCashOptionsTop.add(b60);
		
		panelCashOptionsBottom.setLayout(new BoxLayout(panelCashOptionsBottom, BoxLayout.X_AXIS));
		panelCashOptionsBottom.add(b80);
		panelCashOptionsBottom.add(b100);
		panelCashOptionsBottom.add(b200);
		
		panelCashOptions.setLayout(new BoxLayout(panelCashOptions, BoxLayout.Y_AXIS));
		panelCashOptions.add(panelCashOptionsTop);
		panelCashOptions.add(panelCashOptionsBottom);
		
		panelFastCashTextBox.add(fastCashLabel);
		panelFastCashTextBox.add(fastCashTextBox);
		panelFastCashTextBox.add(fastCashEnter);
		
		fastCashEnter.addActionListener(new FastCashEnterListener());
		
		panelMoneyAction.setLayout(new BoxLayout(panelMoneyAction, BoxLayout.Y_AXIS));
		
		FastCashText.setEditable(false);
		FastCashText.setLineWrap(true);
		FastCashText.setWrapStyleWord(true);
		
		JButton fastCashConfirm = new JButton("Confirm");
		JButton fastCashCancel = new JButton("Cancel");
		
		fastCashConfirm.addActionListener(new FastCashConfirm());
		fastCashCancel.addActionListener(new FastCashCancel());
		
		fastCashConfirm.setForeground(Color.green);
		fastCashCancel.setForeground(Color.red);
		fastCashFinalPanel.setLayout(new BoxLayout(fastCashFinalPanel, BoxLayout.Y_AXIS));
		fastCashFinalPanel.add(fastCashConfirm);
		fastCashFinalPanel.add(fastCashCancel);
		
		
		//panelOtherTransactions.setLayout(new BoxLayout(panelOtherTransactions, BoxLayout.X_AXIS));
		JButton otherTransactions = new JButton("Other"
				+ "Transactions");
		panelOtherTransactions.add(otherTransactions);
		otherTransactions.addActionListener(new otherTransactionsListener());
		
		JLabel moneyActionLabel = new JLabel("Amount:");
		panelMoneyActionTextBox.setLayout(new BoxLayout(panelMoneyActionTextBox, BoxLayout.X_AXIS));
		//panelMoneyActionTextBox.add(moneyActionLabelAction);
		panelMoneyActionTextBox.add(moneyActionLabel);
		panelMoneyActionTextBox.add(moneyActionTextBox);
		
		otherTransactionArea.setEditable(false);
		otherTransactionArea.setLineWrap(true);
		otherTransactionArea.setWrapStyleWord(true);
		
		JButton view = new JButton("View");
		JButton deposit = new JButton("Deposit");
		JButton withdraw = new JButton("Withdraw");
		JButton transfer = new JButton("Transfer");
		JButton end = new JButton("End Transaction");
		
		JButton checking = new JButton("Checking");
		JButton saving = new JButton("Savings");
		
		view.addActionListener(new ButtonView());
		deposit.addActionListener(new ButtonDeposit());
		withdraw.addActionListener(new ButtonWithdraw());
		transfer.addActionListener(new ButtonTransfer());
		end.addActionListener(new ButtonEnd());
		
		checking.addActionListener(new ButtonChecking());
		saving.addActionListener(new ButtonSaving());
		
		panelCheckingSaving.add(saving);
		panelCheckingSaving.add(checking);
		
		panelMoneyAction.setLayout(new BoxLayout(panelMoneyAction, BoxLayout.Y_AXIS));
		panelMoneyAction.add(view);
		panelMoneyAction.add(deposit);
		panelMoneyAction.add(withdraw);
		panelMoneyAction.add(transfer);
		panelMoneyAction.add(end);
		
		goAhead.addActionListener(new goAheadListener());
		
		JButton chargeCheckYes = new JButton("Yes");
		JButton chargeCheckNo = new JButton("No");
		chargeCheckOptions.setLayout(new BoxLayout(chargeCheckOptions, BoxLayout.Y_AXIS));
		chargeCheckOptions.add(chargeCheckYes);
		chargeCheckOptions.add(chargeCheckNo);
		chargeCheckYes.addActionListener(new chargeCheckYesListener());
		chargeCheckNo.addActionListener(new chargeCheckNoListener());
		
		submit.addActionListener(new submitListener());
		
		goodBye.setEditable(false);
		goodBye.setLineWrap(true);
		goodBye.setWrapStyleWord(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setVisible(true);
		
	}
	class Button1Listener implements ActionListener
	{public void actionPerformed(ActionEvent button1)
	{
		if (textBoxActive == 0)
		{
			try{ 
				Robot robot = new Robot();
				textBox.requestFocus();
				robot.keyPress(KeyEvent.VK_1);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 1)
		{  
			try{ 
				Robot robot = new Robot();
				pinNumBox.requestFocus();
				robot.keyPress(KeyEvent.VK_1);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 2)
		{
			try{ 
				Robot robot = new Robot();
				moneyActionTextBox.requestFocus();
				robot.keyPress(KeyEvent.VK_1);}
				catch (Exception e) {}
		}
		
	}}
	
	class Button2Listener implements ActionListener
	{public void actionPerformed(ActionEvent button2)
	{
		if (textBoxActive == 0)
		{
			try{ 
				Robot robot = new Robot();
				textBox.requestFocus();
				robot.keyPress(KeyEvent.VK_2);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 1)
		{  
			try{ 
				Robot robot = new Robot();
				pinNumBox.requestFocus();
				robot.keyPress(KeyEvent.VK_2);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 2)
		{
			try{ 
				Robot robot = new Robot();
				moneyActionTextBox.requestFocus();
				robot.keyPress(KeyEvent.VK_2);}
				catch (Exception e) {}
		}
		}}
	
	class Button3Listener implements ActionListener
	{public void actionPerformed(ActionEvent button3)
	{
		if (textBoxActive == 0)
		{
			try{ 
				Robot robot = new Robot();
				textBox.requestFocus();
				robot.keyPress(KeyEvent.VK_3);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 1)
		{  
			try{ 
				Robot robot = new Robot();
				pinNumBox.requestFocus();
				robot.keyPress(KeyEvent.VK_3);}
				catch (Exception e) {}
		}
		
		else if (textBoxActive == 2)
		{
			try{ 
				Robot robot = new Robot();
				moneyActionTextBox.requestFocus();
				robot.keyPress(KeyEvent.VK_3);}
				catch (Exception e) {}
		}
	}}

	class Button4Listener implements ActionListener
	{public void actionPerformed(ActionEvent button4)
	{
		if (textBoxActive == 0)
		{
			try{ 
				Robot robot = new Robot();
				textBox.requestFocus();
				robot.keyPress(KeyEvent.VK_4);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 1)
		{  
			try{ 
				Robot robot = new Robot();
				pinNumBox.requestFocus();
				robot.keyPress(KeyEvent.VK_4);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 2)
		{
			try{ 
				Robot robot = new Robot();
				moneyActionTextBox.requestFocus();
				robot.keyPress(KeyEvent.VK_4);}
				catch (Exception e) {}
		}
	}}
	
	class Button5Listener implements ActionListener
	{public void actionPerformed(ActionEvent button5)
	{
		if (textBoxActive == 0)
		{
			try{ 
				Robot robot = new Robot();
				textBox.requestFocus();
				robot.keyPress(KeyEvent.VK_5);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 1)
		{  
			try{ 
				Robot robot = new Robot();
				pinNumBox.requestFocus();
				robot.keyPress(KeyEvent.VK_5);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 2)
		{
			try{ 
				Robot robot = new Robot();
				moneyActionTextBox.requestFocus();
				robot.keyPress(KeyEvent.VK_5);}
				catch (Exception e) {}
		}
	}}

	class Button6Listener implements ActionListener
	{public void actionPerformed(ActionEvent button6)
	{
		if (textBoxActive == 0)
		{
			try{ 
				Robot robot = new Robot();
				textBox.requestFocus();
				robot.keyPress(KeyEvent.VK_6);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 1)
		{  
			try{ 
				Robot robot = new Robot();
				pinNumBox.requestFocus();
				robot.keyPress(KeyEvent.VK_6);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 2)
		{
			try{ 
				Robot robot = new Robot();
				moneyActionTextBox.requestFocus();
				robot.keyPress(KeyEvent.VK_6);}
				catch (Exception e) {}
		}
	}}
	
	class Button7Listener implements ActionListener
	{public void actionPerformed(ActionEvent button7)
	{
		if (textBoxActive == 0)
		{
			try{ 
				Robot robot = new Robot();
				textBox.requestFocus();
				robot.keyPress(KeyEvent.VK_7);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 1)
		{  
			try{ 
				Robot robot = new Robot();
				pinNumBox.requestFocus();
				robot.keyPress(KeyEvent.VK_7);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 2)
		{
			try{ 
				Robot robot = new Robot();
				moneyActionTextBox.requestFocus();
				robot.keyPress(KeyEvent.VK_7);}
				catch (Exception e) {}
		}
	}}

	class Button8Listener implements ActionListener
	{public void actionPerformed(ActionEvent button8)
	{
		if (textBoxActive == 0)
		{
			try{ 
				Robot robot = new Robot();
				textBox.requestFocus();
				robot.keyPress(KeyEvent.VK_8);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 1)
		{  
			try{ 
				Robot robot = new Robot();
				pinNumBox.requestFocus();
				robot.keyPress(KeyEvent.VK_8);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 2)
		{
			try{ 
				Robot robot = new Robot();
				moneyActionTextBox.requestFocus();
				robot.keyPress(KeyEvent.VK_8);}
				catch (Exception e) {}
		}
	}}
	
	class Button9Listener implements ActionListener
	{public void actionPerformed(ActionEvent button9)
	{
		if (textBoxActive == 0)
		{
			try{ 
				Robot robot = new Robot();
				textBox.requestFocus();
				robot.keyPress(KeyEvent.VK_9);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 1)
		{  
			try{ 
				Robot robot = new Robot();
				pinNumBox.requestFocus();
				robot.keyPress(KeyEvent.VK_9);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 2)
		{
			try{ 
				Robot robot = new Robot();
				moneyActionTextBox.requestFocus();
				robot.keyPress(KeyEvent.VK_9);}
				catch (Exception e) {}
		}
	}}

	class Button0Listener implements ActionListener
	{public void actionPerformed(ActionEvent button0)
	{
		if (textBoxActive == 0)
		{
			try{ 
				Robot robot = new Robot();
				textBox.requestFocus();
				robot.keyPress(KeyEvent.VK_0);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 1)
		{  
			try{ 
				Robot robot = new Robot();
				pinNumBox.requestFocus();
				robot.keyPress(KeyEvent.VK_0);}
				catch (Exception e) {}
		}
		else if (textBoxActive == 2)
		{
			try{ 
				Robot robot = new Robot();
				moneyActionTextBox.requestFocus();
				robot.keyPress(KeyEvent.VK_0);}
				catch (Exception e) {}
		}
		}}
	
	class buttonEnterNumListener implements ActionListener
	{public void actionPerformed(ActionEvent buttonEnterNum)
	{
		if (textBoxActive == 0)
			proceed = 1;
		else if (textBoxActive == 1)
			proceed = 2;
		else if (textBoxActive == 2)
		{moneyActionTextBox.requestFocus();}
	}}
	
	
	
	class buttonClearNumListener implements ActionListener
	{public void actionPerformed(ActionEvent buttonClearNum)
	{if (textBoxActive == 0)
	{
		try{ 
			Robot robot = new Robot();
			textBox.requestFocus();
			robot.keyPress(KeyEvent.VK_BACK_SPACE);}
			catch (Exception e) {}
	}
	else if (textBoxActive == 1)
	{  
		try{ 
			Robot robot = new Robot();
			pinNumBox.requestFocus();
			robot.keyPress(KeyEvent.VK_BACK_SPACE);}
			catch (Exception e) {}
	}
	else if (textBoxActive == 2)
	{
		try{ 
			Robot robot = new Robot();
			moneyActionTextBox.requestFocus();
			robot.keyPress(KeyEvent.VK_BACK_SPACE);}
			catch (Exception e) {}
	}
	}}
	
	class buttonEnterListener implements ActionListener
	{public void actionPerformed(ActionEvent buttonEnter)
	{
		
	}}
	
	class B20Listener implements ActionListener
	{public void actionPerformed(ActionEvent b20)
	{
		try{ 
			fastCashTextBox.setText("");
			Robot robot = new Robot();
			fastCashTextBox.requestFocus();
			robot.keyPress(KeyEvent.VK_2);
			robot.delay(50);
			robot.keyPress(KeyEvent.VK_0);
			}
			catch (Exception e) {}
	}}
	
	class B40Listener implements ActionListener
	{public void actionPerformed(ActionEvent b40)
	{
		try{ 
			fastCashTextBox.setText("");
			Robot robot = new Robot();
			fastCashTextBox.requestFocus();
			robot.keyPress(KeyEvent.VK_4);
			robot.delay(50);
			robot.keyPress(KeyEvent.VK_0);
			}
			catch (Exception e) {}
	}}
	
	class B60Listener implements ActionListener
	{public void actionPerformed(ActionEvent b60)
	{
		try{ 
			fastCashTextBox.setText("");
			Robot robot = new Robot();
			fastCashTextBox.requestFocus();
			robot.keyPress(KeyEvent.VK_6);
			robot.delay(50);
			robot.keyPress(KeyEvent.VK_0);
			}
			catch (Exception e) {}
	}}
	
	class B80Listener implements ActionListener
	{public void actionPerformed(ActionEvent b80)
	{
		try{ 
			fastCashTextBox.setText("");
			Robot robot = new Robot();
			fastCashTextBox.requestFocus();
			robot.keyPress(KeyEvent.VK_8);
			robot.delay(50);
			robot.keyPress(KeyEvent.VK_0);
			}
			catch (Exception e) {}
	}}
	
	class B100Listener implements ActionListener
	{public void actionPerformed(ActionEvent b100)
	{
		try{ 
			fastCashTextBox.setText("");
			Robot robot = new Robot();
			fastCashTextBox.requestFocus();
			robot.keyPress(KeyEvent.VK_1);
			robot.delay(50);
			robot.keyPress(KeyEvent.VK_0);
			robot.delay(50);
			robot.keyPress(KeyEvent.VK_0);
			}
			catch (Exception e) {}
	}}
	
	class B200Listener implements ActionListener
	{public void actionPerformed(ActionEvent b200)
	{
		try{ 
			fastCashTextBox.setText("");
			Robot robot = new Robot();
			fastCashTextBox.requestFocus();
			robot.keyPress(KeyEvent.VK_2);
			robot.delay(50);
			robot.keyPress(KeyEvent.VK_0);
			robot.delay(50);
			robot.keyPress(KeyEvent.VK_0);
			}
			catch (Exception e) {}
	}}
	
	class FastCashEnterListener implements ActionListener
	{public void actionPerformed(ActionEvent fastCashEnter)
	{
		fastCashAmount = Integer.parseInt(fastCashTextBox.getText());
		System.out.println(fastCashAmount);
		FastCashScreen();
	}}
	
	class ButtonEnd implements ActionListener
	{ public void actionPerformed(ActionEvent end)
		{
		clear();
	}}
	
	class ButtonView implements ActionListener
	{ public void actionPerformed(ActionEvent view)
		{
		accountAnswer = "view";
		System.out.println(accountAnswer);
		frame.remove(otherTransactionArea);
		frame.remove(logIn);
		frame.repaint();
		frame.revalidate();
		float cBalance = CardServices.card[Main.userId].getCheckingBalance();
		float sBalance = CardServices.card[Main.userId].getSavingsBalance();
		int uses = CardServices.card[Main.userId].getAccountUse();
		otherTransactionArea = new JTextArea("Your checkings account balance is: $"+cBalance+" and you savings balance is: $"+sBalance+" and you have used your savings account: "+uses+" times this month",10,10);
		frame.getContentPane().add(BorderLayout.WEST, otherTransactionArea);
		otherTransactionArea.setEditable(false);
		otherTransactionArea.setLineWrap(true);
		otherTransactionArea.setWrapStyleWord(true);
		frame.repaint();
		frame.revalidate();
	}}
	
	class ButtonTransfer implements ActionListener
	{ public void actionPerformed(ActionEvent transfer)
		{
		accountAnswer = "transfer";
		System.out.println(accountAnswer);
		frame.remove(otherTransactionArea);
		otherTransactionArea = new JTextArea("You have selected Transfer. Please select the account you want "
				+ "to transfer funds into.",10,10);
		frame.getContentPane().add(BorderLayout.WEST, otherTransactionArea);
		otherTransactionArea.setEditable(false);
		otherTransactionArea.setLineWrap(true);
		otherTransactionArea.setWrapStyleWord(true);
		frame.repaint();
		frame.revalidate();
	}}
	
	class ButtonWithdraw implements ActionListener
	{ public void actionPerformed(ActionEvent withdraw)
		{
		accountAnswer = "withdraw";
		System.out.println(accountAnswer);
		frame.remove(otherTransactionArea);
		otherTransactionArea = new JTextArea("You have selected Withdraw. Please select the account you want to "
				+ "take funds from.",10,10);
		frame.getContentPane().add(BorderLayout.WEST, otherTransactionArea);
		otherTransactionArea.setEditable(false);
		otherTransactionArea.setLineWrap(true);
		otherTransactionArea.setWrapStyleWord(true);
		frame.repaint();
		frame.revalidate();
	}}
	
	class ButtonDeposit implements ActionListener
	{ public void actionPerformed(ActionEvent deposit)
		{
		accountAnswer = "deposit";
		System.out.println(accountAnswer);
		frame.remove(otherTransactionArea);
		otherTransactionArea = new JTextArea("You have selected Deposit. Please select the account you want "
				+ "to deposit funds into.",10,10);
		otherTransactionArea.setEditable(false);
		otherTransactionArea.setLineWrap(true);
		otherTransactionArea.setWrapStyleWord(true);
		frame.getContentPane().add(BorderLayout.WEST, otherTransactionArea);
		frame.repaint();
		frame.revalidate();
	}}
	
	class ButtonChecking implements ActionListener
	{ public void actionPerformed(ActionEvent checking)
		{
		accountType = "checking";
		frame.remove(otherTransactionArea);
		if (accountAnswer.equals("deposit")) 
		{
		frame.remove(otherTransactionArea);
		otherTransactionArea = new JTextArea("You have opted to deposit into your checking account. Please press continue to deposit "
				+ "your funds.",10,10);
		}
		if (accountAnswer.equals("withdraw"))
		{
			frame.remove(otherTransactionArea);
			otherTransactionArea = new JTextArea("You have opted to withdraw from your checking account. Please press continue to withdraw "
					+ "your funds.",10,10);
		}
		if (accountAnswer.equals("transfer"))
		{
			frame.remove(otherTransactionArea);
			otherTransactionArea = new JTextArea("You have opted to tranfer funds into your checking account. Please press continue to transfer "
					+ "your funds.",10,10);
		}
		otherTransactionArea.setEditable(false);
		otherTransactionArea.setLineWrap(true);
		otherTransactionArea.setWrapStyleWord(true);
		frame.getContentPane().add(BorderLayout.WEST, otherTransactionArea);
		panelCheckingSaving.add(goAhead);
		frame.repaint();
		frame.revalidate();
	}}
	
	class ButtonSaving implements ActionListener
	{ public void actionPerformed(ActionEvent saving)
		{
		accountType = "saving";
		
		if (accountAnswer.equals("deposit")) 
		{
		frame.remove(otherTransactionArea);
		otherTransactionArea = new JTextArea("You have opted to deposit into your savings account. Please press continue to deposit "
				+ "your funds.",10,10);
		}
		if (accountAnswer.equals("withdraw"))
		{
			frame.remove(otherTransactionArea);
			otherTransactionArea = new JTextArea("You have opted to withdraw from your savings account. Please press continue to withdraw "
					+ "your funds.",10,10);
		}
		if (accountAnswer.equals("transfer"))
		{
			frame.remove(otherTransactionArea);
			otherTransactionArea = new JTextArea("You have opted to tranfer funds into your savings account. Please press continue to transfer "
					+ "your funds.",10,10);
		}
		otherTransactionArea.setEditable(false);
		otherTransactionArea.setLineWrap(true);
		otherTransactionArea.setWrapStyleWord(true);
		frame.getContentPane().add(BorderLayout.WEST, otherTransactionArea);
		panelCheckingSaving.add(goAhead);
		frame.repaint();
		frame.revalidate();
	}}
	
	class FastCashConfirm implements ActionListener
	{ public void actionPerformed(ActionEvent fastCashConfirm)
		{
		
		CardServices.card[Main.userId].setCheckingBalance(CardServices.card[Main.userId].getCheckingBalance() - fastCashAmount);
		clear();
	}}
	
	class FastCashCancel implements ActionListener
	{ public void actionPerformed(ActionEvent fastCashCancel)
		{
		ContinueAnswer = 5;
	}}
	
	class otherTransactionsListener implements ActionListener
	{ public void actionPerformed(ActionEvent othertransactions)
		{
		OtherTransactions();
		otherClicked = true;
	}}
	
	class submitListener implements ActionListener
	{ public void actionPerformed(ActionEvent submit)
		{
		chargeLoop = 2;
	}}
	
	class goAheadListener implements ActionListener
	{ public void actionPerformed(ActionEvent goAhead)
		{
		if (accountAnswer.equals("deposit") && accountType.equals("checking"))
		{
			frame.remove(panelMoneyAction);
			frame.remove(panelCheckingSaving);
			frame.remove(panelMoneyActionTextBox);
			frame.remove(panelMega);
			frame.remove(otherTransactionArea);
			panelMoneyActionTextBox.add(submit);
			frame.getContentPane().add(BorderLayout.NORTH, panelMoneyActionTextBox);
			frame.getContentPane().add(BorderLayout.CENTER, panelMega);
			frame.getContentPane().add(BorderLayout.WEST, otherTransactionArea);
			while (chargeLoop == 0)
			{
				System.out.print(chargeLoop);
				amount = Integer.parseInt(moneyActionTextBox.getText());
				if (amount >= 0)
				break;
					
			}
			//amount = Integer.parseInt(moneyActionTextBox.getText());
			CardServices.card[Main.userId].setCheckingBalance(CardServices.card[Main.userId].getCheckingBalance() + amount);
			frame.remove(otherTransactionArea);
			frame.remove(logIn);
			frame.repaint();
			frame.revalidate();
			float cBalance = CardServices.card[Main.userId].getCheckingBalance();
			float sBalance = CardServices.card[Main.userId].getSavingsBalance();
			int uses = CardServices.card[Main.userId].getAccountUse();
			otherTransactionArea = new JTextArea("Your checkings account balance is: $"+cBalance+" and you savings balance is: $"+sBalance+" and you have used your savings account: "+uses+" times this month",10,10);
			frame.getContentPane().add(BorderLayout.WEST, otherTransactionArea);
			otherTransactionArea.setEditable(false);
			otherTransactionArea.setLineWrap(true);
			otherTransactionArea.setWrapStyleWord(true);
			frame.repaint();
			frame.revalidate();
			}
			
			
		
		if (accountAnswer.equals("deposit") && accountType.equals("saving"))
		{
			frame.remove(panelMoneyAction);
			frame.remove(panelCheckingSaving);
			frame.remove(panelMoneyActionTextBox);
			frame.remove(panelMega);
			frame.remove(otherTransactionArea);
			if(CardServices.card[Main.userId].getAccountUse() <= 5)
			{
			CardServices.card[Main.userId].setAccountUse(CardServices.card[Main.userId].getAccountUse() + 1);
			}
			else {
				frame.getContentPane().add(BorderLayout.CENTER, chargeCheckOptions);
					
					while (chargeLoop == 0)
					{
						System.out.print(chargeLoop);
					}
						if (chargeAnswer.equals("yes")) 
						{
						CardServices.card[Main.userId].setAccountUse(CardServices.card[Main.userId].getAccountUse() + 1);
						panelMoneyActionTextBox.add(submit);
						frame.getContentPane().add(BorderLayout.NORTH, panelMoneyActionTextBox);
						frame.getContentPane().add(BorderLayout.CENTER, panelMega);
						frame.getContentPane().add(BorderLayout.WEST, otherTransactionArea);
						while (chargeLoop == 1)
						{
							System.out.print(chargeLoop);
						}
						amount = Integer.parseInt(moneyActionTextBox.getText());
						CardServices.card[Main.userId].setSavingsBalance(CardServices.card[Main.userId].getSavingsBalance() + amount);
						}
						else if (chargeAnswer.equals("no")) {}
				}
			OtherTransactions();
			
		}
		if (accountAnswer.equals("withdraw") && accountType.equals("checking"))
		{
			frame.remove(panelMoneyAction);
			frame.remove(panelCheckingSaving);
			frame.remove(panelMoneyActionTextBox);
			frame.remove(panelMega);
			frame.remove(otherTransactionArea);
			
		}
		if (accountAnswer.equals("withdraw") && accountType.equals("saving"))
		{
			frame.remove(panelMoneyAction);
			frame.remove(panelCheckingSaving);
			frame.remove(panelMoneyActionTextBox);
			frame.remove(panelMega);
			frame.remove(otherTransactionArea);
			if(CardServices.card[Main.userId].getAccountUse() <= 5)
			{
			CardServices.card[Main.userId].setAccountUse(CardServices.card[Main.userId].getAccountUse() + 1);
			}
			else {
				frame.getContentPane().add(BorderLayout.CENTER, chargeCheckOptions);
					
					while (chargeLoop == 0)
					{
						System.out.print(0);
					}
						if (chargeAnswer.equals("yes")) 
						{
						CardServices.card[Main.userId].setAccountUse(CardServices.card[Main.userId].getAccountUse() + 1);
						frame.getContentPane().add(BorderLayout.NORTH, panelMoneyActionTextBox);
						frame.getContentPane().add(BorderLayout.CENTER, panelMega);
						frame.getContentPane().add(BorderLayout.WEST, otherTransactionArea);
						int loop = 0;
						while (loop == 0)
						{
							amount = Integer.parseInt(moneyActionTextBox.getText());
							if (amount<= CardServices.card[Main.userId].getCheckingBalance() )
							{
							GUI.cash();
							CardServices.card[Main.userId].setCheckingBalance(CardServices.card[Main.userId].getCheckingBalance() - Main.amount);
							break;
							}
							else if (amount >= CardServices.card[Main.userId].getCheckingBalance())
							{
							System.out.println("too much");
							}
						}
						}
						else if (chargeAnswer.equals("no")) {}
						OtherTransactions();
				}
			
		}
		if (accountAnswer.equals("transfer") && accountType.equals("checking"))
		{
			frame.remove(panelMoneyAction);
			frame.remove(panelCheckingSaving);
			frame.remove(panelMoneyActionTextBox);
			frame.remove(panelMega);
			frame.remove(otherTransactionArea);
			int loop = 0;
			while (loop == 0)
			{
				if (chargeAnswer.equals("yes")) 
				{
					
					
				}
				else if (chargeAnswer.equals("no"))
						loop++;
			}
		}
		if (accountAnswer.equals("transfer") && accountType.equals("saving"))
		{
			frame.remove(panelMoneyAction);
			frame.remove(panelCheckingSaving);
			frame.remove(panelMoneyActionTextBox);
			frame.remove(panelMega);
			frame.remove(otherTransactionArea);
			
		}
		
		frame.getContentPane().removeAll();
		frame.remove(panelOtherTransactions);
		frame.remove(panelFastCashTextBox);
		frame.remove(FastCashText);
		panelCheckingSaving.removeAll();
		//panelCashOptions.removeAll();
		//panelFastCashTextBox.removeAll();
		//panelOtherTransactions.removeAll();
		//panelMoneyActionTextBox.removeAll();
		
		transactionScreen();
		
	}}
	
	class chargeCheckYesListener implements ActionListener
	{ public void actionPerformed(ActionEvent chargeCheckYes)
		{
		chargeAnswer = "yes";
		chargeLoop = 1;
	}}
	
	class chargeCheckNoListener implements ActionListener
	{ public void actionPerformed(ActionEvent chargeCheckNo)
		{
		chargeAnswer = "no";
		chargeLoop = 1;
		
	}}
	
	public void transactionScreen()
	{
		frame.remove(logIn);
		frame.remove(panelCardPinSuper);
		frame.remove(panelMega);
		GUI.frame.repaint();
		frame.revalidate();
		GUI.logIn = new JTextArea("Select a fast cash option or other transactions. To cancel this transaction"
				+ ", press 'End Transaction' in 'Other Transactions'.",10,10);
		
		GUI.logIn.setEditable(false);
		GUI.logIn.setLineWrap(true);
		GUI.logIn.setWrapStyleWord(true);
		//GUI.frame.repaint();
		frame.revalidate();
		GUI.frame.getContentPane().add(BorderLayout.WEST, GUI.logIn);
		frame.getContentPane().add(BorderLayout.SOUTH, panelOtherTransactions);
		frame.getContentPane().add(BorderLayout.NORTH, panelFastCashTextBox);
		frame.getContentPane().add(BorderLayout.WEST, FastCashText);
		frame.getContentPane().add(BorderLayout.CENTER, panelCashOptions);
		frame.revalidate();
		
	}
	
	public void FastCashScreen()
	{
		JLabel fastCashLabelFinal = new JLabel("Amount:"
				+ "" + fastCashAmount);
		fastCashFinalPanel.add(fastCashLabelFinal);
		frame.getContentPane().add(BorderLayout.EAST, fastCashFinalPanel);
		frame.revalidate();
	}
	
	public void OtherTransactions()
	{
		textBoxActive = 2;
		frame.getContentPane().removeAll();
		frame.remove(logIn);
		frame.remove(panelCardPinSuper);
		frame.remove(panelMega);
		frame.remove(panelOtherTransactions);
		frame.remove(panelFastCashTextBox);
		frame.remove(FastCashText);
		frame.remove(panelCashOptions);
		frame.repaint();
		//frame.revalidate();
		//JLabel moneyActionLabelAction = new JLabel("Action: "+ accountAnswer);
		//panelMoneyActionTextBox.add(moneyActionLabelAction);
		frame.getContentPane().add(BorderLayout.EAST, panelMoneyAction);
		frame.getContentPane().add(BorderLayout.SOUTH, panelCheckingSaving);
		frame.getContentPane().add(BorderLayout.NORTH, panelMoneyActionTextBox);
		frame.getContentPane().add(BorderLayout.CENTER, panelMega);
		frame.getContentPane().add(BorderLayout.WEST, otherTransactionArea);
		
		frame.repaint();
		frame.revalidate();
		
	}
	
	//clear all aspects of the guis
	public void clear()
	{
		frame.getContentPane().removeAll();
		panelMega.removeAll();
		panelMoneyAction.removeAll();
		panelSideRight.removeAll();
		panelCheckingSaving.removeAll();
		panelCardNumSuper.removeAll();
		panelCardPinSuper.removeAll();
		fastCashFinalPanel.removeAll();
		panelOtherTransactions.removeAll();
		panelMoneyActionTextBox.removeAll();
		chargeCheckOptions.removeAll();
		panelCashOptions.removeAll();
		panelFastCashTextBox.removeAll();
		
		
		logIn = new JTextArea(" "
				+ " "
				+ " "
				+ "Please log into your account. "
				+ "Enter your Account Card Number and click 'ENT'. When your card is approved, enter your PIN."
				+ " on the number pad. This will then allow you to enter your Pin. If nothing happens, try again.",10,10);
		
		textBox = new JTextField(9);
		pinNumBox = new JPasswordField(4);
		fastCashTextBox = new JTextField(5);
		moneyActionTextBox = new JTextField();
		
		textBoxActive = 0;
		ContinueAnswer = 0;
		proceed = 10;
		pinNumEntered = false;
		fastCashAmount = 0;
		accountAnswer = null;
		accountType = null;
		chargeAnswer = "null";
		otherClicked = false;
		frame.repaint();
		frame.revalidate();
		frame.dispose();

		
	}
}