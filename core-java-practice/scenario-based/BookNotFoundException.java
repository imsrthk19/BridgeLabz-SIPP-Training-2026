public class BookNotFoundException extends Exception {
    int index;
    public BookNotFoundException(int index) {
        this.index = index;
    }

    @Override
    public String getMessage() {
        return "Invalid Book Index: " + index;
    }
} 