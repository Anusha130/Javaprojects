package com.java.Model;

public class Vehicle {
	static String vechname;
	static int vechprice;

	public static String getVechname() {
		try {
			return vechname;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vechname;
	}

	public void setVechname(String vechname) {
		this.vechname = vechname;
	}

	public static int getVechprice() {
		try {
			return vechprice;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vechprice;
	}

	public void setVechprice(int vechprice) {
		this.vechprice = vechprice;
	}

	public Vehicle(String vechname, int vechprice) {
		super();
		this.vechname = vechname;
		this.vechprice = vechprice;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle [vechname=" + vechname + ", vechprice=" + vechprice + "]";
	}

}
