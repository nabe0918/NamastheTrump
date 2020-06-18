package corebasics;

public class Strings {

	public static void main(String[] args) {
	String s1 = "Bellam";
	String s2 = "Coming";
	s2 = s1.concat("soon");
	String s3 = "Naveen";
	String s4 = "Navin";
	
	System.out.println("The last name is: " +s1);
	System.out.println("The first name is: " +s2);
	System.out.println("The full name is: " +s1.concat(s3));
	System.out.println("The last name is: " +s1);
	System.out.println("The length of s1 is: " +s1.length());
	System.out.println("The substring of s2 is: " +s2.substring(6,10));
	System.out.println(s3.equals(s4));
	}

}
