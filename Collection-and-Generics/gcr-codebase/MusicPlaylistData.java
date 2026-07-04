import java.util.*;

public class MusicPlaylistData {

    LinkedList<String> list = new LinkedList<>();

    public void play(String song) {

        list.addFirst(song);

        if (list.size() > 10) {
            list.removeLast();
        }
    }

    public void search(String song) {
        System.out.println(list.contains(song));
    }

    public void display() {
        System.out.println(list);
    }
}