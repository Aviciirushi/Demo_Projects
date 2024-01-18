package cpy.jsp.employee.view;

import java.time.LocalDateTime;

import java.util.List;
import java.util.Scanner;

import cpy.jsp.employee.model.Employee;
import cpy.jsp.employee.controller.controller;

public class View {

	private static Scanner scanner = new Scanner(System.in);

	private static controller controller = new controller();

	public static void saveEmployee() {
		System.out.println("Enter the Eployee eid: \n");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter the Employee Name: \n");
		String Name = scanner.nextLine();

		System.out.println("Enter the Eployee age: \n");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter the Employee contact: \n");
		double contact = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Enter the Employee Designation: \n");
		String Designation = scanner.nextLine();

		System.out.println("Enter the Employee date of joining Date in format(yyyy-mm-ddt):  \n");
		String DOJ = scanner.nextLine();
		LocalDateTime date = LocalDateTime.parse(DOJ + "T00:00:00");

		Employee employee = new Employee(id, Name, contact, age, Designation, date);

		if (controller.saveEmployee(employee) != null) {
			System.out.println("Employee save!");
		} else {
			System.out.println("Studnet not saved!!");
		}

	}

	public static void deleteEmployee() {
		System.out.println("Enter the Eployee eid: \n");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter the Employee Name: \n");
		String Name = scanner.nextLine();

		System.out.println("Enter the Eployee age: \n");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter the Employee contact: \n");
		double contact = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Enter the Employee Designation: \n");
		String Designation = scanner.nextLine();

		System.out.println("Enter the Employee date of joining Date in format(yyyy-mm-ddt):  \n");
		String DOJ = scanner.nextLine();
		LocalDateTime date = LocalDateTime.parse(DOJ + "T00:00:00");

		Employee employee = new Employee(id, Name, contact, age, Designation, date);

		if (controller.deleteEmployee(employee)) {
			System.out.println("Employee deleted successfully.");
		} else {
			System.out.println("Failed to delete Employee.");
		}

	}

	public static void getEmployeeById() {
		System.out.println("Enter the Employee eid to retrieve: ");
		int eid = scanner.nextInt();
		scanner.nextLine();

		Employee Employee = controller.getEmployeeById(eid);

		if (Employee != null) {

			displayEmployee(Employee);

		} else {
			System.out.println("Employee not found.");
		}
	}

	public static void displayAllEmployees() {

		List<Employee> employees = controller.getAllEmployees();
		if (employees.isEmpty()) {
			System.out.println("EmployeeS ARE NOT PRESENT");
		} else {
			for (Employee employee : employees) {
				displayEmployee(employee);
			}
		}
	}

	private static void displayEmployee(Employee Employee) {
		System.out.println("ID: " + Employee.getEid());
		System.out.println("Name: " + Employee.getName());
		System.out.println("Age: " + Employee.getAge());
		System.out.println("Contact: " + Employee.getContact());
		System.out.println("Designation: " + Employee.getDesignation());
		System.out.println("DOB: " + Employee.getDOJ());
		System.out.println("--------------------------------------");
	}

	public static void updateEmployee() {
		displayAllEmployees();
		System.out.println("Enter the Employee id you want to update: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		boolean loop = true;
		for (Employee Employee : controller.getAllEmployees()) {
			if (id == Employee.getEid()) {
				System.out.println("Choose an option to update: \n" + "1. Update ID \n" + "2. Update Name: \n"
						+ "3. Update Percentage" + "4. Update DOB: \n" + "5. Update Age: \n" + "6.Update Designation\n"
						+ "7. Update All: \n" + "8. Exit");
				int choice = scanner.nextInt();
				scanner.nextLine();

				while (loop) {
					switch (choice) {
					case 1: {
						System.out.println("Enter the new id: ");
						int newEid = scanner.nextInt();
						scanner.nextLine();
						Employee.setEid(newEid);
						break;
					}
					case 2: {
						System.out.println("Enter the new name: ");
						String newName = scanner.nextLine();
						Employee.setName(newName);
						break;
					}
					case 3: {
						System.out.println("Enter the new Contact: ");
						int newContact = scanner.nextInt();
						scanner.nextLine();
						Employee.setContact(newContact);
						break;
					}
					case 4: {
						System.out.println("Enter the new DOJ: ");
						String newDOJ = scanner.nextLine();
						LocalDateTime date = LocalDateTime.parse(newDOJ + "T00:00:00");
						Employee.setDOJ(date);
						break;
					}
					case 5: {
						System.out.println("Enter the new Age: ");
						int newAge = scanner.nextInt();
						scanner.nextLine();
						Employee.setAge(newAge);
						break;
					}

					case 6: {
						System.out.println("Enter the new name: ");
						String newDesignation = scanner.nextLine();
						Employee.setDesignation(newDesignation);
						break;
					}
					case 7: {
						System.out.println("Enter the new id: ");
						int newEid = scanner.nextInt();
						scanner.nextLine();
						Employee.setEid(newEid);

						System.out.println("Enter the new name: ");
						String newName = scanner.nextLine();
						Employee.setName(newName);

						System.out.println("Enter the new Contact: ");
						int newContact = scanner.nextInt();
						scanner.nextLine();
						Employee.setContact(newContact);

						System.out.println("Enter the new DOJ: ");
						String newDOJ = scanner.nextLine();
						LocalDateTime date = LocalDateTime.parse(newDOJ + "T00:00:00");
						Employee.setDOJ(date);

						System.out.println("Enter the new Age: ");
						int newAge = scanner.nextInt();
						scanner.nextLine();
						Employee.setAge(newAge);
						
						System.out.println("Enter the new name: ");
						String newDesignation = scanner.nextLine();
						Employee.setDesignation(newDesignation);
						break;
					}
					case 8: {
						loop = false;
						displayAllEmployees();
						System.out.println("THANK YOU");
						scanner.close();
						break;
					}

					}
				}

			}
		}
	}
	
	public static void SortBy() {
		boolean loop = true;
		while (loop) {
			System.out.println("Choose an option: \n" + "1. Display all Employees \n" + "2. Sort Employees by ID \n"
					+ "3. Sort Employees by Name\n" + "4. Sort Employees by Contact \n" + "5. Sort Employees by DOB\n"
					+ "6. Sort Employees by Age\n" + "7. Exit");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				displayAllEmployees();
				break;
			case 2:
				controller.sortById();
				System.out.println("Employees sorted by ID.");
				displayAllEmployees();
				break;
			case 3:
				controller.sortByName();
				System.out.println("Employees sorted by Name.");
				displayAllEmployees();
				break;
			case 4:
				controller.sortByContact();
				System.out.println("Employees sorted Contact.");
				displayAllEmployees();
				break;
			case 5:
				controller.sortByDOJ();
				System.out.println("Employees sorted by DOJ.");
				displayAllEmployees();
				break;
			case 6:
				controller.sortByAge();
				System.out.println("Employees sorted by Age.");
				displayAllEmployees();
				break;
			case 7:
				controller.SortByDesignation();
				System.out.println("Employees sorted by Name.");
				displayAllEmployees();
			case 8:
				loop = false;
				System.out.println("Thank You");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
				break;
			}
		}
	}


}
