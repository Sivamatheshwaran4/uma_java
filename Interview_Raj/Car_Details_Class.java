package Interview_Raj;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Car_Details_Class {

	public void show() {
		List<CarDto> list = new ArrayList<CarDto>();
		
		CarDto carDto1 = new CarDto ("tata", 2020);
		CarDto carDto2 = new CarDto ("suzuki", 2010);
		CarDto carDto3 = new CarDto ("toyoto", 2020);
		CarDto carDto4 = new CarDto ("tata", 2021);
		CarDto carDto5 = new CarDto ("bmw", 2022);
		
		list.add(carDto1);
		list.add(carDto2);
		list.add(carDto3);
		list.add(carDto4);
		list.add(carDto5);
		
		System.out.println("Count of car sales by type : ");
		Map<String, Long> map =	list.stream().collect(Collectors.groupingBy((CarDto::getCarType) , Collectors.counting()));
		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : Count : " +  e.getValue()));
		System.out.println("--------------------");
		
		System.out.println("Sum of car sales by year : ");
		Map<Object, Long> yearMap = list.stream()
				.collect(Collectors.groupingBy((CarDto -> CarDto.getSalesYear()), Collectors.counting()));
		yearMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : Count : " +  e.getValue()));
		System.out.println("--------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_Details_Class obj = new Car_Details_Class();
		obj.show();
	}

}
