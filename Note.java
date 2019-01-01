import java.awt.Point;
public class Note extends Point
{
    private String lyric;
    protected int onset, duration, chromatic, diatonic;
    public Note() { //empty constructor
        lyric = "";
    }
    
    public Note(String l, int o, int d, int c, int di) { //constructor that assigns parameters to its respective values
        lyric = l;
        onset = o;
        duration = d;
        chromatic = c;
        diatonic = di;
    }
    
    public String toString() { //prints out contents of a note
        return "Lyric: " + lyric + ". Duration: " + duration + ". Chromatic: " + chromatic + ". Diatonic: " + diatonic;
    }
}
