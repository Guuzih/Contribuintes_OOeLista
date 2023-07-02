package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import endities.TaxPlayer;



public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPlayer> list = new ArrayList<>();
		
		System.out.println("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Digite os dados do " + i + "o contribuinte: ");
			
			System.out.println("Renda anual com salário: ");
			Double salaryIncome = sc.nextDouble();
			
			System.out.println("Renda anual com prestação de serviço: ");
			Double serviceIncome = sc.nextDouble();
			
			System.out.println("Renda anual com ganho de capital: ");
			Double capitalIncome = sc.nextDouble();
			
			System.out.println("Gastos médicos: ");
			Double healthSpending = sc.nextDouble();
			
			System.out.println("Gastos educacionais: ");
			Double educationSpending = sc.nextDouble();
			
			list.add(new TaxPlayer(salaryIncome, serviceIncome, capitalIncome,healthSpending,educationSpending));
			
		}
		sc.close();

		for (int i=0; i<n; i++) {
			System.out.println("\nResumo do "+ (i+1) + "o contribuinte:\n" + list.get(i));
		}
		
	}

}
