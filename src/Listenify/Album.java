package Listenify;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName;
    private String artistName;
    private List<Song> songList;

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        songList = new ArrayList<>();
    }

    public Album(String albumName, String artistName, List<Song> songList) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songList = songList;
    }
    public Boolean findSong(String title){
        for(Song song : songList){
            if(song.getSongTitle().equals(title)){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
    public String addSong(String title , double duration){
        if(!findSong(title)){
            Song newSong = new Song(title,duration);
            songList.add(newSong);
            return "New song has been added in the song List !";
        }else{
            return "This song is already present in the song List !";
        }
    }
    public String addToPlaylist(List<Song> playList , int songNumber){
        int index = songNumber - 1;
        if(index < songList.size()){
            Song song = songList.get(index);
            playList.add(song);
            return "Song added successfully !";
        }
        return "No Song Found !";
    }
    public String addToPlaylist(List<Song> playList,String title){
        for(Song song : songList){
            if(song.getSongTitle().equals(title)){
                playList.add(song);
                return "Song added successfully !";
            }
        }
        return "No Song Found !";
    }
}
