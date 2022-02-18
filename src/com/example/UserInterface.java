package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	Scanner sc = new Scanner(System.in);
	private static UserInterface instance;
	
	private UserInterface() {
		
	}
	
	public static UserInterface getInstance() {
		if(instance == null) {
			instance = new UserInterface(); 
		}
		return instance;
	}

	public void print(ArrayList<Medicine> medicineList) {
		for (Object medicine : medicineList) {
			System.out.println(medicine);
		}
	}

	public int showMainMenu() {
		System.out.println(
				"Select \n1.Add Medicines\n2.Remove Medicines" + "\n3.Update Medicines\n4.Print Medicines\n5.Exit");
		int choice = sc.nextInt();
		return choice;
	}

	public String selectMedicine() {
		System.out.println("enter the name of medicine");
		String userSelection = sc.next();

		return userSelection;
	}
}
