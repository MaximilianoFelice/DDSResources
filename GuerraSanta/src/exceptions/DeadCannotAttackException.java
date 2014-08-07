package exceptions;

public class DeadCannotAttackException extends RuntimeException {
	
	public DeadCannotAttackException(String message){
		super(message);
	}

}
