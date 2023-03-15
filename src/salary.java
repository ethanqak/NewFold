import java.util.Scanner;
/**
 * 
 * @author ETHAN  FERNANDES
 *
 */
public class salary {
		Scanner sc = new Scanner(System.in);
		int basic;
		String name;
		/**
		 * this method derives the Net Salary of an Employee when the
		 * basic salary is entered
		 * @return the Net Salary of the Employee
		 */
		public double NetSal() {
			System.out.println("Enter the name of Employee: ");
			name=sc.nextLine();
			System.out.println("Enter the basic salary: ");
			basic=sc.nextInt();
			double da=(basic*73)/100;
			double hra=(basic*10)/100;
			double gs=basic+da+hra;
			double it=(gs*30)/100;
			double ns=gs-it;
			System.out.println("Employee name = "+name);
			System.out.println("Basic Salary: "+basic);
			System.out.println("House rent allowance: "+hra);
			System.out.println("Gross Salary: "+gs);
			System.out.println("Income tax: "+it);
			System.out.println("Net Salary: "+ns);
			return ns;
		} 
 
	}
	



