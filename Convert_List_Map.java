package Practices;

import java.util.ArrayList;
import java.util.List;

public class Convert_List_Map {

	public static void main(String[] args) {
		 List<EmployeePojo> employeePojoList = new ArrayList<>();
	        EmployeePojo e1 = new EmployeePojo("Uma",1,545);
	        EmployeePojo e2 = new EmployeePojo("Rithick",2,55000);
	        EmployeePojo e3 = new EmployeePojo("Vallarasu",3,60342);
	        EmployeePojo e4 = new EmployeePojo("Aishu",4,25000);
	        EmployeePojo e5 = new EmployeePojo("Blacky",5,89000);

	        employeePojoList.add(e1);
	        employeePojoList.add(e2);
	        employeePojoList.add(e3);
	        employeePojoList.add(e4);
	        employeePojoList.add(e5);	  
		 
	        employeePojoList
            .stream()
            .filter(emp -> emp.getSalary()>=50000)
            .map(empname -> empname.getName())
            .forEach(ele -> System.out.println(ele));
	        System.out.println("------------------");
	}
}
