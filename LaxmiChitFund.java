import java.util.*;
class LaxmiChitFund
{
	static String username;
	static long mobile;
	static String pan;
	static long adhar;
	static String address;
	static int pin;
	static double bal;
	final static long accountNumber = 123412341234l;
	final static String ifscCode = "LCF1234";
	static ArrayList<String> statement = new ArrayList<>();

	public static void main(String [] args)
	{
		welcome();
	}
	
	public static void welcome()
	{
		for(;;)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("     *** Welcome***");
			System.out.println("      Laxmi Chit Fund        ");
			System.out.println();
			System.out.println("1. Existing User ");
			System.out.println("2. Create Bank Account ");
			System.out.println();
			System.out.print("Enter an option: ");
			int opt = sc.nextInt();
			switch(opt)
			{
				case 1:
					login(sc);
					break;
				
				case 2:
					createAccount(sc);
					break;

				default:		
					System.out.println("Wrong Option Entered");
			}
		}
	}

	public static void login(Scanner sc)
	{
		if(username!=null)
		{
			for(int i =1; i<=3; i++)
			{	
				System.out.println();
				System.out.println("       ****** Login Module ******");
				System.out.println();
				System.out.print("Mobile: ");
				long mobile1 = sc.nextLong();
				System.out.print("Pin: ");
				int pin1 = sc.nextInt();

				if((mobile==mobile1)&&(pin==pin1))
				{
					homePage(sc);
				}
				else
				{
				System.out.println();
				System.out.println("Wrong Credentials Entered");
				System.out.println();
				}
			}
			System.exit(0);
		}
		else
		{
			System.out.println();
			System.out.println("Create Your Account First " );
			System.out.println();
		}
	}

	public static void createAccount(Scanner sc)
	{

		System.out.println();
		System.out.println("        **** Account Creation Module *****   ");
		System.out.println();
		System.out.print("Username: ");
		sc.nextLine();
		username = sc.nextLine();
		System.out.print("Mobile: ");
		mobile = sc.nextLong();
		System.out.print("Adhar: ");
		adhar = sc.nextLong();
		System.out.print("Pancard: ");
		pan = sc.next();
		System.out.print("Address: ");
		sc.nextLine();
		address = sc.nextLine();
		System.out.print("Pin : ");
		pin = sc.nextInt();
		System.out.print(" Enter the amount to deposit: ");
		bal = sc.nextDouble();
		statement.add("Deposit : "+bal);

		System.out.println();
		System.out.println("Account Create Successfully");
		System.out.println();
	}
	
	public static void homePage(Scanner sc)
	{
		for(;;)
		{
			System.out.println();
			System.out.println();
			System.out.println("     *** Home Page Module *** "    );
			System.out.println();
			System.out.println("1. Deposit Amount ");
			System.out.println("2. Withdraw Amount ");
			System.out.println("3. Check Balance ");
			System.out.println("4. Statement ");
			System.out.println("5.Edit Profile ");
			System.out.println("6. Logout ");
			System.out.println();
			System.out.print("Enter an option: ");
			int option = sc.nextInt();
			System.out.println();
			switch(option)
			{
				case 1:
					deposit(sc);
					break;

				case 2:
					withdraw(sc);
					break;

				case 3:
					checkBalance(sc);
					break;

				case 4:
					statement(sc);
					break;

				case 5:
					editProfile(sc);
					break;

				case 6:
					System.exit(0);

				default:
					System.out.println(" Wrong Option entered");
			}
		}
	}

	public static void deposit(Scanner sc)
	{
		System.out.println("  ***** Deposit Amount ***** ");
		System.out.println();
		System.out.println("Enter the Amount: ");
		double depositAmount = sc.nextDouble();
		bal += depositAmount;
		statement.add("Deposit: "+ depositAmount);
		System.out.println();
		System.out.println("Amount Deposited Successfully. ");	
	}

	public static void withdraw(Scanner sc)
	{
		for(int i= 1; i<=3; i++)
		{
			System.out.println("  ***** Withdraw Amount ***** ");
			System.out.println();
			System.out.println("Enter the Amount: ");
			double withdrawAmount = sc.nextDouble();	
			System.out.println("Enter your pin: ");
			int pin1 = sc.nextInt();
			if(pin1==pin)
			{
				if(withdrawAmount<=bal)
				{
					bal-=withdrawAmount;
					statement.add("Withdraw: "+withdrawAmount);
					System.out.println("Amount Debited Successfully ");
				}
				else
				{
					System.out.println("Insufficient Funds");
				}
				return;
			}
			else
			{
				System.out.println();
				System.out.println("Wrong Pin Entered.");
			}
		}
		System.out.println();
		System.out.println("Your account has been deactivated for 24 hrs.");
		System.exit(0);
	}

	public static void checkBalance(Scanner sc)
	{
		for(int i= 1; i<=3; i++)
		{
			System.out.println("  ****** Check Bank Balance ******* ");
			System.out.println("Enter your pin: ");
			int pin1 = sc.nextInt();
			if(pin1==pin)
			{
				System.out.println();
				System.out.println("Account Balance is : "+bal+ "rs");
				return;
			}
			else
			{
				System.out.println();
				System.out.println("Wrong Pin Entered.");
			}
		}
		System.out.println();
		System.out.println("Your account has been deactivated for 24 hrs.");
		System.exit(0);
	}

	public static void statement(Scanner sc)
	{
		System.out.println("****** Statement ****** ");
		System.out.println();
		for(String tran : statement)
		{
			System.out.println(tran);
		}
	}

	public static void editProfile(Scanner sc)
	{
		System.out.println("****** Edit Profile ******");
		System.out.println();
		System.out.println("1. Username ");
		System.out.println("2. Mobile ");
		System.out.println("3. Address ");
		System.out.println("4. Pin ");
		System.out.print("Enter an option: ");
		int opt1 = sc.nextInt();
		switch(opt1)
		{
			case 1:
				updateUsername(sc);
				break;

			case 2:
				updateMobile(sc);
				break;

			case 3:
				updateAddress(sc);
				break;

			case 4:
				updatePin(sc);
				break;

			default:
				System.out.println(" Wrong Option entered");
		}		
	}

	
	public static void updateUsername(Scanner sc)	
	{
		System.out.println();
		System.out.println("Enter new Username: ");
		sc.nextLine();	
		String username1 = sc.nextLine();

		for(int i= 1; i<=3; i++)
		{
			System.out.println("Enter Pin: ");
			int pin1 = sc.nextInt();

			if(pin==pin1)
			{
				System.out.println();
				username = username1;
				System.out.println("Username updated Successfully ");
				return;
			}
			else
			{
				System.out.println();
				System.out.println("Wrong Pin Entered.");
			}
			
		}
		System.out.println();
		System.out.println("Your account has been deactivated for 24 hrs.");
		System.exit(0);
	}
		
	public static void updateMobile(Scanner sc)	
	{
		System.out.println();
		System.out.println("Enter new Mobile: ");	
		long mobile1= sc.nextLong();

		for(int i= 1; i<=3; i++)
		{
			System.out.println("Enter Pin: ");
			int pin1 = sc.nextInt();

			if(pin==pin1)
			{
				System.out.println();
				mobile = mobile1;
				System.out.println("Mobile number updated Successfully ");
				return;
			}
			else
			{
				System.out.println();
				System.out.println("Wrong Pin Entered.");
			}
			
		}
		System.out.println();
		System.out.println("Your account has been deactivated for 24 hrs.");
		System.exit(0);
	}

	public static void updateAddress(Scanner sc)	
	{
		System.out.println();
		System.out.println("Enter new Address: ");
		sc.nextLine();	
		String address1 = sc.nextLine();

		for(int i= 1; i<=3; i++)
		{
			System.out.println("Enter Pin: ");
			int pin1 = sc.nextInt();

			if(pin==pin1)
			{
				System.out.println();
				address = address1; 
				System.out.println("Address updated Successfully ");
				return;
			}
			
			else
			{
				System.out.println();
				System.out.println("Wrong Pin Entered.");
			}
			
		}
		System.out.println();
		System.out.println("Your account has been deactivated for 24 hrs.");
		System.exit(0);
	}

	public static void updatePin(Scanner sc)	
	{
		System.out.println();
		System.out.println("Enter new Pin: ");
		int pin1 = sc.nextInt();

		for(int i= 1; i<=3; i++)
		{
			System.out.println("Enter your mobile number: ");
			long mobile1 = sc.nextLong();

			if(mobile==mobile1)
			{
				System.out.println();
				pin = pin1;
				System.out.println("Pin updated Successfully ");
				return;
			}
			else
			{
				System.out.println();
				System.out.println("Wrong Mobile number Entered.");
			}
			
		}
		System.out.println();
		System.out.println("Your account has been deactivated for 24 hrs.");
		System.exit(0);
	}	
}

	

