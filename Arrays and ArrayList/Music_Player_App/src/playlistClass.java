import java.util.LinkedList;
import java.util.ListIterator;

/*
Once the songs have been added to the playlist, create a menu of options to:-
    Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    List the songs in the playlist
    A song must exist in an album before it can be added to the playlist
    (so you can only play songs that you own).
    Hint:  To replay a song, consider what happened when we went back
    and forth from a city before we started tracking the direction we were going.
    As an optional extra, provide an option to remove the current
      song from the playlist (hint: listiterator.remove())
    */
public class playlistClass {
    private LinkedList<SongClass> songs;
    public playlistClass(){
        this.songs=new LinkedList<>();
    }
    public void addsongs(SongClass song){
        songs.add(song);
    }

    public void removesong(){
        ListIterator<SongClass> iterator =songs.listIterator();
        if (iterator.hasNext()){
            if (iterator.next()==getcurrentsong()){
                iterator.remove();
                return;
            }
        }
    }

    public void printplaylist(){
        System.out.println("playlist somgs are ::");
        for (SongClass song:songs) {
            System.out.println(song);
        }
    }

    public SongClass getcurrentsong(){
        return songs.isEmpty()?null:songs.getFirst();
    }

    public SongClass getpreviousSong(){
        return songs.size()<2?null:songs.get(1);
    }
}
