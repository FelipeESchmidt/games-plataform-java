package games.platform.exceptions;

public class CantFindThisUserException extends Exception {
    
    private final String Message;
    
    public CantFindThisUserException(String message){
        this.Message = message;
    }
    
    /**
     * Get the exception's message
     * 
     * @return exception's message
     */
    @Override
    public String getMessage(){
        return this.Message;
    }
    
}