package com.tnsif.encapsulation;

public class Student {

	
		int regNo;
		@Override
		public String toString() {
			return "Student [regNo=" + regNo + ", Name=" + Name + ", Deparatment=" + Deparatment + "]";
		}
		public int getRegNo() {
			return regNo;
		}
		public void setRegNo(int regNo) {
			this.regNo = regNo;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getDeparatment() {
			return Deparatment;
		}
		public void setDeparatment(String deparatment) {
			Deparatment = deparatment;
		}
		String  Name;
		String Deparatment;

	}


