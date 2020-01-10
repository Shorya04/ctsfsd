package comm.ex;

public class InvalidNameException extends Throwable{
	
	private String message;
	public InvalidNameException(String message) {
		super(message);
	}
	}


