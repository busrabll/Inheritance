import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome!!!");
		
		String transactions = "transactions...\n"
				            + "1 : Programmer transactions\n"
				            + "2 : Manager transactions\n"
				            + "q : Exit";
		System.out.println("**************************");
		System.out.println(transactions);
		System.out.println("*************************");
		
		while(true) {
			
			System.out.print("please select transaction: ");
			String process = scanner.nextLine();
			
			if (process.equals("q")) {
				
				System.out.println("Exiting the program");
				break;
			}
			else if (process.equals("1")) {
				
				Programmer programmer = new Programmer(988, "Busra", "Bal", "python, C, java, ruby");
				String programmerTransactions = "Programmer transactions:\n "
						                   +"1 : To format\n"
						                   +"2 : Information\n"
						                   +"q : Exit";
				System.out.println(programmerTransactions);
				
				while(true) {
					
					System.out.print("please select transaction: ");
					String programmer_transactions = scanner.nextLine();
					
					if (programmer_transactions.equals("q")) {
						
						System.out.println("Exiting");
						break;
					}
					else if(programmer_transactions.equals("1")) {
						
						System.out.print("Enter operating system: ");
						String operatingSystem = scanner.nextLine();
						programmer.toFormat(transactions);	
					}
					else if(programmer_transactions.equals("2")) {
						
						programmer.information();
					}
					else {
						System.out.println("Invalid transaction!!!");
					}
				}
			}
			else if (process.equals("2")) {
				
				Manager manager = new Manager(310, "Beyza", "Bal", 10);
				String managerOperations = "Manager operations:\n "
                                          +"1 : Make a raise\n"
		                                  +"2 : Information\n"
		                                  +"q : Exit";
				System.out.println(managerOperations);
				
				while(true) {
					
					System.out.println("please select transaction: ");
					String manager_operations = scanner.nextLine();
					
					if (manager_operations.equals("q")) {
						
						System.out.println("Exiting");
						break;
					}
					else if (manager_operations.equals("1")) {
						
						System.out.print("Enter the desired raise amount: ");
						int raise_amount = scanner.nextInt();
						scanner.nextLine();
						manager.makeARaise(raise_amount);
					}
					else if (manager_operations.equals("2")) {
						
						manager.information();
					}
					else {
						
						System.out.println("Invalid transaction!!!");
					}
				}
			}
			else {
				
				System.out.println("Invalid transaction");		
			}
		}
	}
}