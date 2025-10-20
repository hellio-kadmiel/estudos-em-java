package entities;

public class ImportedProduct extends Product {
	
	
	private Double customsFee;
	
	public ImportedProduct(String name, Double price, Double customsfee) {
		super(name, price);
		this.customsFee = customsfee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return getPrice() + customsFee;
		
		
	}

	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Cus : $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	
	}
	
	
}
