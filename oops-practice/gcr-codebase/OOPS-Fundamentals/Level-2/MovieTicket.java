public class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void display() {
        System.out.println("Movie: " + movieName + "\nSeat: " + seatNumber + "\nPrice: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket("Avengers: Doomsday", 10, 250);
        t.display();
        t.bookTicket(15, 300);
    }
}