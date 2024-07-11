package Practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Car_Function_Stream {

	public static void main(String[] args) {
		List<CarDto> carList = new ArrayList<CarDto>();
		CarDto car1 = new CarDto(1, "Tata", 123456l, 2020);
		CarDto car2 = new CarDto(2, "Bmw", 12000l, 2018);
		CarDto car3 = new CarDto(3, "Honda", 1234000l, 2020);
		CarDto car4 = new CarDto(4, "TATA", 550000l, 2016);
		CarDto car5 = new CarDto(5, "Demo", 60000l, 2017);

		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);
		carList.add(car5);
		
		System.out.println("Count of car sales by type");
		Map<String, Long> countByCarName = carList.stream()
				.collect(Collectors.groupingBy(CarDto -> CarDto.getCar().toLowerCase(), Collectors.counting()));
		// .collect(Collectors.groupingBy(CarDto::getCar, Collectors.counting()))
		countByCarName.forEach((name, count) -> System.out.println(name + ": " + count));
		System.out.println("---------------");

		Map<Object, Long> countSalesByYear = carList.stream()
				.collect(Collectors.groupingBy(CarDto -> CarDto.getSalesYear(), Collectors.counting()));
		countSalesByYear.forEach((name, count) -> System.out.println(name + ": " + count));
		System.out.println("---------------");
		Long sum = countSalesByYear.values().stream().mapToLong(Long::longValue).sum();
		System.out.println("Total Sum of Count Result : " + sum);
	}

}
