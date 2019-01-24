package com.fileapp.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.fileapp.model.Employee;

public class TestComparator {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "dileep", "42222", "11111"));
		empList.add(new Employee(2, "raja", "122", "11111"));
		empList.add(new Employee(3, "karthik", "122", "11111"));
		empList.add(new Employee(4, "sampath", "12233", "11111"));
		//Collections.sort(empList, new EmployeeComparator());
		empList.sort(Comparator.comparing(Employee::getEsalary).thenComparing(Employee::getEname));
		/*for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i));
		}*/
		
		empList.stream().forEach(System.out::println);
		
			}
}
