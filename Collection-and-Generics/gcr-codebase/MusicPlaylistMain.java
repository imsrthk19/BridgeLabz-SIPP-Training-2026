public class MusicPlaylistMain {
    public static void main(String[] args) {

        MusicPlaylistData m = new MusicPlaylistData();

        m.play("Massacre");
        m.play("Champagne");
        m.play("Blinding Lights");

        m.display();
    }
}