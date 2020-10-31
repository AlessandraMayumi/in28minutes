package com.example.in28minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class In28minutesApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl();

//		binarySearch.binarySearch(numbers, numberToSearchFor);
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);

		SpringApplication.run(In28minutesApplication.class, args);

//		SomeSearchImp searchImp = context.getBean(SomeSearchImpl.class);
//
//		searchImp.binarySearch(new int[] {1,3,2},5);

	}

}
