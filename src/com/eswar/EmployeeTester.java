package com.eswar;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeTester {

	public static void main(String[] args) {

		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Pavan" , 1000));
		l.add(new Employee("Yogi" , 2000));
		l.add(new Employee("Yeswanth" , 3000));
		l.add(new Employee("Mohan Sai" , 4000));
		l.add(new Employee("Manju" , 5000));
		l.add(new Employee("Indra" , 6000));
		Predicate<Employee>p=e->e.salary>3000;
		for (Employee e1: l) {
			if (p.test(e1)) {
				System.out.println(e1.name + ":" + e1.salary);
			}
		}
	}

}
