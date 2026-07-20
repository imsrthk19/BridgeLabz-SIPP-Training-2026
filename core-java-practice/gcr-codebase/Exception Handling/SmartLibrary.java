public class SmartLibrary {
    String books[] = {"Java", "Python", null, "C++"};
    public int getBookLength(int index) throws Exception {
        try {
            return books[index].length();
        }
        // catch (ArrayIndexOutOfBoundsException e) {
        //     throw new BookNotFoundException(index);
        // }
        catch (NullPointerException e) {
            System.out.println("Book entry at index " + index + " is null");
            return -1;
        }
    }

    public static void main(String[] args) {
        SmartLibrary library = new SmartLibrary();
        try {
            System.out.println("Length: " + library.getBookLength(0));
            System.out.println("Length: " + library.getBookLength(2));
            System.out.println("Length: " + library.getBookLength(5));
        }

        // catch (BookNotFoundException e) {
        //     System.out.println(e.getMessage());
        //     e.printStackTrace();
        // }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}