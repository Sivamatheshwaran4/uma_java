package Interview_Raj;

public class CarDto {

	public String carType ;
	
	public String getCarType() {
		return carType;
	}

	public CarDto(String carType, int salesYear) {
		super();
		this.carType = carType;
		this.salesYear = salesYear;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int getSalesYear() {
		return salesYear;
	}

	public void setSalesYear(int salesYear) {
		this.salesYear = salesYear;
	}

	public int salesYear ;
	
	
}
