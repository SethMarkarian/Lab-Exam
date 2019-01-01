import java.awt.Point;
public class ComparablePoint extends Point
{
    int x, y;
    public ComparablePoint(int a, int b) { //constructor to make a new comparable point
        x = a;
        y = b;
    }
    
    public int compareTo(ComparablePoint q) { //allows to compare two comparable points
        if(x < q.x) {
            return -1;
        }
        else if(x > q.x) {
            return 1;
        }
        else if(y < q.y) {
            return -1;
        }
        else if(y > q.y) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
