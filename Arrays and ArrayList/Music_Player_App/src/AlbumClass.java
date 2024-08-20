import java.util.ArrayList;

public class AlbumClass {
    /* The program will have an Album class containing a list of songs.
    The albums will be stored in an ArrayList
    Songs from different albums can be added to the playlist and will appear in the list in the order they are added.
    */
    private String name;
    ArrayList<SongClass> songs;
    public AlbumClass(String name) {  // constructor
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<SongClass> getSongs() {
        return songs;
    }

    public void addsongs(SongClass song){
        songs.add(song);
    }

}
