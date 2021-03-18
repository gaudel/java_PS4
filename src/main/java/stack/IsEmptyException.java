package stack;

public class IsEmptyException extends Exception {
	private String message;
	
	public IsEmptyException (String message){
	    this.message = message;
	}
	
	public String getMessage (){
	    return message;
	}
}
