package Java8Topics.StreamApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ColelectionExe2 {
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
              //  .sorted((emp1, emp2) -> emp1.getName().compareTo(emp2.getName()))
                .filter(emp -> emp.getSalary()>=50000)
                .map(empname -> empname.getName())
                .forEach(ele -> System.out.println(ele));
        System.out.println("------------------");
        
        System.out.println("Hashmap Iteration >>>>>>>>");
        HashMap<String , Integer> hashMap = new HashMap<>();
        hashMap.put("Siva", 1689);
        hashMap.put("Uma", 96);
        hashMap.put("Arasu", 46);
        hashMap.put("Black", 453);
        hashMap.put("Alaga", 26);
       for (String mapkey : hashMap.keySet()){
           System.out.println("key : " + mapkey + "value :" + hashMap.get(mapkey));
       }
        System.out.println("----------------");

        System.out.println("Sort Map Using Steam >>>>>>>>.");
       hashMap
               .entrySet()
               .stream()
               .sorted(Map.Entry.comparingByKey())
               .forEach(emp -> System.out.println(emp));
        System.out.println("-----------------");

        hashMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(emp -> System.out.println(emp));

        System.out.println("-----------------");

        List<Integer> list=
        hashMap
                .values()
                .stream()
                .collect(Collectors.toList());
        System.out.println("Get hashmap value in Stream : " +list);

    }
}
