package sa.mycompany.excpetion;

public class InvalidAgeException extends Exception {

	private String message;
	
	public InvalidAgeException(String m){
		message=m;
	}
}
