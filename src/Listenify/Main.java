package Listenify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
        int currentIndex = 0;
        printMenu();
        System.out.println("Now Playing "+playlist.get(currentIndex).toString());
        playPlayList(playlist);

    }
    public static void playPlayList(List<Song> playList){
        Scanner sc = new Scanner(System.in);
        int curr = 0;
        boolean quit = false;
        while(!quit){
            int choice = sc.nextInt();
            switch (choice) {
                case 1: curr = curr + 1;
                        if(curr % playList.size() == 0) curr = 0;
                        System.out.println("Now Playing "+playList.get(curr).toString());
                        break;
                case 2: curr = curr - 1;
                        if(curr == -1) curr = 0;
                        System.out.println("Now Playing "+playList.get(curr).toString());
                        break;
                case 3: System.out.println("Now Playing "+playList.get(curr).toString());
                        break;
                case 4: Collections.shuffle(playList);
                        System.out.println("The Playlist has been shuffled!");
                        break;
                case 5: printMenu();
                        break;
                case 6: printPlayList(playList);
                        break;
                case 7: playList.remove(curr);
                        System.out.println("The Current Song has been Deleted");
                        break;
                case 8: quit = true;
                        break;
                default: System.out.println("Invalid Choice");
            }
        }
    }
    public static void printPlayList(List<Song> playList){
        for(Song song : playList){
            System.out.println(song.toString());
        }
    }
    public static void printMenu(){

        System.out.println("<<<<-------------------->>>>");
        System.out.println("1. Play the next Song");
        System.out.println("2. Play the previous Song");
        System.out.println("3. Repeat this Song");
        System.out.println("4. Shuffle the Playlist");
        System.out.println("5. Print the Menu");
        System.out.println("6. Print Playlist");
        System.out.println("7. Delete the current Song");
        System.out.println("8. Exit");
        System.out.println("<<<<-------------------->>>>");
        System.out.println("Enter Your Choice !");
    }
}
