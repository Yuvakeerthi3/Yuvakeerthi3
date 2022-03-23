package org.app;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsInfo {

	public static void main(String[] args) {
		System.out.println("\t\t\t\t STUDENTS INFORMATION ");
		System.out.println();
		Scanner in = new Scanner(System.in);
		System.out.print("Total number of students  : ");
		int total = (Integer.parseInt(in.nextLine()));
		ArrayList<StudentsDetails> students = new ArrayList<StudentsDetails>();
		for (int i = 1; i <= total; i++) {
			StudentsDetails std = new StudentsDetails();
			System.out.print("NAME : ");
			std.setName(in.nextLine());
			System.out.print("ROLLNO   : ");
			std.setRollno(Integer.parseInt(in.nextLine()));
			System.out.print("AGE    : ");
			std.setAge(Integer.parseInt(in.nextLine()));
			System.out.print("GENDER : ");
			std.setGender(in.nextLine());
			students.add(std);
			System.out.println("~~~~~~~~`Student " + i + " " + "information entered successfully~~~~~~~");
			System.out.println();
		}
		System.out.println("+-------+-------+-------+-------+");
		System.out.println("|NAME\t|ROLLNO\t|AGE\t|GENDER\t|");
		System.out.println("+-------+-------+-------+-------+");
		for (int i = 0; i < students.size(); i++) {
			System.out.println("|" + students.get(i).getName() +"\t"+ "|" + students.get(i).getRollno() + "\t" + "|"
					+ students.get(i).getAge() + "\t" + "|" + students.get(i).getGender() + "\t" + "|");
			System.out.println("+-------+--------+-----+--------+");
		}
		int option = 0;
		do {
			
			System.out.println();
			System.out.println(" DO YOU WANT TO ADD OR REMOVE THE DETAILS?");
			System.out.println("\t\t1. Add Student\t\n\t\t2. remove Students\t\n\t\t3. Exit");
			System.out.println("Enter an option.....");
			option = in.nextInt();
			
			if (option == 1) {
				StudentsDetails std = new StudentsDetails();
				System.out.print("NAME : ");
				in.nextLine();
				std.setName(in.nextLine());
				System.out.print("ROLLNO   : ");
				std.setRollno(Integer.parseInt(in.nextLine()));
				System.out.print("AGE    : ");
				std.setAge(Integer.parseInt(in.nextLine()));
				System.out.print("GENDER : ");
				std.setGender(in.nextLine());
				students.add(std);
				System.out.println("~~~~~~~~~Individual details added successfully~~~~~~~~~");
				System.out.println();
				System.out.println("+------+-------+-------+-------+");
				System.out.println("|NAME\t|ROLLNO\t|AGE\t|GENDER\t|");
				System.out.println("+------+-------+-------+-------+");

				for (int i = 0; i < students.size(); i++) {
					System.out.println("|" + students.get(i).getName() +"\t"+ "|" + students.get(i).getRollno() + "\t"
							+ "|" + students.get(i).getAge() + "\t" + "|" + students.get(i).getGender() + "\t" + "|");
					System.out.println("+-------+-------+-----+---------+");
				}
			} else if (option == 2) {
				System.out.println("Enter the rollno you want to remove");
				int rno = in.nextInt();
				for (int k = 0; k < students.size(); k++) {
					if (students.get(k).getRollno() == rno)
						students.remove(k);
				}

				System.out.println("+-------+-------+-------+-------+");
				System.out.println("|NAME\t|ROLLNO\t|AGE\t|GENDER\t|");
				System.out.println("+-------+-------+-------+-------+");

				for (int i = 0; i < students.size(); i++) {
					System.out.println("|" + students.get(i).getName() + "\t" + "|" + students.get(i).getRollno() + "\t"
							+ "|" + students.get(i).getAge() + "\t" + "|" + students.get(i).getGender() + "\t" + "|");
					System.out.println("+-------+-------+-----+---------+");
				}

			}
			
			if (option == 3) {
				in.close();
				System.out.println(".........ALL THE DETAILS SUBMITTED.......");
			}
				else if(option>3)
				{
					System.out.println("Kindly enter the valid option");
			        System.out.println("Enter an option.....");
					option = in.nextInt();
				}

		} while (option < 3);

	}

	static class StudentsDetails {
		private int roll_no;
		private String name;
		private int age;
		private String gender;

		public int getRollno() {
			return roll_no;
		}

		public void setRollno(int rollno) {
			this.roll_no = rollno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name_) {
			this.name = name_;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age_) {
			this.age = age_;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender_) {
			this.gender = gender_;
		}

		
	}
}
