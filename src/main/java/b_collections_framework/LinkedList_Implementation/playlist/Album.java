package b_collections_framework.LinkedList_Implementation.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private final String name;
    private final String artist;
    private final ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

//    In Album, use the findSong() method in addSong() and addToPlayList(String, LinkedList)
//    to check if a song exists before proceeding.

    //    has two parameters of type String (title of song),
//    double (duration of song) and returns a boolean.
//    Returns true if the song was added successfully or false otherwise.
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            return songs.add(new Song(title, duration));
        }
        return false;
    }

    //    has one parameter of type String (title of song) and returns a Song.
    //    Returns the Song if it exists, null if it doesn't exists.
    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    //    has two parameters of type int (track number of song in album)
    //    and LinkedList (the playlist) that holds objects of type Song,
    //    and returns a boolean.
    //    Returns true if it exists and it was added successfully using the track number, or false otherwise.
    public boolean addToPlayList(int track, LinkedList<Song> playlist) {
        if (track >= 1 && track <= songs.size()) {
            playlist.add(songs.get(track - 1));
            return true;
        }
        return false;
    }

    //    has two parameters of type String (title of song) and LinkedList (the playlist)
    //    that holds objects of type Song, and returns a boolean.
    //    Returns true if it exists and it was added successfully using the name of the song, or false otherwise.
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                playlist.add(song);
                return true;
            }
        }
        return false;
    }

}
