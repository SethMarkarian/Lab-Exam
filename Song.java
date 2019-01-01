import java.awt.Point;
import java.util.*;
public class Song implements Work
{
    protected static ArrayList<Note> arr = new ArrayList<Note>();
    private ArrayList<Point> pts = new ArrayList<Point>();
    private String title = "Twinkle, twinkle, little star";
    
    public void pointSet() { //assigns points to pts from arr
        for(int i = 0; i < arr.size(); i++) {
            pts.add(new Point(arr.get(i).onset, arr.get(i).diatonic));
        }
    }
    
    public ArrayList maximalTranslatablePattern(Point u) { //adds mtps to arraylist
        ArrayList<Point> afterU = new ArrayList<Point>();
        for(int i = 0; i < pts.size(); i++) {
            int afterX = (pts.get(i).x) - u.x;
            int afterY = (pts.get(i).y) - u.y;
            afterU.add(new Point(afterX, afterY));
        }
        ArrayList<Point> ans = new ArrayList<Point>();
        for(int i = 0; i < pts.size(); i++) {
            for(int j = 0; j < afterU.size(); j++) {
                if(pts.get(i).x == afterU.get(j).x) {
                    ans.add(pts.get(i));
                }
            }
        }
        return ans;
    }
}
