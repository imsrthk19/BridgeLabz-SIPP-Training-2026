public class UserNotFoundException (Exception e){
    String Message;
}

public class UserNotFoundException extends Exception{

    this.Message= Message;

    @Override
    public String getMessage(){
        return Message;
    }
}
