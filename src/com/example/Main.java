package com.example;

import java.util.Scanner;

import com.example.Medicine.MedicineType;

public class Main {
	//MedicineStore medicineStore = MedicineStore.getInstance();
	
	public void handleUserSelection(int choice) {
		UserInterface userInterface = UserInterface.getInstance();

		switch (choice) {
		case 1:
			addMedicine();
			break;
		case 2:
			String userSelection = userInterface.selectMedicine();
			MedicineStore medicineStore = MedicineStore.getInstance();
			Medicine medicine = medicineStore.getMedicine(userSelection);
			medicineStore.remove(medicine);
			break;
		case 3:
			String medicineName = userInterface.selectMedicine();
			MedicineStore medicineStoreForUpdate = MedicineStore.getInstance();
			Medicine medicineForUpdate = medicineStoreForUpdate.getMedicine(medicineName);
			medicineStoreForUpdate.update(medicineForUpdate);
			break;
		case 4:
			MedicineStore medicineStoreForPrint = MedicineStore.getInstance();
			userInterface.print(medicineStoreForPrint.getMedicineList());
			break;
		case 5:
			break;
		default:
		}

	}

	public void addMedicine() {
		MedicineStore medicineStore = MedicineStore.getInstance();
		Vicks vicks = new Vicks();
		vicks.price = 150;
		Sinarest sinarest = new Sinarest();
		sinarest.price = 60;
		Chywanprash chywanprash = new Chywanprash();
		chywanprash.price = 200;
		Crocin crocin = new Crocin();
		crocin.price = 50;
		Dolo dolo = new Dolo();
		dolo.price = 20;

		medicineStore.add(vicks);
		medicineStore.add(sinarest);
		medicineStore.add(chywanprash);
		medicineStore.add(crocin);
		medicineStore.add(dolo);
		
	}
	public static void setMedicineType(Medicine medicine) {
		System.out.println("Please enter 1 for Ayurvedic 2 for Allppathic and 3 for Homeopathic");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			medicine.type = MedicineType.AYURVEDIC;
		case 2:
			medicine.type = MedicineType.ALLOPATHIC;
		case 3:
			medicine.type = MedicineType.HOMEOPATHIC;
		}
		sc.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		UserInterface userInterface = UserInterface.getInstance();
		int choice = 0;
		while(choice != 5) {
			choice = userInterface.showMainMenu();
			main.handleUserSelection(choice);
		}
		sc.close();
		/*
		 * MedicineStore medicineStore = new MedicineStore();
		 * 
		 * Vicks vicks = new Vicks(); vicks.price = 150; Sinarest sinarest = new
		 * Sinarest(); sinarest.price = 60; Chywanprash chywanprash = new Chywanprash();
		 * chywanprash.price = 200; Crocin crocin = new Crocin(); crocin.price = 50;
		 * Dolo dolo = new Dolo(); dolo.price = 20;
		 * 
		 * medicineStore.add(vicks); medicineStore.add(sinarest);
		 * medicineStore.add(chywanprash); medicineStore.add(crocin);
		 * medicineStore.add(dolo); UserInterface userInterface = new UserInterface();
		 * userInterface.print(medicineStore.getMedicineList());
		 * 
		 * medicineStore.remove(chywanprash); medicineStore.remove(crocin);
		 * medicineStore.remove(dolo);
		 * 
		 * System.out.println("After removing...");
		 * userInterface.print(medicineStore.getMedicineList());
		 * 
		 */
	}

}
