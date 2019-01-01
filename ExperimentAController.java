import java.util.*;
public class ExperimentAController
{
    int[] sizes = {1000, 2000, 3000, 4000};
    public ExperimentAController(int n) { //tests methods below
        long t1 = timeIntersection(n);
        long t2 = (int)timeIntersectionSorted(n);
        System.out.println("For size = " + n + ", timeIntersection = " + t1 + "ns");
        System.out.println("For size = " + n + ", timeIntersectionSorted = " + t2 + "ns");
    }

    public static void main(String[] args) { //main method
        ExperimentAController eac = new ExperimentAController(Integer.parseInt(args[0]));
    }

    public long timeIntersection(int n) { //time for intersection to run
        RandomPointContainer rpc1 = new RandomPointContainer();
        RandomPointContainer rpc2 = new RandomPointContainer();
        ArrayList<ComparablePoint> cp1 = rpc1.randomPointSet(n);
        ArrayList<ComparablePoint> cp2 = rpc2.randomPointSet(n);
        ArrayList<ComparablePoint> cp;
        long t0 = System.nanoTime();
        cp = rpc1.intersection(cp2);
        long t1 = System.nanoTime();
        return t1 - t0;
    }

    public long timeIntersectionSorted(int n) { //time for intersectionSorted to run
        RandomPointContainer rpc1 = new RandomPointContainer();
        RandomPointContainer rpc2 = new RandomPointContainer();
        ArrayList<ComparablePoint> cp1 = rpc1.randomPointSetSorted(n);
        ArrayList<ComparablePoint> cp2 = rpc2.randomPointSetSorted(n);
        ArrayList<ComparablePoint> cp;
        long t0 = System.nanoTime();
        cp = rpc1.intersectionSorted(cp2);
        long t1 = System.nanoTime();
        return t1 - t0;
    }
}
