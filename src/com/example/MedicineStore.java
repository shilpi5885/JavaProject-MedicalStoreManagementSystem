package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MedicineStore {
	Scanner sc = new Scanner(System.in);
	private static MedicineStore instance;

	private ArrayList<Medicine> medicineList = new ArrayList<Medicine>();
	
	private MedicineStore() {
		
	}
	
	public static MedicineStore getInstance() {
		if(instance == null) {
			instance = new MedicineStore(); 
		}
		return instance;
	}

	public void add(Medicine medicine) {
		medicineList.add(medicine);
	}

	public void remove(Medicine medicine) {
		medicineList.remove(medicine);
	}

	public ArrayList<Medicine> getMedicineList() {
		return medicineList;
	}

	public Medicine getMedicine(String name) {
		for (Medicine medicine : medicineList) {
			if (name.equalsIgnoreCase(medicine.name)) {
				return medicine;
			}
		}
		return null;
	}

	public void update(Medicine medicine) {
		System.out.println("\"Select \\n 1.Update Medicine Name\\n2. Update Medicine Brand"
				+ "\\n3.Update Medicine Price\\n4.Update medicine type");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter new name of medicine");
			medicine.name = sc.next();
			break;
		case 2:
			System.out.println("Enter brand name of medicine");
			medicine.brandName = sc.next();
			break;
		case 3:
			System.out.println("Enter medicine price");
			medicine.price = sc.nextInt();
			break;
		case 4:
			Main.setMedicineType(medicine); 
		}
	}
}
