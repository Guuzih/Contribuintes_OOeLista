package endities;

public class TaxPlayer {

	private Double salaryIncome;
	private Double serviceIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;

	public TaxPlayer() {

	}

	public TaxPlayer(Double salaryIncome, Double serviceIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.serviceIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		double imposto = 0;
		if (salaryIncome > 30000 && salaryIncome < 50000) {
			imposto = 10 * salaryIncome / 100;
		} else if (salaryIncome > 50000) {
			imposto = 20 * salaryIncome / 100;
		}

		return imposto;
	}

	public double servicesTax() {
		double imposto = (15 * serviceIncome) / 100;
		return imposto;
	}

	public double capitalTax() {
		double imposto = (20 * capitalIncome) / 100;
		return imposto;
	}

	public double grossTax() {
		return capitalTax() + servicesTax() + salaryTax();
	}

	public double taxRabate() {
		double maxdetutivel = (30 * grossTax()) / 100;
		double dedutiveis = educationSpending + healthSpending;

		return (dedutiveis < maxdetutivel) ? grossTax() - dedutiveis : grossTax() - maxdetutivel;
	}

	public double netTax() {

		return grossTax() - taxRabate();
	}
	
	public String toString() {
		return "Imposto bruto total: " + String.format("%.2f", grossTax())
				+"\nAbatimento: " +  String.format("%.2f", netTax())
				+"\nImposto devido: "+ String.format("%.2f", taxRabate())	
				;
		}
}
