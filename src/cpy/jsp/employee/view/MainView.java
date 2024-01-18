package cpy.jsp.employee.view;

import java.util.Scanner;

public class MainView {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		boolean loop = true;

		while (loop) {

			System.out.println(
					"--------------------------WELCOME--------------------------\n" + "PLESE SELECT THE OPERATION\n"
							+ "1.SAVE Employee\n" + "2.DISPLAY ALL Employee\n" + "3.SEARCH Employee\n"
							+ "4.UPDATE Employee\n" + "5.DELETE Employee\n" + "6.EXIT\n");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1: {
				View.saveEmployee();
				break;
			}

			case 2: {
				View.displayAllEmployees();
				break;
			}
			case 3: {
				View.getEmployeeById();
				break;
			}
			case 4: {
				View.updateEmployee();
				break;
			}
			case 5: {
				View.deleteEmployee();
				break;
			}
			case 6: {
				loop = false;
				System.out.println("THANK YOU");
				scanner.close();
				break;
			}

			}
		}
	}

}
