package Practices;

public class CarDto {

	int id ;
	String car;
	Long Price ;
	int salesYear;
	
	
	public CarDto(int id, String car, Long price, int salesYear) {
		super();
		this.id = id;
		this.car = car;
		Price = price;
		this.salesYear = salesYear;
	}
	public int getSalesYear() {
		return salesYear;
	}
	public void setSalesYear(int salesYear) {
		this.salesYear = salesYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public Long getPrice() {
		return Price;
	}
	public void setPrice(Long price) {
		Price = price;
	}
	

	

}
