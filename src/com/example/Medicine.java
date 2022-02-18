package com.example;

public abstract class Medicine {
	enum MedicineType {
		AYURVEDIC, ALLOPATHIC, HOMEOPATHIC;
	}

	String name;
	String brandName;
	int price;
	MedicineType type;

	@Override
	public String toString() {
		return "Medicine [name=" + name + ", brandName=" + brandName + ", price=" + price + ", type=" + type + "]";
	}

}
