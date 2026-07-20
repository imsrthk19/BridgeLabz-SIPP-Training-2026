interface StreamingService {

    void streamContent(String movie);

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Premium Plan");
    }
}

interface GamingService {

    void playGame(String game);

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Gold Plan");
    }
}

class SmartTV implements StreamingService, GamingService {

    String[] movies = {
            "Avengers",
            "Inception",
            "Interstellar",
            "Baahubali"
    };

    String[] games = {
            "FIFA",
            "Minecraft",
            "GTA V",
            "BGMI"
    };

    @Override
    public void streamContent(String movie) {
        System.out.println("Streaming Movie: " + movie);
    }

    @Override
    public void playGame(String game) {
        System.out.println("Playing Game: " + game);
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public void displayContent() {

        System.out.println("Available Movies:");
        for (String movie : movies) {
            streamContent(movie);
        }

        System.out.println("\nAvailable Games:");
        for (String game : games) {
            playGame(game);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        System.out.println("Subscription Details:");
        tv.showSubscriptionDetails();

        System.out.println("\nAvailable Content:");
        tv.displayContent();
    }
}