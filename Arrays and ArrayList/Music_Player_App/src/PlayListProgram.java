import java.util.ArrayList;
import java.util.Scanner;

public class PlayListProgram {


        private static ArrayList<AlbumClass>  albums;
        private playlistClass play;
        private boolean playing;
        private static Scanner sc;

   public PlayListProgram() {
            this.albums = new ArrayList<>();
            this.play = new playlistClass();
            this.playing = false;
            this.sc = new Scanner(System.in);
        }

    public static void main(String[] args) {

            System.out.println("welcome to playlist ");
            while (true) {
                printmenu();
                String choice = sc.nextLine();
                run();
                switch (choice) {
                    case "1":
                        quit();
                        break;
                    case "2":
                        skipforward();
                        break;
                    case "3":
                        skipbackward();
                        break;
                    case "4":
                        Replay();
                        break;
                    case "5":
                        listsongs();
                        break;
                    case "6":
                        addsongsToPlaylist();
                        break;
                    case "7":
                        removesongsfromPlayList();
                        break;
                    default:
                        System.out.println("Invalid choice ,try again ");
                }
            }

        }



    public static void run () {
        AlbumClass album1 = new AlbumClass("ALBUM 1");
        album1.addsongs(new SongClass("song 1", 120));
        album1.addsongs(new SongClass("song 2", 10));
        album1.addsongs(new SongClass("song 3", 160));
        album1.addsongs(new SongClass("song 4", 90));
        albums.add(album1);

        AlbumClass album2 = new AlbumClass("Album 2");
        album2.addsongs(new SongClass("song 5", 110));
        album2.addsongs(new SongClass("song 6", 80));
        album2.addsongs(new SongClass("song 7", 210));
        album2.addsongs(new SongClass("song 8", 410));
        albums.add(album2);
    }
    public static void printmenu () {
        System.out.println("enter your choice ");
        System.out.println("1 - quit");
        System.out.println("2 - skipforward");
        System.out.println("3 - skipbackward");
        System.out.println("4 - Replay");
        System.out.println("5 - Listsongs");
        System.out.println("6 - addsongsToPlaylist");
        System.out.println(" 7 - removesongsfromPlayList");
    }
    public static void quit(){

    }
    public static void skipforward(){

    }
    public static void skipbackward(){

    }
    public static void Replay(){

    }
    public static void listsongs(){

    }

    public static void addsongsToPlaylist(){

    }
    public static void removesongsfromPlayList(){

    }



}
