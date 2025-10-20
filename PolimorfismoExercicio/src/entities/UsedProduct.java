package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
private LocalDate manufactureDate;

public UsedProduct(String name, Double price, LocalDate manufactureDate)
{
	super(name, price);
	this.manufactureDate = manufactureDate;
}


public LocalDate getManufactureData() {
	
	return manufactureDate;
	
}
public void setManufactureDate(LocalDate manufactureDate) {
	this.manufactureDate = manufactureDate;
}

	@Override
	public String priceTag() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Data que foi feito o pagamento: "
				+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
	
	
	
}
