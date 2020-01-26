package com.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Staff {

    private String name;
    private int age;
    private BigDecimal salary;
    
	public Staff(String string, int i, BigDecimal bigDecimal) {
		this.name = string;
		this.age = i;
		this.salary = bigDecimal;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public BigDecimal getSalary() {
		return salary;
	}
}

public class MapEx {

    public static void main(String[] args) {

        List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );

        //Before Java 8
        List<String> result = new ArrayList<>();
        for (Staff x : staff) {
            result.add(x.getName());
        }
        System.out.println("Before Java 8 -> " + result); 

        //Java 8
        List<String> collect = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println("In Java 8 -> " + collect); 

        staff.stream().map(x -> x.getName()).forEach(System.out::println);
       

    }

}