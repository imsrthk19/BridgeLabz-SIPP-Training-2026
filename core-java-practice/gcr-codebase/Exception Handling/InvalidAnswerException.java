public class InvalidAnswerException extends Exception {
    int index;
    public InvalidAnswerException(int index) {
        this.index = index;
    }
    @Override
    public String getMessage() {
        return "Invalid Answer Index: " + index;
    }
}