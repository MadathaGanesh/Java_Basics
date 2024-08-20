
public class SongClass {
//    Create a Song class having Title and Duration for a song.
    private String songtitle;
    private double duration;


    public SongClass(String songtitle,double duration){
        this.songtitle=songtitle;
        this.duration=duration;
    }

    public double getDuration() {
        return duration;
    }

    public String getSongtitle() {
        return songtitle;
    }

    public String tostring(){
        return songtitle + " ( " + duration + " sec ) " ;
    }

}
