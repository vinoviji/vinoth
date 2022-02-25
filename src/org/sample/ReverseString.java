package org.sample;

public class ReverseString {
	private void stuName() {
		System.out.println("vinoth");

	}

	private void stuId() {
		System.out.println("822714105045");

	}

	private void stuAdd() {
		System.out.println("no 15 south street,periyavalayam");

	}

	private void stuDOB() {
		System.out.println("20/04/1997");

	}

	private void stuGender() {
		System.out.println("male");

	}

	public static void main(String[] args) {
		String s1 = "vinoth";
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			char ch = s1.charAt(i);
			s2 = s2 + ch;

		}
		System.out.println(s2);
	}

}
