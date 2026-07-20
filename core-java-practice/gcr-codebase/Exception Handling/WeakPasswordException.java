public class WeakPasswordException extends Exception {
    String password;
    public WeakPasswordException(String Password){
        this.password = Password;
    }

    @Override
    public String getMessage(){
        return "Weak Password!\nPassword: " +password;
    }
}
