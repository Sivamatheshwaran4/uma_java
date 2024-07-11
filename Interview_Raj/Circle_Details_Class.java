package Interview_Raj;

public class Circle_Details_Class extends Circle_Dto{

	public Circle_Details_Class(double radious) {
		super(radious);
		// TODO Auto-generated constructor stub
	}

	public void getArea (double radious) {
		Double area = 3.14* radious * radious ;
		System.out.println("area : " + area);
	}
	
  public void getCircumference (double radious) {
		Double circumference = 2 *3.14 * radious;
		System.out.println("circumference : " + circumference);
	}
	
			
	public static void main(String[] args) {
		Circle_Details_Class obj = new Circle_Details_Class(2.5);
		obj.getArea(obj.getRadious());
		obj.getCircumference(obj.getRadious());

	}

}
