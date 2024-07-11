package Practices;

public class Circule_Area_Find extends CirculeDto {
	
	public Circule_Area_Find(Double radious) {
		super(radious);
	}

	void getArea(Double r) {
		double area = 3.14 * r * r;
		System.out.println("Area : " +area);
	}

	void getCircum(Double r) {
		double Circum = 2 * 3.14 * r;
		System.out.println("Circumference : " +Circum);
	}

	public static void main(String[] args) {

		Circule_Area_Find Circule_Area_Find = new Circule_Area_Find(2.5);
		
		Circule_Area_Find.getArea(Circule_Area_Find.getRadious());
		Circule_Area_Find.getCircum(Circule_Area_Find.getRadious());


		
	}

}
