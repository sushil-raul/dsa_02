package dsa_02;

import java.util.Scanner;
class Student{
	int roll;
	double DSA_mark;
	String name;
	void getdata() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		name=sc.nextLine();
		System.out.println("Enter Roll No:");
		roll=sc.nextInt();
		System.out.println("Enter DSA mark:");
		DSA_mark=sc.nextDouble();
		
	}
	void showdata()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+roll);
		System.out.println("Marks: "+DSA_mark);
	}
}
public class Q3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student[] st=new Student[5];
		for(int i=0;i<st.length;i++) {
			System.out.println("Enter details of student:"+(i+1));
			st[i]=new Student();
			st[i].getdata();
		}
		int high=0;
		for(int i=1;i<st.length;i++) {
			if(st[i].DSA_mark>st[high].DSA_mark) {
				high=i;
			}
		}
		System.out.println("\nStudent with highest mark is: ");
		st[high].showdata();
	}
}