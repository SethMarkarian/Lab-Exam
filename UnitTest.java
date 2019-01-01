import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnitTest
{
    @Test
    public void testRandomPointSet() {
        RandomPointContainer rpc = new RandomPointContainer();
        int theAns = rpc.randomPointSet(4).size();
        int trueAns = 4;
        assertEquals(theAns, trueAns);
    }
    
    @Test
    public void randomPointSetSorted() {
        RandomPointContainer rpc = new RandomPointContainer();
        int theAns = rpc.randomPointSetSorted(4).size();
        int trueAns = 4;
        assertEquals(theAns, trueAns);
    }
    
    @Test
    public void testCompareToX() {
        ComparablePoint a = new ComparablePoint(0,1);
        ComparablePoint b = new ComparablePoint(1,2);
        int theAns = a.compareTo(b);
        int trueAns = -1;
        assertEquals(theAns, trueAns);
    }
    
    @Test
    public void testCompareToY() {
        ComparablePoint a = new ComparablePoint(0,1);
        ComparablePoint b = new ComparablePoint(0,2);
        int theAns = a.compareTo(b);
        int trueAns = -1;
        assertEquals(theAns, trueAns);
    }
    
    @Test
    public void testCompareToEqual() {
        ComparablePoint a = new ComparablePoint(0,1);
        ComparablePoint b = new ComparablePoint(0,1);
        int theAns = a.compareTo(b);
        int trueAns = 0;
        assertEquals(theAns, trueAns);
    }
    
    
}
