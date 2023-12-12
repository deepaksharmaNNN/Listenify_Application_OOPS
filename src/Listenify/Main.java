package Listenify;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Album a1 = new Album("MoonChild Era","Diljit Dosanjh");
        a1.addSong("Champagne",3.02);
        a1.addSong("Lover",4.2);
        a1.addSong("Vibe",2.36);
        a1.addSong("Black and White", 4.2);

        Album a2 = new Album("Arijit Songs","Arijit Sing");
        a2.addSong("Apna Bna Le",3.4);
        a2.addSong("Agar Tum Sath Ho",5.3);
        a2.addSong("Uska Hi Bna", 4.5);
        a2.addSong("Chleya", 5.98);
        a2.addSong("Channa Mereya",3.4);
        a2.addSong("Khariyat",4.4);

        List<Song> playlist = new ArrayList<>();

        a1.addToPlaylist(playlist,1);
        a1.addToPlaylist(playlist,4);

        a2.addToPlaylist(playlist,"Apna Bna Le");
        a2.addToPlaylist(playlist,"Uska Hi Bna");
        a2.addToPlaylist(playlist,"Channa Mereya");

    }
}
