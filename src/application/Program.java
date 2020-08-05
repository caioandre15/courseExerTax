package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PhysicalPerson;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Physical person or legal person (p/l)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
			if (resp == 'p') {
				System.out.print("Health expenditures: ");
				double healthSpending = sc.nextDouble();
				taxPayers.add(new PhysicalPerson(name, annualIncome, healthSpending));
			} 
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				taxPayers.add(new LegalPerson(name, annualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double totalTax = 0.0;
		for (TaxPayer t : taxPayers) {
			System.out.println(t);
			totalTax += t.calculateTax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", totalTax);
		
		sc.close();

	}

}
