package sa.mycompany.age;

import sa.mycompany.excpetion.InvalidAgeException;

public class AgeCheck {
	public static void main(String[]args) {
		try {
			validateAge(18);
		} catch (InvalidAgeException e) {
			System.out.print("age must be over 18");
			e.printStackTrace();
		}
	}
	
	private static void validateAge(int age) throws InvalidAgeException {
		if(age< 18) {
			throw new InvalidAgeException("Age must be at least 18");
		}
	}
	
}
