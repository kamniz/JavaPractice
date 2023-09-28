package pl.globallogic.exercises.intermediate;

import java.util.ArrayList;
import java.util.LinkedList;

public class ex49 {
    public static class Album {
        private String name;
        private String artist;
        private SongList songs;

        public Album(String name, String artist) {
            this.name = name;
            this.artist = artist;
            this.songs = new SongList();
        }

        public boolean addSong(String title, double duration) {
            return songs.add(new Song(title, duration));
        }

        public Song findSong(String title) {
            return songs.findSong(title);
        }

        public Song findSong(int trackNumber) {
            return songs.findSong(trackNumber);
        }

        public boolean addToPlayList(String title, LinkedList<Song> playlist) {
            Song song = findSong(title);
            if (song != null) {
                return playlist.add(song);
            }
            System.out.println("The song " + title + " is not in this album");
            return false;
        }

        public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
            Song song = findSong(trackNumber);
            if (song != null) {
                return playlist.add(song);
            }
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (!songs.contains(song)) {
                songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index >= 0 && index < songs.size()) {
                return songs.get(index);
            }
            return null;
        }
    }

    public static class Song {
        private String title;
        private double duration;

        public Song(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

        public String getTitle() {
            return title;
        }

        public double getDuration() {
            return duration;
        }
    }

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        for (Song song : playList) {
            System.out.println("Playing: " + song.getTitle() + " - " + song.getDuration());
        }
    }
}

