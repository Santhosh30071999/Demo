package com.Hospital.data;

import java.util.Scanner;

public class TestHospital {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Hospital hospital1=new Hospital();
		System.out.println("Enter hospitalName");
		String name=scanner.next();
		hospital1.hospitalName=name;
		System.out.println(hospital1.hospitalName);
		hospital1.hospitalNumber=8883459673l;
		System.out.println(hospital1.hospitalNumber);
		hospital1.hospitalLocation="Chennai";
		System.out.println(hospital1.hospitalLocation);
		hospital1.deanName="ajay";
		System.out.println(hospital1.deanName);
		hospital1.deanNumber=8858374837l;
		System.out.println(hospital1.deanNumber);
		
	
		
	}

}
